package com.thamirestissot.assembly.model;

public class Agenda {
    private Integer id;
    private String subject;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public Agenda setSubject(String subject) {
        this.subject = subject;
        return this;
    }
}