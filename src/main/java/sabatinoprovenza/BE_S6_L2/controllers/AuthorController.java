package sabatinoprovenza.BE_S6_L2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sabatinoprovenza.BE_S6_L2.entities.Author;
import sabatinoprovenza.BE_S6_L2.payloads.AuthorPayload;
import sabatinoprovenza.BE_S6_L2.services.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @PostMapping
    public Author createAuthor(@RequestBody AuthorPayload payload) {
        return authorService.saveAuthor(payload);
    }

    @GetMapping("/{id}")
    public Author findAuthor(@PathVariable long id) {
        return authorService.findById(id);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable long id, @RequestBody AuthorPayload payload) {
        return authorService.updateAuthor(payload, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuthor(@PathVariable long id) {
        authorService.deleteAuthor(id);
    }
}
