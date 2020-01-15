package su.ibn.sweater.repositories;

import org.springframework.data.repository.CrudRepository;
import su.ibn.sweater.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag (String tag);
}
