package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.Exercise;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

    @Override
    Optional<Exercise> findById(Long id);
}
