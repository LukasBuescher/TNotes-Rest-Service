package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.ExerciseType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ExerciseTypeRepository extends CrudRepository<ExerciseType, Long> {

    @Override
    Optional<ExerciseType> findById(Long id);
}
