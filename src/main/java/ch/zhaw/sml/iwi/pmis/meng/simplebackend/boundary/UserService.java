package ch.zhaw.sml.iwi.pmis.meng.simplebackend.boundary;


import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.User;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository.UserRepository;

@Transactional
@RestController
public class UserService {

    @Autowired
    private UserRepository userRepository;
    

   
   //GET PUT POST USER
    
    @GetMapping(path = "/user/{id}")
    public User getEntry(@RequestParam("id") Long id) {        
        return userRepository.findById(id).get();
    }
   
    @PutMapping(path = "/user/{id}")
    public void updateEntry(@RequestBody User user, @RequestParam("id") Long id) {  
        user.setId(id);
        userRepository.save(user);
    }

    @PostMapping(path = "/user")
    public void addEntry(@RequestBody User user) {
        user.setId(null);
        userRepository.save(user);
    }
    

    
    
}
