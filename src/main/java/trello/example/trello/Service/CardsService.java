package trello.example.trello.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trello.example.trello.Repository.CardsRepository;

@Service
public class CardsService {

    @Autowired
    CardsRepository cardsRepository;
}
