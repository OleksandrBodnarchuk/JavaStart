package pl.alex.javaStart.lessons.IO.csv;

import java.io.*;
import java.util.Scanner;


public class MainApp {
    private static final String FILE_NAME = "clients.csv";

    public static void main(String[] args) {
        Client[] clients = DataReader.createClients(FILE_NAME);
        DataReader.readFile(clients, FILE_NAME);
        DataReader.showClientWithBiggestPayment(clients);
        DataReader.getCountryFromUser(clients);

    }




}
