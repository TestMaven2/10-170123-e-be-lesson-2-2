package com.example.ebelesson22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Position {

    @Autowired
    @Qualifier("pythonDeveloper")
    private Developer developer;

    public void printInfo() {
        System.out.println(developer);
    }
}