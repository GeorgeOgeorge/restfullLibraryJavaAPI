package george.restfulllibraryapi.repositories;

import george.restfulllibraryapi.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}