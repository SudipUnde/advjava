package day9;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"day9","day9_fourth"})
public class SpringAppConfig {
		@Bean
		public List<String> countries() {
			List<String>countryList = Arrays.asList("Bharat", "Bhutan", "Nepal");
			return countryList;
		}

}
