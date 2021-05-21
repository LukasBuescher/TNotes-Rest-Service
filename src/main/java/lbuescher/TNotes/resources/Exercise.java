package lbuescher.TNotes.resources;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Exercise{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int exerciseOrder;

    private String name;

    private int restingTime;

    private String note;

    @OneToMany
    @JoinTable(
            name= "exercise_trainingset",
            joinColumns = @JoinColumn(name="exercise_id"),
            inverseJoinColumns = @JoinColumn(name="trainingset_id")
    )
    private List<TrainingSet> trainingSets = new ArrayList<>();

    public Exercise(){}

    public Exercise(int exerciseOrder, String name, int restingTime) {
        this.exerciseOrder = exerciseOrder;
        this.name = name;
        this.restingTime = restingTime;
    }

    public Long getId() {
        return id;
    }

    public int getExerciseOrder() {
        return exerciseOrder;
    }

    public void setExerciseOrder(int exerciseOrder) {
        this.exerciseOrder = exerciseOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<TrainingSet> getTrainingSets() {
        return trainingSets;
    }

    public void addTrainingSet(TrainingSet trainingSet){
        this.trainingSets.add(trainingSet);
    }

    public int getRestingTime() {
        return restingTime;
    }

    public void setRestingTime(int restingTime) {
        this.restingTime = restingTime;
    }
}
