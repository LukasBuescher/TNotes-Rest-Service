package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.Exercise;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Repository to persist Exercise-Entities
 * @see lbuescher.TNotes.resources.Exercise
 * @author Lukas Büscher
 */
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

    /**
     * Returns 1 Exercise-Entity with the given id
     * @param id Id of the Entity to be returned
     * @return the Exercise-Entity corresponding to the id
     */
    @Override
    Optional<Exercise> findById(Long id);
}
