package lbuescher.TNotes.controllers;

import lbuescher.TNotes.repositories.RoutineRepository;
import lbuescher.TNotes.resources.Routine;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5000")
@RestController
public class RoutineController {

    private final RoutineRepository routineRepository;

    RoutineController(RoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    @GetMapping("/routines")
    List<Routine> all() {
        return (List<Routine>) routineRepository.findAll();
    }

    @GetMapping("/routines/{id}")
    Optional<Routine> routine(@PathVariable Long id) {
        return routineRepository.findById(id);
    }
}
