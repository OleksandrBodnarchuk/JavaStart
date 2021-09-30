package pl.alex.javaStart.lessons.stream.FOUR;

import java.util.List;
import java.util.stream.Collectors;

public class MusicCollection {

    public static void main(String[] args) {
        List<Song> songs = createSongList();
        printLine("Lączny czas piosenek POP na playliście: " + getTotalTimeForGenre(songs, Song.Genre.POP));
        printLine("Liczba piosenek Metalliki na playliście: " + songsCount(songs, "Metallica"));
        printLine("Piosenki bez POPu: ");
        getSongsWithount(songs,Song.Genre.POP);

    }

    private static void getSongsWithount(List<Song> songs, Song.Genre genre) {
         songs.stream()
                .filter(s->!s.getGenre().equals(genre))
                 .distinct()
                .forEach(System.out::println);
    }

    private static long songsCount(List<Song> songs, String author) {
        return songs.stream()
                .filter(s-> s.getTitle().equals(author))
                .count();
    }


    private static long getTotalTimeForGenre(List<Song> songs, Song.Genre genre) {
        return songs.stream()
                .filter(song -> song.getGenre().equals(genre))
                .mapToInt(Song::getLength)
                .sum();
    }

    private static List<Song> createSongList() {
        return List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );
    }

    private static void printLine(String s) {
        System.out.println(s);
    }
}
