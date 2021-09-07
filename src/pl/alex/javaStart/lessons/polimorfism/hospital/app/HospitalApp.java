package pl.alex.javaStart.lessons.polimorfism.hospital.app;

import pl.alex.javaStart.lessons.polimorfism.hospital.model.Doctor;
import pl.alex.javaStart.lessons.polimorfism.hospital.model.Hospital;
import pl.alex.javaStart.lessons.polimorfism.hospital.model.Nurse;
import pl.alex.javaStart.lessons.polimorfism.hospital.model.Person;

public class HospitalApp {
    public static void main(String[] args) {
        Person doctor = new Doctor("Bob","Schneider",15000,3000);
        Person nurse1 = new Nurse("Agata","Zbyszek",9000,15);
        Person nurse2 = new Nurse("Agniezka","Kotek",8500,25);
        Hospital hospital = new Hospital();
        hospital.addPerson(doctor);
        hospital.addPerson(nurse1);
        hospital.addPerson(nurse2);
        hospital.getInfo();
    }
}
