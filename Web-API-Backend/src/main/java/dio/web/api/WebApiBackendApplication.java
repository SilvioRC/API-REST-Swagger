package dio.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class WebApiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiBackendApplication.class, args);
	}
	
	
	

}
