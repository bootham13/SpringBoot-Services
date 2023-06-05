package com.chikara.restservices.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {

        Contact contact = new Contact();
        contact.setEmail("spasham@chikarahealthrecords.com");
        contact.setName("Spasham");
        contact.setUrl("https://www.chikarahealthrecords.com");

        Info info = new Info()
                .title("Hello User Application API")
                .version("1.0")
                .contact(contact)
                .description("This is a sample Hello user application using Spring Boot RESTful service with springdoc-openapi and OpenAPI 3.");


        return new OpenAPI().info(info);

    }
}
