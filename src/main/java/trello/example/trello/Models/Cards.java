package trello.example.trello.Models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
public class Cards {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id ;

    String Title ;

    String Description ;

    String Section ;


}
