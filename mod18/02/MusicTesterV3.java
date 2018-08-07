/**
 * Desc: Tests Music object
 * Author: Aaron H
 * Date: 8-6-18
 */

import java.util.ArrayList;
import java.util.List;

public class MusicTesterV3
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

//        System.out.println("\n\n == Songs sorted by Title ==");
//        displaySongs(sortByTitle(music));
//
//        System.out.println("\n\n == Songs sorted by Year ==");
//        displaySongs(sortByYear(music));
//
//        System.out.println("\n\n == Songs sorted by Artist ==");
//        displaySongs(sortByArtist(music));

        music = sortByTitle(music);
        System.out.println("\n\n == Search for Title: Thriller ==");
        int indexTitle = searchTitle(music,"Thriller");
        if (indexTitle == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + music[indexTitle]);

        music = sortByArtist(music);
        System.out.println("\n\n == Search for Artist: Queen ==");
        int indexArtist = searchArtist(music,"Queen");
        if (indexArtist == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + music[indexArtist]);

        music = sortByYear(music);
        System.out.println("\n\n == Search for Year: 2005 ==");
        int indexYear = searchYear(music,2005);
        if (indexYear == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + music[indexYear]);



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

    //Returns Music array sorted by Title using Insertion
    private static Music[] sortByTitle(Music[] music)
    {
        Music[] output = new Music[music.length];

        for(int i = 0; i < music.length; i++)
        {
            Music nextMusic = music[i];
            int insertIndex = 0;
            int j = i;
            while(j > 0 && insertIndex == 0)
            {
                if(nextMusic.getTitle().compareTo(output[j-1].getTitle()) > 0)
                {
                    insertIndex = j;
                }
                else
                {
                    output[j] = output[j-1];
                }
                j--;
            }
            output[insertIndex] = nextMusic;
        }
        //displaySongs(output);
        return output;
    }

    //Returns Music array sorted by Year using Insertion
    private static Music[] sortByYear(Music[] music)
    {
        Music[] output = new Music[music.length];

        for(int i = 0; i < music.length; i++)
        {
            Music nextMusic = music[i];
            int insertIndex = 0;
            int j = i;
            while(j > 0 && insertIndex == 0)
            {
                if(nextMusic.getYear() < output[j-1].getYear())
                {
                    insertIndex = j;
                }
                else
                {
                    output[j] = output[j-1];
                }
                j--;
            }
            output[insertIndex] = nextMusic;
        }
        //displaySongs(output);
        return output;
    }

    //Returns Music array sorted by Artist using Insertion
    private static Music[] sortByArtist(Music[] music)
    {
        Music[] output = new Music[music.length];

        for(int i = 0; i < music.length; i++)
        {
            Music nextMusic = music[i];
            int insertIndex = 0;
            int j = i;
            while(j > 0 && insertIndex == 0)
            {
                if(nextMusic.getArtist().compareTo(output[j-1].getArtist()) > 0)
                {
                    insertIndex = j;
                }
                else
                {
                    output[j] = output[j-1];
                }
                j--;
            }
            output[insertIndex] = nextMusic;
        }
        //displaySongs(output);
        return output;
    }

    //Searches input array for music with title of title
    public static int searchTitle(Music[] input, String toFind)
    {
        int high = input.length;
        int low = -1;
        int probe;

        while (high - low > 1)
        {
            probe = (high + low) / 2;
            if(input[probe].getTitle().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
            }
        }
        if( (low >= 0) && (input[low].getTitle().compareTo(toFind)) == 0 )
        {
            return low;
        }
        else
        {
            return -1;
        }
    }

    //Searches input array for music with year of year
    public static int searchYear(Music[] input, int toFind)
    {
        int high = input.length;
        int low = -1;
        int probe;

        while (high - low > 1)
        {
            probe = (high + low) / 2;
            if(input[probe].getYear() < toFind)
            {
                high = probe;
            }
            else
            {
                low = probe;
            }
        }
        if( (low >= 0) && (input[low].getYear() == toFind ))
        {
            return low;
        }
        else
        {
            return -1;
        }
    }

    //Searches input array for music with artist of artist
    public static int searchArtist(Music[] input, String toFind)
    {
        int high = input.length;
        int low = -1;
        int probe;

        while (high - low > 1)
        {
            probe = (high + low) / 2;
            if(input[probe].getArtist().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
            }
        }
        if( (low >= 0) && (input[low].getArtist().compareTo(toFind)) == 0 )
        {
            return low;
        }
        else
        {
            return -1;
        }
    }
}
