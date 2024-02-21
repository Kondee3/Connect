package me.kondee3.Bank.WebUser;

import org.springframework.beans.BeanUtils;
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
                    "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8");
            WebUser miranda = new WebUser(
                    "miranda",
                    "miranda@gmail.com",
                    LocalDate.of(1990, Month.MAY, 2),
                    "0b14d501a594442a01c6859541bcb3e8164d183d32937b851835442f69d5c94e");

            repository.saveAll(List.of(kondi, miranda));

        };
    }
}
