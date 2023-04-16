package com.Geekster.CrudProject.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student {

    private String firstName;
    private String lastName;

//    public Student(String manish) {

//    }
}
