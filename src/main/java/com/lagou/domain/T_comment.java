package com.lagou.domain;

import lombok.Data;

@Data
public class T_comment {
    private Integer id;
    private String content;
    private String author;
    private Integer a_id;

    @Override
    public String toString() {
        return "T_comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", a_id=" + a_id +
                '}';
    }
}
