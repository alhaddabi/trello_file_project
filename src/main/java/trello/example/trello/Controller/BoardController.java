package trello.example.trello.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import trello.example.trello.Models.Board;
import trello.example.trello.RequestObject.GetBoardRequest;
import trello.example.trello.Service.BoardService;

import java.util.Date;

@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @PostMapping("board/api")
    public void saveBoard(@RequestBody GetBoardRequest boardRequest) {
        createBoard(boardRequest);
    }
    public void createBoard (GetBoardRequest boardRequest)
    {
        Board board = new Board();
        board.setTitle(boardRequest.getTitle());
        board.setSection(boardRequest.getSection());
        board.setList(boardRequest.getList());
        board.setCreatedDate(new Date());
        board.setUpdatedDate(new Date());
        board.setIsActive(true);
        boardService.saveBoard(board);
    }


}
