package com.example.everything.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student tzu = new Student(
                    "TZU",
                    "abc@qb3e",
                    LocalDate.of(1988, Month.JANUARY, 03)
            );
            Student yu = new Student(
                    "Yu",
                    "yu@qb3e",
                    LocalDate.of(2000, Month.JANUARY, 03)
            );

            studentRepository.saveAll(List.of(tzu,yu));
        };
    }
}
