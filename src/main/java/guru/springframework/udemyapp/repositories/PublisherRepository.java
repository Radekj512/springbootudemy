package guru.springframework.udemyapp.repositories;

import guru.springframework.udemyapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
