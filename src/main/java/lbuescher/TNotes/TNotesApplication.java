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
		return MockDataGenerator.generate(exerciseRepository, dayRepository, routineRepository, trainingSetRepository);
	}

}
