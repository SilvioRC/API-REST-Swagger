package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
	   return "Bem-Vindo ao meu Spring Boot WEB API" + "\n" ;
	}
	@GetMapping("/nome")
	public String nome() {
		return "Silvio Rodrigues Correia" + "\n";
		
	}
	
		
	}
	


