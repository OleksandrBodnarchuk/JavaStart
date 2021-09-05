package pl.alex.javaStart.lessons.loops.hospital.model;

import java.util.Scanner;


public class Hospital {
    private final Scanner scanner = new Scanner(System.in);
    private final Patient[] patients = new Patient[1];
    private final int maxNumberOfPatients = patients.length;
    private int numberOfPatients = 0;

    public void createAndAddPatient() {
        Patient patient = createPatient();
        if (numberOfPatients >= maxNumberOfPatients) {
            System.out.println("Limit of patients reached.");
        } else {
            patients[numberOfPatients] = patient;
            numberOfPatients++;
        }

    }

    public void printPatientList() {
        for (int i = 0; i < numberOfPatients; i++) {
            System.out.println("Pacjent #" + (i+1) + ". " + patients[i].getFirstName() + " " + patients[i].getLastName() + " " + patients[i].getPesel()+"\n");
        }
    }

    private Patient createPatient() {
        System.out.println("Please enter name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter surname: ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter PESEL: ");
        String pesel = scanner.nextLine();
        return new Patient(firstName, lastName, pesel);
    }
}
