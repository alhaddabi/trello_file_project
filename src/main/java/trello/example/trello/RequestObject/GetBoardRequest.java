package trello.example.trello.RequestObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetBoardRequest {
    String Title ;
    String List ;
    String Section ;
}
