package lbuescher.TNotes.resources;

import javax.persistence.*;

@Entity
public class TrainingSet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int setOrder;

    private double plannedWeight;
    private double actualWeight;

    private int plannedReps;
    private int actualReps;

    private boolean asManyRepsAsPossible;

    private String note;

    public TrainingSet(){}

    public TrainingSet(int setOrder, double plannedWeight, int plannedReps, boolean asManyRepsAsPossible) {
        this.setOrder = setOrder;
        this.plannedWeight = plannedWeight;
        this.actualWeight = plannedWeight;
        this.plannedReps = plannedReps;
        this.actualReps = plannedReps;
        this.asManyRepsAsPossible = asManyRepsAsPossible;
    }

    public void updateSet(TrainingSet updatedSet) {
        this.setOrder = updatedSet.getSetOrder();
        this.plannedWeight = updatedSet.getPlannedWeight();
        this.actualWeight = updatedSet.getActualWeight();
        this.plannedReps = updatedSet.getPlannedReps();
        this.actualReps = updatedSet.getActualReps();
        this.asManyRepsAsPossible = updatedSet.isAsManyRepsAsPossible();
        this.note = updatedSet.getNote();
    }

    public Long getId() {
        return id;
    }

    public int getSetOrder() {
        return setOrder;
    }

    public void setSetOrder(int setOrder) {
        this.setOrder = setOrder;
    }

    public double getPlannedWeight() {
        return plannedWeight;
    }

    public void setPlannedWeight(double plannedWeight) {
        this.plannedWeight = plannedWeight;
    }

    public double getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(double actualWeight) {
        this.actualWeight = actualWeight;
    }

    public int getPlannedReps() {
        return plannedReps;
    }

    public void setPlannedReps(int plannedReps) {
        this.plannedReps = plannedReps;
    }

    public int getActualReps() {
        return actualReps;
    }

    public void setActualReps(int actualReps) {
        this.actualReps = actualReps;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isAsManyRepsAsPossible() {
        return asManyRepsAsPossible;
    }

    public void setAsManyRepsAsPossible(boolean asManyRepsAsPossible) {
        this.asManyRepsAsPossible = asManyRepsAsPossible;
    }
}
