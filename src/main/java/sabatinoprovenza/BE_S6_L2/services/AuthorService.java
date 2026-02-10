package sabatinoprovenza.BE_S6_L2.services;

import org.springframework.stereotype.Service;
import sabatinoprovenza.BE_S6_L2.entities.Author;
import sabatinoprovenza.BE_S6_L2.exceptions.NotFoundException;
import sabatinoprovenza.BE_S6_L2.payloads.AuthorPayload;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private List<Author> authors = new ArrayList<>();


    public List<Author> findAll() {
        return this.authors;
    }

    public Author saveAuthor(AuthorPayload payload) {
        Author newAuthor = new Author(payload.getNome(), payload.getCognome(), payload.getEmail(), payload.getDataDiNascita());
        this.authors.add(newAuthor);
        return newAuthor;
    }

    public Author findById(long id) {
        Author found = null;
        for (Author author : this.authors) {
            if (author.getId() == id)
                found = author;
        }
        if (found == null)
            throw new NotFoundException("L'autore con id: " + id + " non è stato trovato");
        return found;
    }

    public Author updateAuthor(AuthorPayload payload, long id) {
        Author found = this.findById(id);

        found.setNome(payload.getNome());
        found.setCognome(payload.getCognome());
        found.setEmail(payload.getEmail());
        found.setDataDiNascita(payload.getDataDiNascita());

        return found;
    }

    public void deleteAuthor(long id) {
        Author found = this.findById(id);
        this.authors.remove(found);
    }
}
