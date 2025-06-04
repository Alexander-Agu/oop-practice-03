package service;

import model.Appointment;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;

public class HospitalService {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;

    public HospitalService(){
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
    }


    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    public void scheduleAppointment(String patientId, String doctorId, String dateTime){
        Patient patient = findPatient(patientId);
        Doctor doctor = findDoctor(doctorId);

        if (patient != null && doctor != null){
            Appointment appointment = new Appointment(patient, doctor, dateTime);
            patient.addToHistory(appointment);
        } else {
            System.out.println("Doctor or Patient was not found");
        }
    }

    public void markAppointmentAsComplete(String patientId, String appointmentId){
        Patient patient = findPatient(patientId);

        if (patient != null){
            for (Appointment app: patient.getHistory()){
                if (app.getAppointmentId().equalsIgnoreCase(appointmentId)) app.markAsCompleted();
            }
        } else {
            System.out.println("Patient was not found");
        }
    }

    public void listDoctors(){
        if (!doctors.isEmpty()){
            System.out.println("Listing Doctors \n");
            for(Doctor doc: doctors){
                doc.displayInfo();
            }
        } else {
            System.out.println("No doctors");
        }
    }


    public void listPatients(){
        if(!patients.isEmpty()){
            System.out.println("Listing Patients\n");
            for (Patient pat: patients){
                pat.displayInfo();
            }
        }
    }


    public void viewPatientHistory(String patientId){
        Patient patient = findPatient(patientId);

        if (patient != null){
            System.out.println("Patient History");
            for(Appointment appointment: patient.getHistory()){
                appointment.displayInfo();
            }
        } else {
            System.out.println("Patient not found");
        }
    }


    // HELPER METHODS
    private Doctor findDoctor(String doctorId){
        Doctor doctor = null;

        for(Doctor doc: doctors){
            if (doc.getId().equalsIgnoreCase(doctorId)) doctor = doc;
        }

        return doctor;
    }

    private Patient findPatient(String patientId){
        Patient patient = null;

        for (Patient pat: patients){
            if (pat.getId().equalsIgnoreCase(patientId)) patient = pat;
        }

        return patient;
    }
}
