package org.example.spring_backend.board.model;

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

    public static class BoardResDto{
        private Long idx;
        private String title;
        private String contents;
    }

}
