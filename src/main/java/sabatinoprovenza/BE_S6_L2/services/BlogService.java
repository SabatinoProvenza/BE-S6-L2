package sabatinoprovenza.BE_S6_L2.services;

import org.springframework.stereotype.Service;
import sabatinoprovenza.BE_S6_L2.entities.Blog;
import sabatinoprovenza.BE_S6_L2.exceptions.NotFoundException;
import sabatinoprovenza.BE_S6_L2.payloads.BlogPayload;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
    private List<Blog> blogs = new ArrayList<>();

    public List<Blog> findAll() {
        return this.blogs;
    }

    public Blog saveBlog(BlogPayload payload) {
        Blog newBlog = new Blog(payload.getCategoria(), payload.getTitolo(), payload.getContenuto(), payload.getTempoDiLettura());
        this.blogs.add(newBlog);
        return newBlog;
    }

    public Blog findById(long id) {
        Blog found = null;
        for (Blog blog : this.blogs) {
            if (blog.getId() == id)
                found = blog;
        }
        if (found == null)
            throw new NotFoundException("Il blog con id: " + id + " non è stato trovato");
        return found;
    }

    public Blog updateBlog(long id, BlogPayload payload) {
        Blog found = this.findById(id);

        found.setCategoria(payload.getCategoria());
        found.setTitolo(payload.getTitolo());
        found.setContenuto(payload.getContenuto());
        found.setTempoDiLettura(payload.getTempoDiLettura());

        return found;
    }

    public void deleteBlog(long id) {
        Blog found = this.findById(id);
        this.blogs.remove(found);
    }


}
