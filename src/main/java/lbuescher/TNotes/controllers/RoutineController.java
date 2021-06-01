package lbuescher.TNotes.controllers;

import lbuescher.TNotes.repositories.RoutineRepository;
import lbuescher.TNotes.resources.Routine;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * RestController which handles Rest requests regarding Routines
 * @author Lukas Büscher
 */
@CrossOrigin(origins = "http://localhost:5000")
@RestController
public class RoutineController {

    private final RoutineRepository routineRepository;

    /** This Constructor initializes a RoutineController
     * @param routineRepository Repository in which the Routines are persisted
     */
    RoutineController(RoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    /**
     * This Method sends out all Routines within the routineRepository
     * @return Json-List of all Routines
     */
    @GetMapping("/routines")
    List<Routine> all() {
        return (List<Routine>) routineRepository.findAll();
    }

    /**
     * This Method returns one Routine via Rest
     * @param id of the requested Routine
     * @return Json of specified Routine
     */
    @GetMapping("/routines/{id}")
    Optional<Routine> routine(@PathVariable Long id) {
        return routineRepository.findById(id);
    }
}
