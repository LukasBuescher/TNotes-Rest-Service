package lbuescher.TNotes.controllers;

import lbuescher.TNotes.repositories.DayRepository;
import lbuescher.TNotes.resources.Day;
import lbuescher.TNotes.resources.Exercise;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * RestController which handles Rest requests regarding Days
 * @author Lukas Büscher
 */
@CrossOrigin(origins = "http://localhost:5000")
@RestController
public class DayController {

    private final DayRepository dayRepository;

    /** This Constructor initializes a DayController
     * @param dayRepository Repository in which the Days are persisted
     */
    DayController(DayRepository dayRepository){this.dayRepository = dayRepository;}

    /**
     * This Method returns all Exercises of a specified Day
     * @param id of the requested Day
     * @return Json-List of Exercises of one Day
     */
    @GetMapping("/days/{id}/exercises")
    List<Exercise> fullDay(@PathVariable Long id) {
        Optional<Day> day = dayRepository.findById(id);
        return day.get().getExercises();
    }
}
