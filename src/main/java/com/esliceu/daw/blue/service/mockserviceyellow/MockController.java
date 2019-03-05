package com.esliceu.daw.blue.service.mockserviceyellow;

import com.esliceu.daw.blue.service.mockserviceyellow.nodes.Absence;
import com.esliceu.daw.blue.service.mockserviceyellow.nodes.Notification;
import com.esliceu.daw.blue.service.mockserviceyellow.nodes.Student;
import com.esliceu.daw.blue.service.mockserviceyellow.nodes.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MockController {
    @RequestMapping(method = RequestMethod.GET, value = "getTeachers")
    public List<Teacher> getStrin(){
        List<Teacher> teachers = new ArrayList<>();

        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        Absence absence1 = new Absence();
        absence1.setDate(date.format(dtfDate));
        absence1.setTime(time.format(dtfTime));
        absence1.setSubject("Desplegament");

        Absence absence2 = new Absence();
        absence2.setDate(date.format(dtfDate));
        absence2.setTime(time.format(dtfTime));
        absence2.setSubject("DIW");

        Student student1 = new Student();
        student1.setDNI("4845848468S");
        student1.setName("Benjamin");
        student1.setSurname("Cardona");

        Student student2 = new Student();
        student2.setDNI("4564678468S");
        student2.setName("Joan Guillem");
        student2.setSurname("Cabot");

        student1.getAbsences().add(absence1);
        student2.getAbsences().add(absence2);

        Notification notification1 = new Notification();
        notification1.setDate(date.format(dtfDate));
        notification1.setTime(time.format(dtfTime));
        notification1.setItWasSent(true);


        Notification notification2 = new Notification();
        notification2.setDate(date.format(dtfDate));
        notification2.setTime(time.format(dtfTime));
        notification2.setItWasSent(false);

        notification1.getStudents().add(student1);
        notification2.getStudents().add(student2);

        Teacher teacher = new Teacher();

        teacher.setDNI("45646969P");
        teacher.setName("Javier");
        teacher.setSurname("Vinasgarcia");
        teacher.setPhoneNum("654887548");

        Teacher teacher2 = new Teacher();

        teacher2.setDNI("45646969P");
        teacher2.setName("Javi2");
        teacher2.setSurname("Viñas2");
        teacher2.setPhoneNum("6548875485467");


        teacher.getNotifications().add(notification1);
        teacher2.getNotifications().add(notification2);

        teachers.add(teacher);
        teachers.add(teacher2);

        return teachers;

    }
}
