package pl.alex.javaStart.objects.encapsulation.Excercise2.model;

public class Ticket {
    private int id;
    private Client client;
    private Movie movie;

    public Ticket(int id, Client client, Movie movie) {
        this.id = id;
        this.client = client;
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getTicketInfo(){
     return this.id + " | " + this.client.getFullName()+
             " | " + this.movie.getFullInfo();
    }
}
