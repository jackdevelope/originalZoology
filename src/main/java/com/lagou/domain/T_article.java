package com.lagou.domain;

import lombok.Data;
import com.lagou.domain.T_comment;
import java.util.List;

@Data
public class T_article {
    private Integer id;
    private String title;
    private String content;
    //对应多个评论
    private List<T_comment> commentList;

    @Override
    public String toString() {
        return "T_article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", commentList=" + commentList +
                '}';
    }
}
