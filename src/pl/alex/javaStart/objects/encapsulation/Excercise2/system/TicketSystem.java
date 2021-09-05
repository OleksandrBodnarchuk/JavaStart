package pl.alex.javaStart.objects.encapsulation.Excercise2.system;

import pl.alex.javaStart.objects.encapsulation.Excercise2.model.Client;
import pl.alex.javaStart.objects.encapsulation.Excercise2.model.Movie;
import pl.alex.javaStart.objects.encapsulation.Excercise2.model.Ticket;

public class TicketSystem {
    private static int ticketCount;

    public Ticket createTicket(Movie movie, Client client){
        if (!movie.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else {
            ticketCount++;
            movie.decreaseFreeSeats();
            return new Ticket(ticketCount, client, movie);
        }
    }
    public void printTicketInformation(Ticket ticket){

        if (ticket!=null) {
            System.out.println(ticket.getTicketInfo());
        }
    }

    public void printSeatsInformation(Movie movie){
        System.out.println("Liczba pozostałych miejsc: " + movie.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + movie.getSoldTicketCount());
    }


}
