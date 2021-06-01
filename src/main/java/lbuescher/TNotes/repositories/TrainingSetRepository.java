package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.TrainingSet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Repository to persist TrainingSet-Entities
 * @see lbuescher.TNotes.resources.TrainingSet
 * @author Lukas Büscher
 */
public interface TrainingSetRepository extends CrudRepository<TrainingSet,Long> {

    /**
     * Returns 1 TrainingSet-Entity with the given id
     * @param id Id of the Entity to be returned
     * @return the TrainingSet-Entity corresponding to the id
     */
    @Override
    Optional<TrainingSet> findById(Long id);
}
