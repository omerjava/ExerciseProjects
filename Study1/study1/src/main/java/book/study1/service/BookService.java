package book.study1.service;

import book.study1.entity.Book;
import book.study1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return repository.findById(id);
    }

    public Book save(Book book) {
        System.out.println("book at service: " + book);

        return repository.save(book);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
