package ch.zhaw.sml.iwi.pmis.meng.simplebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;



@Data
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;

    @OneToMany
    private List<Catch> catchList = new ArrayList<>();
}