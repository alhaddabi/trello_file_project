package trello.example.trello.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trello.example.trello.Models.Board;
import trello.example.trello.Repository.BoardRepository;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;
    public void saveBoard(Board board) {
        boardRepository.save(board);
    }
    public List<Board> getBoard() {
        return boardRepository.findAll();
    }

}
