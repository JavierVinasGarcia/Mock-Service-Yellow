package com.esliceu.daw.blue.service.mockserviceyellow.nodes;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by tanin on 20/02/2019.
 */

public class Teacher {
    private String DNI, name, surname, phoneNum;


    private Set<Notification> notifications = new HashSet<>();

    public Teacher(){}


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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Set<Notification> getNotifications() {
        return notifications;
    }



    @Override
    public String toString() {
        return "teacher{" +
                ", DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", notifications=" + notifications +
                '}';
    }
}
