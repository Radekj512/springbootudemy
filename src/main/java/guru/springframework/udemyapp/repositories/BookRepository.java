package guru.springframework.udemyapp.repositories;

import guru.springframework.udemyapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
