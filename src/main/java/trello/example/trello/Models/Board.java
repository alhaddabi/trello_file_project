package trello.example.trello.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.List;

@Setter
@Getter
@Entity
@Data
@Table(name = "BoardTable")
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id ;


    String Title ;
    String List ;
    String Section ;

    @JoinColumn(name = "CardsID", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    List<Cards> cardsList;

}
