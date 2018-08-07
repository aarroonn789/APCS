/**
 * Desc: Tests Music object
 * Author: Aaron H
 * Date: 8-6-18
 */

import java.util.ArrayList;
import java.util.List;

public class MusicTesterV1
{
    private static Music[] music = {
            new Music("Thriller", 1982, "Michael Jackson"),
            new Music("Rolling in the Deep", 2011, "Adele"),
            new Music("Bohemian Rhapsody",1975, "Queen"),
            new Music("Another One Bites the Dust", 1980, "Queen"),
            new Music("SAD!", 2018, "XXXTENTACION"),
            new Music("In My Feelings", 2018,"Drake"),
            new Music("Feels Good Inc.", 2005, "Gorillaz"),
            new Music("Stressed Out", 2015, "Twenty One Pilots"),
            new Music("In the End", 2000, "Linkin Park"),
            new Music("Bad Romance", 2009, "Lady Gaga")
    };

    public static void main(String[] args)
    {
        System.out.println(" == Songs == ");
        displaySongs(music);

        System.out.println("\n\n Search by Title: In te End");
        displaySongs(searchTitle(music, "In te End"));

        System.out.println("\n\n Search by Title: In the End");
        displaySongs(searchTitle(music, "In the End"));

        System.out.println("\n\n Search by Year: 2018");
        displaySongs(searchYear(music, 2018));

        System.out.println("\n\n Search by Artist: Queen");
        displaySongs(searchArtist(music, "Queen"));
    }

    //Displays songs
    private static void displaySongs(Music[] songs)
    {
        System.out.printf( "%-29s %-4s   %-20s %n", "Title",  "Year" , "Artist");

        for(Music song : songs)
        {
            System.out.println(song);
        }
    }

    //Method searches array for particular song title
    private static Music[] searchTitle(Music[] songs, String title)
    {
        List<Music> output = new ArrayList<Music>();
        for(Music song : songs)
        {
            if(song.getTitle().equals(title))
            {
                output.add(song);
            }
        }
        return output.toArray(new Music[0]);
    }

    //Method that searches the array for year released (the output should list all songs found from that year)
    private static Music[] searchYear(Music[] songs, int year)
    {
        List<Music> output = new ArrayList<Music>();
        for(Music song : songs)
        {
            if(song.getYear() == year)
            {
                output.add(song);
            }
        }
        return output.toArray(new Music[0]);
    }

    //a method that searches the array for the name of the artist (the output should list all songs performed by that artist)
    private static Music[] searchArtist(Music[] songs, String artist)
    {
        List<Music> output = new ArrayList<Music>();
        for(Music song : songs)
        {
            if(song.getArtist().equals(artist))
            {
                output.add(song);
            }
        }
        return output.toArray(new Music[0]);
    }
}
