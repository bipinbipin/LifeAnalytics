package SeleniumWebDriver.repositories;

import SeleniumWebDriver.domain.Entry;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by David Franzel on 4/27/2017.
 */
public interface EntryRepository extends CrudRepository<Entry, Integer> {
}
