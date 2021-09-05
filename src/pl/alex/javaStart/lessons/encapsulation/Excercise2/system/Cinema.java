package pl.alex.javaStart.lessons.encapsulation.Excercise2.system;

import pl.alex.javaStart.lessons.encapsulation.Excercise2.model.Client;
import pl.alex.javaStart.lessons.encapsulation.Excercise2.model.Movie;
import pl.alex.javaStart.lessons.encapsulation.Excercise2.model.Ticket;

public class Cinema {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Omen", "horror", 72, 128, 16, 72);
        Client client1 = new Client("Jan", "Kowalski", 18);
        Client client2 = new Client("Anna", "Zalewska", 19);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1,client1);
        Ticket ticket2 = ticketSystem.createTicket(movie1,client2);

        System.out.println("Sprzedane bilety");
        ticketSystem.printTicketInformation(ticket1);
        ticketSystem.printTicketInformation(ticket2);

        ticketSystem.printSeatsInformation(movie1);
    }
}