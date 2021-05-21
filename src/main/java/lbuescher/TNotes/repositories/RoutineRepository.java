package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.Routine;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoutineRepository extends CrudRepository<Routine, Long> {

    @Override
    Iterable<Routine> findAll();

    @Override
    Optional<Routine> findById(Long id);
}
