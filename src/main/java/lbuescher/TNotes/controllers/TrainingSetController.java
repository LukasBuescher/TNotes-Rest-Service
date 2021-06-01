package lbuescher.TNotes.controllers;

import lbuescher.TNotes.repositories.TrainingSetRepository;
import lbuescher.TNotes.resources.TrainingSet;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Rest Controller which sends Training
 * @see lbuescher.TNotes.resources.Day
 * @author Lukas Büscher
 */
@CrossOrigin(origins = "http://localhost:5000")
@RestController
public class TrainingSetController {

    private final TrainingSetRepository trainingSetRepository;

    /**
     * This Constructor creates a TrainingSetController
     * @param trainingSetRepository Repository in which the TrainingSets are persisted
     */
    TrainingSetController(TrainingSetRepository trainingSetRepository) {
        this.trainingSetRepository = trainingSetRepository;
    }

    /**
     * Rest method to save TrainingSets in Repository
     * @param newSet TrainingSet to be persisted
     * @param id of TrainingSet to be saved
     */
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
