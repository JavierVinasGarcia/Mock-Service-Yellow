package com.esliceu.daw.blue.service.mockserviceyellow.nodes;




public class Absence {
    private String date;
    private String time;
    private String subject;

    public Absence(){}

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "absence{" +
                ", date=" + date +
                ", subject='" + subject + '\'' +
                '}';
    }
}
