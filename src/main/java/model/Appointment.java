package model;

public class Appointment {
    private int appont = 0;
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String dateTime;
    boolean isCompleted;

    public Appointment(Patient patient, Doctor doctor, String dateTime){
        appont++;
        appointmentId = "" + appont;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
        isCompleted = false;
    }

    public void markAsCompleted(){
        this.isCompleted = true;
    }

    public void displayInfo(){
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Date: " + dateTime);
        System.out.println("Is Completed: " + (isCompleted? "Yes": "No"));
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDateTime() {
        return dateTime;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
