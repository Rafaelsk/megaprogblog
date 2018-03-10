package org.megaprog.blog.model;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Post {

    private UUID id;
    private String title;
    private String content;
    private List<Comment> commentList;
}
