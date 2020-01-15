package su.ibn.homeWork.repositories;

import org.springframework.data.repository.CrudRepository;
import su.ibn.homeWork.domain.Country;

public interface CountryRepo extends CrudRepository<Country, Integer> {

}
