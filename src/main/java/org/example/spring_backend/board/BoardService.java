package org.example.spring_backend.board;

import lombok.RequiredArgsConstructor;
import org.example.spring_backend.board.model.BoardDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void register(BoardDto.RegDto dto){
        boardRepository.save(dto.toEntity());
    }
}
