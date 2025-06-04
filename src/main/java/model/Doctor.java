package model;

public class Doctor extends Person{
    String speciality;
    public Doctor(String name, String speciality) {
        super(name);
        this.speciality = speciality;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor information");
        System.out.println("Name : " + getName());
        System.out.println("Speciality : " + speciality);
    }

    public String getSpeciality() {
        return speciality;
    }
}
