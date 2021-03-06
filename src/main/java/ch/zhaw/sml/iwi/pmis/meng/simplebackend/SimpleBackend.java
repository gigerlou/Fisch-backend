package ch.zhaw.sml.iwi.pmis.meng.simplebackend;


import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.User;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleBackend {
  public static void main(String[] args) {
        SpringApplication.run(SimpleBackend.class, args);
    }
  
    @Autowired
    private UserRepository userRepository;
    

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            User u = new User();
            u.setLogin("test");
            userRepository.save(u);
          
            
        };
    }
    
}
