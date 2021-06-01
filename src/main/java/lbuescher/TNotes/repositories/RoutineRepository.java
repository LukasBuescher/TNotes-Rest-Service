package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.Routine;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Repository to persist Routine-Entities
 * @see lbuescher.TNotes.resources.Routine
 * @author Lukas Büscher
 */
public interface RoutineRepository extends CrudRepository<Routine, Long> {

    /**
     * Returns all Routine-Entities
     * @return the Routine-Entity corresponding to the id
     */
    @Override
    Iterable<Routine> findAll();

    /**
     * Returns 1 Routine-Entity with the given id
     * @param id Id of the Entity to be returned
     * @return the Routine-Entity corresponding to the id
     */
    @Override
    Optional<Routine> findById(Long id);
}
