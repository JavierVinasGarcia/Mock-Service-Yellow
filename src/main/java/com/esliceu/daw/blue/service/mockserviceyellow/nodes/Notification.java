package com.esliceu.daw.blue.service.mockserviceyellow.nodes;
import java.util.HashSet;
import java.util.Set;


public class Notification {

    private String date;
    private String time;
    private boolean itWasSent;
    private boolean isRead = false;

    private Set<Student> students = new HashSet<>();

    public Notification(){}

    public boolean isItWasSent() {
        return itWasSent;
    }

    public void setItWasSent(boolean itWasSent) {
        this.itWasSent = itWasSent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Set<Student> getStudents() {
        return students;
    }


    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }


    @Override
    public String toString() {
        return "notification{" +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", itWasSent=" + itWasSent +
                ", isRead=" + isRead +
                ", students=" + students +
                '}';
    }
}
