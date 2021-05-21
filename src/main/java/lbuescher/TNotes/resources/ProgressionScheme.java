package lbuescher.TNotes.resources;

public interface ProgressionScheme {

    public TrainingSet getNextSet();

    public Day getDay();

    public Day nextDay();

}
