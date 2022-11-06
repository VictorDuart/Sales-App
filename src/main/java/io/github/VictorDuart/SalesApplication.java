package io.github.VictorDuart;

import io.github.VictorDuart.model.entity.Client;
import io.github.VictorDuart.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClientRepository repository){
        return args -> {
            Client client = Client.builder().cpf("08225024613").name("Victor").build();
            repository.save(client);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class, args);
    }
}
