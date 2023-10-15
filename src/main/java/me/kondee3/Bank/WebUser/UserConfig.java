package me.kondee3.Bank.WebUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){

        return args -> {
            WebUser kondi = new WebUser(
                    "kondi",
                    "smyrakkonrad@gmail.com",
                    LocalDate.of(2000, Month.JULY, 5),
                    "password");
            WebUser miranda = new WebUser(
                    "miranda",
                    "miranda@gmail.com",
                    LocalDate.of(1990, Month.MAY, 2),
                    "password");

            repository.saveAll(List.of(kondi, miranda));

        };
    }
}
