package org.megaprog.blog.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Comment {
    private UUID id;
    private String title;
    private String text;
}
