package org.example.spring_backend.board.model;

import lombok.Builder;
import lombok.Getter;

public class BoardDto {
    @Getter
    public static class RegDto{
        private String title;
        private String contents;

        public Board toEntity(){
            return Board.builder()
                    .title(this.title)
                    .contents(this.contents)
                    .build();
        }
    }
    @Builder
    @Getter
    public static class BoardResDto{
        private Long idx;
        private String title;
        private String contents;

        public static BoardResDto from(Board entity){
            return BoardResDto.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .contents(entity.getContents())
                    .build();
        }
    }

}
