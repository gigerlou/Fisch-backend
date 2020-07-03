package ch.zhaw.sml.iwi.pmis.meng.simplebackend.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Data
@Entity
public class Catch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private String weather;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lasteUpdated;
    
}