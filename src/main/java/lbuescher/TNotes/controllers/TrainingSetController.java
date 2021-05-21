package lbuescher.TNotes.controllers;

import lbuescher.TNotes.repositories.TrainingSetRepository;
import lbuescher.TNotes.resources.TrainingSet;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5000")
@RestController
public class TrainingSetController {

    private final TrainingSetRepository trainingSetRepository;

    TrainingSetController(TrainingSetRepository trainingSetRepository) {
        this.trainingSetRepository = trainingSetRepository;
    }

    @PutMapping("/trainingsets/{id}")
    TrainingSet updateSet(@RequestBody TrainingSet newSet, @PathVariable Long id) {
        Optional<TrainingSet> trainingSet = trainingSetRepository.findById(id);
        if(trainingSet.isPresent()){
           trainingSet.get().updateSet(newSet);
           return trainingSetRepository.save(trainingSet.get());
        }else {
           return trainingSetRepository.save(newSet);
        }
    }

}
