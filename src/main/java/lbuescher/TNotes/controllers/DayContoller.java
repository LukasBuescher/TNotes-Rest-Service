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

@CrossOrigin(origins = "http://localhost:5000")
@RestController
public class DayContoller{

    private final DayRepository dayRepository;

    DayContoller(DayRepository dayRepository){this.dayRepository = dayRepository;}

    @GetMapping("/days/{id}/exercises")
    List<Exercise> fullDay(@PathVariable Long id) {
        Optional<Day> day = dayRepository.findById(id);
        return day.get().getExercises();
    }
}
