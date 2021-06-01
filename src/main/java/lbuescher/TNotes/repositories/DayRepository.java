package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.Day;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Repository to persist Day-Entities
 * @see lbuescher.TNotes.resources.Day
 * @author Lukas Büscher
 */
public interface DayRepository extends CrudRepository<Day, Long> {

    /**
     * Returns 1 Entity with the given id
     * @param id Id of the Entity to be returned
     * @return the Day-Entity corresponding to the id
     */
    @Override
    Optional<Day> findById(Long id);
}
