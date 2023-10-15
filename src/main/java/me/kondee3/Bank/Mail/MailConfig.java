package me.kondee3.Bank.Mail;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class MailConfig {
    @Bean
    CommandLineRunner mailRunner(MailRepository repository){

        return args -> {
            Mail mail1 = new Mail(
                    "smyrakkonrad@gmail.com",
                    "jan@gmail.com",
                    LocalDate.of(2000, Month.JULY, 5),
                    "title",
                    "Very Interesting Content");


            repository.saveAll(List.of(mail1));

        };
    }
}
