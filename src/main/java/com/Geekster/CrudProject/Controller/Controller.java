package com.Geekster.CrudProject.Controller;

import com.Geekster.CrudProject.Configration.Configration;
import com.Geekster.CrudProject.Student.Student;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")

public class Controller {
    @Autowired
    @Qualifier("Manish")
    Student student;

    @GetMapping("/student")

    public Student getData() {
        return student;
    }
}
