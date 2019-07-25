package guru.springframework.udemyapp.repositories;

import guru.springframework.udemyapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
