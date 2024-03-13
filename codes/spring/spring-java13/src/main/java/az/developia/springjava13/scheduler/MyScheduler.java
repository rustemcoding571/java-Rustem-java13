package az.developia.springjava13.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class MyScheduler {

	//@Scheduled(fixedRate = 1000)
	public void doIt() {
		System.out.println("Ixtar");
	}
}
