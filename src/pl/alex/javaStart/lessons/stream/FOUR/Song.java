package pl.alex.javaStart.lessons.stream.FOUR;

import java.util.Objects;

public class Song {
    private String author;
    private String title;
    private int length;
    private Genre genre;

    public Song(String author,  int length,String title, Genre genre) {
        this.author = author;
        this.title = title;
        this.length = length;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return length == song.length && Objects.equals(author, song.author) && Objects.equals(title, song.title) && genre == song.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, length, genre);
    }

    @Override
    public String toString() {
        return title + " - " + author + " " + length + "sec, " + genre;
    }

    public enum Genre {
        ROCK, RAP, POP, METAL;

            }

}
