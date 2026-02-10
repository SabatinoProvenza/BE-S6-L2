package sabatinoprovenza.BE_S6_L2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sabatinoprovenza.BE_S6_L2.entities.Blog;
import sabatinoprovenza.BE_S6_L2.payloads.BlogPayload;
import sabatinoprovenza.BE_S6_L2.services.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @PostMapping
    public Blog creaBlog(@RequestBody BlogPayload payload) {
        return blogService.saveBlog(payload);
    }

    @GetMapping("/{id}")
    public Blog findById(@PathVariable long id) {
        return blogService.findById(id);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable long id, @RequestBody BlogPayload payload) {
        return blogService.updateBlog(id, payload);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable long id) {
        blogService.deleteBlog(id);
    }


}
