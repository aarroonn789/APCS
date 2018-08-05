/**
 * Purpose: Tests and sorts Movie objects
 *
 * Name: Aaron H
 * Date: 8-2-18
 */
public class MovieSorterV3
{
    public static void main(String[] args)
    {
        displayMovies(movies);
        System.out.println("Movies sorted by title in ascending order.");
        sortByTitle(movies, 1);
        displayMovies(movies);
        System.out.println("Movies sorted by title in descending order.");
        sortByTitle(movies, 2);
        displayMovies(movies);
        System.out.println("Movies sorted by year in ascending order.");
        sortByYear(movies, 1);
        displayMovies(movies);
        System.out.println("Movies sorted by year in descending order.");
        sortByYear(movies, 2);
        displayMovies(movies);
        System.out.println("Movies sorted by studio in ascending order.");
        sortByStudio(movies, 1);
        displayMovies(movies);
        System.out.println("Movies sorted by studio in descending order.");
        sortByStudio(movies, 2);
        displayMovies(movies);
    }

    private static Movie[] movies = {
            new Movie("Cars", 2006, "Disney/Pixar"),
            new Movie("WALL-E", 2008, "Disney/Pixar"),
            new Movie("Ratatouille",2007,"Pixar"),
            new Movie("Toy Story", 1995, "Disney/Pixar"),
            new Movie("Finding Nemo", 2003, "Disney/Pixar"),
            new Movie("Charlotte's web", 2006, "Paramount Pictures"),
            new Movie("The Land Before TIme", 1988, "Universal Pictures"),
            new Movie("101 Dalmatians", 1996, "Disney"),
            new Movie("Tangled", 2010, "Disney"),
            new Movie("Willy Wonka and the Chocolate Factory", 1971, "Wolper Pictures")
    };

    private static void displayMovies(Movie[] movies)
    {
        System.out.println(" == List of Movies ==");
        for (Movie movie : movies)
        {
            System.out.println(movie);
        }
        System.out.println();
    }

    private static void sortByTitle(Movie[] movies, int order)
    {
        int posMax;
        Movie tempMovie;

        if(order == 1)
        {
            for(int i = movies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for (int k = 0; k <= i; k++)
                {
                    if(movies[k].getTitle().compareTo(movies[posMax].getTitle()) < 0)
                    {
                        posMax = k;
                    }
                }

                tempMovie = movies[i];
                movies[i] = movies[posMax];
                movies[posMax] = tempMovie;
            }
        }
        else if (order == 2)
        {
            for(int i = movies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for (int k = 0; k <= i; k++)
                {
                    if(movies[k].getTitle().compareTo(movies[posMax].getTitle()) > 0)
                    {
                        posMax = k;
                    }
                }

                tempMovie = movies[i];
                movies[i] = movies[posMax];
                movies[posMax] = tempMovie;
            }
        }
    }

    private static void sortByYear(Movie[] movies, int order)
    {
        int posMax;
        Movie tempMovie;

        if(order == 1)
        {
            for(int i = movies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for (int k = 0; k <= i; k++)
                {
                    if(movies[k].getYear() > movies[posMax].getYear())
                    {
                        posMax = k;
                    }
                }

                tempMovie = movies[i];
                movies[i] = movies[posMax];
                movies[posMax] = tempMovie;
            }
        }
        else if (order == 2)
        {
            for(int i = movies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for (int k = 0; k <= i; k++)
                {
                    if(movies[k].getYear() < movies[posMax].getYear())
                    {
                        posMax = k;
                    }
                }

                tempMovie = movies[i];
                movies[i] = movies[posMax];
                movies[posMax] = tempMovie;
            }
        }
    }

    private static void sortByStudio(Movie[] movies, int order)
    {
        int posMax;
        Movie tempMovie;

        if(order == 1)
        {
            for(int i = movies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for (int k = 0; k <= i; k++)
                {
                    if(movies[k].getStudio().compareTo(movies[posMax].getStudio()) < 0)
                    {
                        posMax = k;
                    }
                }

                tempMovie = movies[i];
                movies[i] = movies[posMax];
                movies[posMax] = tempMovie;
            }
        }
        else if (order == 2)
        {
            for(int i = movies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for (int k = 0; k <= i; k++)
                {
                    if(movies[k].getStudio().compareTo(movies[posMax].getStudio()) > 0)
                    {
                        posMax = k;
                    }
                }

                tempMovie = movies[i];
                movies[i] = movies[posMax];
                movies[posMax] = tempMovie;
            }
        }
    }
}
