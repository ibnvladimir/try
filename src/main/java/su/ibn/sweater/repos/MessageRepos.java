package su.ibn.sweater.repos;

import org.springframework.data.repository.CrudRepository;
import su.ibn.sweater.domain.Message;

public interface MessageRepos extends CrudRepository<Message, Integer> {
}