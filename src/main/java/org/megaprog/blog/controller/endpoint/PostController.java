package org.megaprog.blog.controller.endpoint;

import org.megaprog.blog.controller.service.PostService;
import org.megaprog.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController("posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("{id}")
    public Post getPost(@PathVariable UUID id) {
        return postService.findOne(id);
    }

    @PatchMapping
    public Post updatePost(@RequestBody Post post) {
        return postService.update(post);
    }
}
