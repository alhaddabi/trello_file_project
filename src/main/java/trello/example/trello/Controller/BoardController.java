package trello.example.trello.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trello.example.trello.Models.Board;
import trello.example.trello.RequestObject.GetBoardRequest;
import trello.example.trello.ResponseObject.GetBoardResponse;
import trello.example.trello.Service.BoardService;

import java.util.*;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    BoardService boardService;

//    @PostMapping("board/api")
//    public void saveBoard(@RequestBody GetBoardRequest boardRequest) {
//        createBoard(boardRequest);
//    }

//
//    @RequestMapping("board/get")
//    public List<Board> getBoard() {
//        return boardService.getBoard();
//    }



    private final Map<String, GetBoardResponse> boards = new HashMap<>();

    @PostMapping
    public ResponseEntity<GetBoardResponse> createBoard(@RequestBody GetBoardRequest request) {
        // Create a new Board object with the provided title
        Board newBoard = new Board();
        newBoard.setTitle(request.getTitle());

        // Save the new board in the service
        Board createdBoard = boardService.createBoard(newBoard);

        // Prepare the response body
        GetBoardResponse response = new GetBoardResponse();
        response.setBoardId(String.valueOf(createdBoard.getBoardId()));
        response.setName(createdBoard.getTitle());
        response.setColumns(getDefaultColumns());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Helper method to return default columns as String[]
    private String[] getDefaultColumns() {
        return new String[] { "To do", "In progress", "Done" };
    }

    }


