package com.example.demo.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentsConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Alan = new Student(23,"Mariam", "Mariam@gmail.com", LocalDate.of(2000, Month.APRIL, 4));
            Student Alex = new Student(20,"Alex", "alex@gmail.com", LocalDate.of(2003, Month.MARCH, 4));
            repository.saveAll(List.of(Alan, Alex));
        };

    }
}
