package com.microservices.course.udemy;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class User {

    private Integer id;

    @Size(min = 2)
    private String name;

    @Past
    private LocalDate birthday;

}
