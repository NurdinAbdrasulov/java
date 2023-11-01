package kg.kstu.teaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TeachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachingApplication.class, args);
	}

}
