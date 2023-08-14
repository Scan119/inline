package codesuda.inLine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class InLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(InLineApplication.class, args);
	}

}
