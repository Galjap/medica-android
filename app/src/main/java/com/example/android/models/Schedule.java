package com.example.android.models;

import java.util.List;

public class Schedule {
    Medication med;
    List<String> horarios;
    User user;
    String freq;

    public Schedule(Medication med, List<String> horarios, User user, String freq) {
        this.med = med;
        this.horarios = horarios;
        this.user = user;
        this.freq = freq;
    }

    public Medication getMed() {
        return med;
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public User getUser() {
        return user;
    }

    public String getFreq() {
        return freq;
    }
}
