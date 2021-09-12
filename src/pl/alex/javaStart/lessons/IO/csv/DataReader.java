package pl.alex.javaStart.lessons.IO.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DataReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int countFileLines(String fileName) {
        int lines = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {
            while (bufferedReader.readLine() != null) {
                lines++;
            }
            return lines - 1;
        } catch (IOException e) {
            System.err.println("Error while reading from the file!");
        }
        return lines;
    }

    public static void readFile(Client[] clients, String fileName) {

        try (
                FileReader reader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(reader);
        ) {
            String line = null;
            int lines = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (lines > 0) {
                    Client client = createClient(line);
                    clients[lines - 1] = client;
                }
                lines++;
            }
        } catch (IOException e) {
            System.err.println("Error during writing from the file");
        }
    }

    private static Client createClient(String line) {
        String[] data = line.split(",");
        int id = Integer.parseInt(data[0].trim());
        String name = data[1].trim();
        String surname = data[2].trim();
        String country = data[3].trim();
        double salary = Double.parseDouble(data[4].trim());
        return new Client(id, name, surname, country, salary);
    }

    public static Client[] createClients(String fileName) {
        return new Client[countFileLines(fileName)];
    }

    public static void getCountryFromUser(Client[] clients) {
        System.out.println("Insert country name: ");
        String country = scanner.nextLine();
        printFilteredList(clients, country);
        scanner.close();
    }

    private static void printFilteredList(Client[] clients, String country) {
        int count = amount(clients, country);
        if (count == 0) {
            System.out.println("No clients for country: " + country);
        }
        Client[] filteredList = new Client[count];
        copyToFiltered(clients, filteredList, country);
        printList(filteredList);
        System.out.println("Average value for client from " + country + " is " + getAverage(count, filteredList));
    }

    private static String getAverage(int count, Client[] filteredList) {
        double total = 0;
        for (Client client : filteredList) {
            total += client.getValue();
        }
        return String.valueOf(total / count);
    }

    private static void printList(Client[] filteredList) {
        for (Client c : filteredList) {
            System.out.println(c);
        }
    }

    private static void copyToFiltered(Client[] clients, Client[] filteredList, String country) {
        int count = 0;
        for (Client client : clients) {
            if (client.getCountry().equals(country)) {
                filteredList[count] = client;
                count++;
            }
        }
    }

    private static int amount(Client[] clients, String country) {
        int count = 0;
        for (Client client : clients) {
            if (client.getCountry().equals(country)) {
                count++;
            }
        }
        return count;
    }

    static void showClientWithBiggestPayment(Client[] clients) {
        double maxValue = clients[0].getValue();
        Client client = null;
        for (int i = 0; i < clients.length - 1; i++) {
            if (clients[i + 1].getValue() > maxValue) {
                maxValue = clients[i + 1].getValue();
                client = clients[i + 1];
            }
        }
        System.out.println("The most valuable client is " + client);
    }

}
