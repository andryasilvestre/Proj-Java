package com.PI04.PI04.controller;

import com.PI04.PI04.model.User;
import com.PI04.PI04.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequestMapping("/User")
@RestController
public class UserController {

   @Autowired
    private UserRepository userRepository;

    public class ResourceNotFoundException extends Exception {
        public ResourceNotFoundException(String message){
            super(message);
        }

   @GetMapping("")
   public List<User> getUser() {
       return userRepository.findAll();
   }

   @GetMapping("/{id}")
   public ResponseEntity<User> getUserById (@PathVariable(value = "id") Integer id) throws ResourceNotFoundException{
       User user = userRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException ( "Usuário não encontrado para o id :: " +id));

       return ResponseEntity.ok().body(user);
   }

   @PostMapping("")
   public User createUser(@RequestBody User user) {
       return userRepository.save(user);
   }

   @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value="id") Integer id, @RequestBody User userDetails) throws ResourceNotFoundException {
       User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException( "Usuário não encontrado para o id :: " +id));

       user.setId(user.getId());
       user.setEmail(user.getEmail());
       user.setFirstName(user.getFirstName());
       user.setLastName(user.getLastName());
       user.setBirthDate(user.getBirthDate());
       user.setCity(user.getCity());
       user.setState(user.getState());
       user.setBalance(user.getBalance());

       final User updatedUser = userRepository.save(user);
       return ResponseEntity.ok(updatedUser);
   }

   @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteBook(@PathVariable(value = "id") Integer id) throws ResourceNotFoundException {
       User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado para esse id ::" +id));

       userRepository.delete(user);
       Map<String, Boolean> response = new HashMap<>();
       response.put("Deletado", Boolean.TRUE);
       return response;
   }


    }
}
