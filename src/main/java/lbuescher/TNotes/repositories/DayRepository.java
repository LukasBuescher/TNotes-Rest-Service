package lbuescher.TNotes.repositories;

import lbuescher.TNotes.resources.Day;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DayRepository extends CrudRepository<Day, Long> {

    @Override
    Optional<Day> findById(Long id);
}
