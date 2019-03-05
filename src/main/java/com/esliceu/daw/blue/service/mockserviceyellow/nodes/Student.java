package com.esliceu.daw.blue.service.mockserviceyellow.nodes;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.HashSet;
import java.util.Set;



public class Student {
    private String DNI;
    private String name;
    private String surname;

    @JsonProperty
    private Set<Absence> absences = new HashSet<>();

    public Student(){}

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Absence> getAbsences() {
        return absences;
    }



    @Override
    public String toString() {
        return "student{" +
                ", DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", absences=" + absences +
                '}';
    }
}


