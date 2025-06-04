import model.Doctor;
import model.Patient;
import service.HospitalService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalService hospitalService = new HospitalService();

        while (true){
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("add doc")){
                System.out.println("Enter name");
                String name = scanner.nextLine();

                System.out.println("Speciality");
                String speciality = scanner.nextLine();

                Doctor doctor = new Doctor(name, speciality);
                hospitalService.addDoctor(doctor);
                System.out.println("Doctor added \n");

            } else if(input.equalsIgnoreCase("add pat")){
                System.out.println("Enter name");
                String name = scanner.nextLine();

                System.out.println("Enter Age");
                int age = scanner.nextInt();

                Patient patient = new Patient(name, age);

                hospitalService.addPatient(patient);

            } else if (input.equalsIgnoreCase("schedule")){
                System.out.println("Enter patientId");
                String patientId = scanner.nextLine();

                System.out.println("Enter doctorId");
                String doctorId = scanner.nextLine();

                System.out.println("Enter dateTime");
                String dateTime = scanner.nextLine();

                hospitalService.scheduleAppointment(patientId, doctorId, dateTime);

            } else if (input.equalsIgnoreCase("complete")){
                System.out.println("Enter patientId");
                String patientId = scanner.nextLine();

                System.out.println("Enter appointmentId");
                String appointmentId = scanner.nextLine();

                hospitalService.markAppointmentAsComplete(patientId, appointmentId);
            } else if (input.equalsIgnoreCase("view doc")){
                System.out.println("Enter doctorId");
                String doctorId = scanner.nextLine();

                hospitalService.viewDoctor(doctorId);

            } else if (input.equalsIgnoreCase("view pat")){
                System.out.println("Enter patientId");
                String patientId = scanner.nextLine();

                hospitalService.viewPatientHistory(patientId);

            } else if(input.equalsIgnoreCase("list doctors")){
                hospitalService.listDoctors();

            } else if(input.equalsIgnoreCase("list patients")){
                hospitalService.listPatients();

            } else if (input.equalsIgnoreCase("exit")){
                break;
            } else {
                System.out.println("Try again");
            }
        }

        System.out.println("\nProgram stopped");
    }
}
