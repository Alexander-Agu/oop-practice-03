package model;

import java.util.ArrayList;

public class Patient extends Person{
    private int age;
    private ArrayList<Appointment> history;


    public Patient(String name, int age) {
        super(name);
        this.age = age;
        history = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient Information");
        System.out.println("Name : " + getName());
        System.out.println("Age : " + age + " years");
    }

    // METHODS
    public void addToHistory(Appointment appointment){
        this.history.add(appointment);
    }

    public ArrayList<Appointment> getHistory() {
        return history;
    }
}
