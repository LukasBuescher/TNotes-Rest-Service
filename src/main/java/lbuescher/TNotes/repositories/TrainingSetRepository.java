package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.TrainingSet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrainingSetRepository extends CrudRepository<TrainingSet,Long> {

    @Override
    Optional<TrainingSet> findById(Long id);
}
