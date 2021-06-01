package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.ExerciseType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Repository to persist ExerciseType-Entities
 * @see lbuescher.TNotes.resources.ExerciseType
 * @author Lukas Büscher
 */
public interface ExerciseTypeRepository extends CrudRepository<ExerciseType, Long> {

    /**
     * Returns 1 ExerciseType-Entity with the given id
     * @param id Id of the Entity to be returned
     * @return the ExerciseType-Entity corresponding to the id
     */
    @Override
    Optional<ExerciseType> findById(Long id);
}
