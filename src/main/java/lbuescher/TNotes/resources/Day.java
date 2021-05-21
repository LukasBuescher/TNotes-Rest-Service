package lbuescher.TNotes.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
public class Day{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @JsonIgnore
    private Calendar date;

    private String dateString;

    private String note;

    @OneToMany
    @JoinTable(
            name = "day_exercise",
            joinColumns = @JoinColumn(name = "day_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id"))
    private List<Exercise> exercises = new ArrayList<>();

    public Day(){}

    public Day(Calendar date){
        this.date = date;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/YYYY");
        this.dateString = format1.format(date.getTime());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public String getDateString() {return dateString;};

    public void setDate(Calendar date) {
        this.date = date;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void addExercise(Exercise exercise){
        this.exercises.add(exercise);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
