package lbuescher.TNotes.resources;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Routine{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany
    @JoinTable(
            name= "routine_day",
            joinColumns = @JoinColumn(name="routine_id"),
            inverseJoinColumns = @JoinColumn(name="day_id")
    )
    private List<Day> days = new ArrayList<>();

    public Routine(){}

    public Routine(String name){
        this.name = name;
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

    public List<Day> getDays() {
        return days;
    }

    public void addDay(Day day){
        this.days.add(day);
    }
}
