package org.megaprog.blog.controller.endpoint;

import org.megaprog.blog.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.megaprog.blog.util.Constants.*;

@RestController(value = "/")
public class BlogController {

    @GetMapping(value = "test", produces = MIME_MEDIA_TYPE_JSON, consumes = MIME_MEDIA_TYPE_JSON)
    public Test getProjects() {
        Test test = new Test();
        test.setGreetings("Hello with Lombok");
        return test;
    }
}
