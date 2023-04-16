package com.Geekster.CrudProject.Configration;

import com.Geekster.CrudProject.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration

public class Configration {


    @Bean("Manish")
    public  Student getData() {
        return new Student("Manish", "Parkhi");
    }

        @Bean("prasad")
        @Lazy
        public  Student allData(){
            return new Student("prasad","ramteke");

    }
}
