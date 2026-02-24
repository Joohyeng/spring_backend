package org.example.spring_backend.board;

import lombok.RequiredArgsConstructor;
import org.example.spring_backend.board.model.Board;
import org.example.spring_backend.board.model.BoardDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;


    public void register(BoardDto.RegDto dto){
        boardRepository.save(dto.toEntity());
    }

    public List<BoardDto.BoardResDto> list(){
        List<Board> boardList = boardRepository.findAll();
        return boardList.stream().map(BoardDto.BoardResDto::from).toList();
    }
}
