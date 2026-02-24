package org.example.spring_backend.board;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.spring_backend.board.model.BoardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
@CrossOrigin(
        origins = "http://localhost:5173/",
        allowCredentials = "true"
        )
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/reg")
    public ResponseEntity register(@RequestBody BoardDto.RegDto dto){
        boardService.register(dto);

        return ResponseEntity.ok("성공");
    }

    @PostMapping("/list")
    public ResponseEntity list(){
        List<BoardDto.BoardResDto> dto = boardService.list();

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/read/{idx}")
    public ResponseEntity read(@PathVariable Long idx){
        BoardDto.BoardResDto dto = boardService.read(idx);

        return ResponseEntity.ok(dto);
    }

}
