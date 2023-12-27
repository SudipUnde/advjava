package example.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"rest_api", "example"})
@EnableJpaRepositories(basePackages = "rest_api")//Used to enable scanning of JPA Repositories
@EntityScan(basePackages = "rest_api")//Used to enable scanning of JPA Entities (@Entity)
public class SpringRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestProjectApplication.class, args);
		//This is used to kick start the embedded tomcat.
	}

}
