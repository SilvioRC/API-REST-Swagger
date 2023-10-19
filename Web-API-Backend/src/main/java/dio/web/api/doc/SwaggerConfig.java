package dio.web.api.doc;
/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//import java.util.Arrays;
//import java.util.HashSet;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean

	public Docket api() {

	return new Docket(DocumentationType.SWAGGER_2)

	.select()

	.apis(RequestHandlerSelectors.any())

	.paths(PathSelectors.any())

	.build();

	}
	
}


/* Código Original
 * 
 * package dio.web.api.doc;
//import java.util.Arrays;
//import java.util.HashSet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
//import org.springdoc.ui.SwaggerIndexTransformer;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "My REST API", version = "1.2.6",
description = "My OpenAPIDefinition description"),
    servers = { @Server(url = "/my-api", description = "Default URL")})
public class SwaggerConfig {
	
	@Bean
	  public OpenAPI springBlogPessoalOpenAPI() {
	    return new OpenAPI()
	        .info(new Info()
	            .title("Primeiro Projeto com Swagger")
	            .description(" - Documentando API Rest com Swagger usando Spring Boot Framework 3.0.2")
	            .version("v0.0.1")
	            .license(new License()
	                .name("Web Project with Spring Boot Web")
	                .url("https://github.com/marcelovieiradesousa/spring-boot"))
	            .contact(new Contact()
	                .name("Marcelo Vieira")
	                .url("https://www.linkedin.com/in/marcelo-vieira-sousa/")
	                .email("marcelovieira.tec@gmail.com")))
	        .externalDocs(new ExternalDocumentation()
	            .description("My Github")
	            .url("https://github.com/marcelovieiradesousa"));
	  }
}

     */
