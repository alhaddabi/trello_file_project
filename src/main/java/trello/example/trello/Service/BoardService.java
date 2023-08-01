package trello.example.trello.Service;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trello.example.trello.Models.Board;
import trello.example.trello.Repository.BoardRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public Board createBoard(Board board) {
        // Save the board using the BoardRepository
        return boardRepository.save(board);
    }
}


