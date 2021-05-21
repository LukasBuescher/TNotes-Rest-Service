package lbuescher.TNotes;

import lbuescher.TNotes.repositories.DayRepository;
import lbuescher.TNotes.repositories.ExerciseRepository;

import lbuescher.TNotes.repositories.RoutineRepository;
import lbuescher.TNotes.repositories.TrainingSetRepository;
import lbuescher.TNotes.resources.Day;
import lbuescher.TNotes.resources.Exercise;
import lbuescher.TNotes.resources.Routine;
import lbuescher.TNotes.resources.TrainingSet;
import org.h2.server.web.WebServlet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.GregorianCalendar;

@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class)
public class TNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TNotesApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
		registration.addUrlMappings("/h2/*");
		return registration;
	}

	@Bean
	public CommandLineRunner demo(ExerciseRepository exerciseRepository, DayRepository dayRepository, RoutineRepository routineRepository, TrainingSetRepository trainingSetRepository){
		return (args) -> {
			Routine abroutine = new Routine("A B Plan");

			Day tuesday = new Day(new GregorianCalendar(2020, Calendar.OCTOBER, 4 ));
			Day wednesday = new Day(new GregorianCalendar(2020, Calendar.OCTOBER, 6));

			Exercise deadlift = new Exercise(1,"Deadlift",120);
			Exercise overheadpress = new Exercise(2,"Overheadpress",90);
			Exercise hexdeadlift = new Exercise(3,"Hexbar Deadlift", 120);
			Exercise rows = new Exercise(4,"Seated Rows",60);
			Exercise tricep_pushdown = new Exercise(5,"Tricep Pushdowns",60);

			Exercise squat = new Exercise(1,"Squat",120);
			Exercise benchpress = new Exercise(2,"Benchpress",90);
			Exercise chin_ups = new Exercise(3,"Chin Ups",60);

			TrainingSet dl1 = new TrainingSet(1,107.5,3,false);
			TrainingSet dl2 = new TrainingSet(2,107.5,3,false);
			TrainingSet dl3 = new TrainingSet(3,107.5,3,false);
			TrainingSet dl4 = new TrainingSet(4,107.5,3,false);
			TrainingSet dl5 = new TrainingSet(5,107.5,3,true);

			TrainingSet ohp1 = new TrainingSet(1,27.5,8,false);
			TrainingSet ohp2 = new TrainingSet(2,27.5,8,false);
			TrainingSet ohp3 = new TrainingSet(3,27.5,8,false);

			TrainingSet hdl1 = new TrainingSet(1,87.5,10,false);
			TrainingSet hdl2 = new TrainingSet(2,87.5,10,false);
			TrainingSet hdl3 = new TrainingSet(3,87.5,10,false);

			TrainingSet r1 = new TrainingSet(1,40,15,false);
			TrainingSet r2 = new TrainingSet(2,40,15,false);
			TrainingSet r3 = new TrainingSet(3,40,15,true);

			TrainingSet tp1 = new TrainingSet(1,10,15,false);
			TrainingSet tp2 = new TrainingSet(2,10,15,false);
			TrainingSet tp3 = new TrainingSet(3,10,15,true);

			TrainingSet s1 = new TrainingSet(1,65,5,false);
			TrainingSet s2 = new TrainingSet(2,65,5,false);
			TrainingSet s3 = new TrainingSet(3,65,5,true);

			TrainingSet bp1 = new TrainingSet(1,47.5,5,false);
			TrainingSet bp2 = new TrainingSet(2,47.5,5,false);
			TrainingSet bp3 = new TrainingSet(3,47.5,5,true);

			TrainingSet cu1 = new TrainingSet(1,33,5,false);
			TrainingSet cu2 = new TrainingSet(2,33,5,false);
			TrainingSet cu3 = new TrainingSet(3,33,5,true);

			abroutine.addDay(tuesday);
			abroutine.addDay(wednesday);

			tuesday.addExercise(deadlift);
			tuesday.addExercise(overheadpress);
			tuesday.addExercise(hexdeadlift);
			tuesday.addExercise(rows);
			tuesday.addExercise(tricep_pushdown);

			wednesday.addExercise(squat);
			wednesday.addExercise(benchpress);
			wednesday.addExercise(chin_ups);

			deadlift.addTrainingSet(dl1);
			deadlift.addTrainingSet(dl2);
			deadlift.addTrainingSet(dl3);
			deadlift.addTrainingSet(dl4);
			deadlift.addTrainingSet(dl5);

			overheadpress.addTrainingSet(ohp1);
			overheadpress.addTrainingSet(ohp2);
			overheadpress.addTrainingSet(ohp3);

			hexdeadlift.addTrainingSet(hdl1);
			hexdeadlift.addTrainingSet(hdl2);
			hexdeadlift.addTrainingSet(hdl3);

			tricep_pushdown.addTrainingSet(tp1);
			tricep_pushdown.addTrainingSet(tp2);
			tricep_pushdown.addTrainingSet(tp3);

			rows.addTrainingSet(r1);
			rows.addTrainingSet(r2);
			rows.addTrainingSet(r3);

			squat.addTrainingSet(s1);
			squat.addTrainingSet(s2);
			squat.addTrainingSet(s3);

			benchpress.addTrainingSet(bp1);
			benchpress.addTrainingSet(bp2);
			benchpress.addTrainingSet(bp3);

			chin_ups.addTrainingSet(cu1);
			chin_ups.addTrainingSet(cu2);
			chin_ups.addTrainingSet(cu3);

			trainingSetRepository.save(dl1);
			trainingSetRepository.save(dl2);
			trainingSetRepository.save(dl3);
			trainingSetRepository.save(dl4);
			trainingSetRepository.save(dl5);

			trainingSetRepository.save(ohp1);
			trainingSetRepository.save(ohp2);
			trainingSetRepository.save(ohp3);

			trainingSetRepository.save(tp1);
			trainingSetRepository.save(tp2);
			trainingSetRepository.save(tp3);

			trainingSetRepository.save(hdl1);
			trainingSetRepository.save(hdl2);
			trainingSetRepository.save(hdl3);

			trainingSetRepository.save(cu1);
			trainingSetRepository.save(cu2);
			trainingSetRepository.save(cu3);

			trainingSetRepository.save(s1);
			trainingSetRepository.save(s2);
			trainingSetRepository.save(s3);

			trainingSetRepository.save(bp1);
			trainingSetRepository.save(bp2);
			trainingSetRepository.save(bp3);

			trainingSetRepository.save(r1);
			trainingSetRepository.save(r2);
			trainingSetRepository.save(r3);

			exerciseRepository.save(squat);
			exerciseRepository.save(benchpress);
			exerciseRepository.save(rows);
			exerciseRepository.save(hexdeadlift);
			exerciseRepository.save(tricep_pushdown);
			exerciseRepository.save(deadlift);
			exerciseRepository.save(overheadpress);
			exerciseRepository.save(chin_ups);

			dayRepository.save(tuesday);
			dayRepository.save(wednesday);

			routineRepository.save(abroutine);
		};
	}

}
