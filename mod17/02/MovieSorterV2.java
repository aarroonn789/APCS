/**
 * Purpose: Tests and sorts MovieV2 objects
 *
 * Name: Aaron H
 * Date: 8-2-18
 */
public class MovieSorterV2
{
    public static void main(String[] args)
    {
        displayMovies(movies);
        System.out.println("Movies sorted by title in ascending order.");
        displayMovies(sortByTitle(movies, 1));
        System.out.println("Movies sorted by title in descending order.");
        displayMovies(sortByTitle(movies, 2));
        System.out.println("Movies sorted by year in ascending order.");
        displayMovies(sortByYear(movies, 1));
        System.out.println("Movies sorted by year in descending order.");
        displayMovies(sortByYear(movies, 2));
        System.out.println("Movies sorted by studio in ascending order.");
        displayMovies(sortByStudio(movies, 1));
        System.out.println("Movies sorted by studio in descending order.");
        displayMovies(sortByStudio(movies, 2));
    }

    private static MovieV2[] movies = {
            new MovieV2("Cars", 2006, "Disney/Pixar"),
            new MovieV2("WALL-E", 2008, "Disney/Pixar"),
            new MovieV2("Ratatouille",2007,"Pixar"),
            new MovieV2("Toy Story", 1995, "Disney/Pixar"),
            new MovieV2("Finding Nemo", 2003, "Disney/Pixar"),
            new MovieV2("Charlotte's web", 2006, "Paramount Pictures"),
            new MovieV2("The Land Before TIme", 1988, "Universal Pictures"),
            new MovieV2("101 Dalmatians", 1996, "Disney"),
            new MovieV2("Tangled", 2010, "Disney"),
            new MovieV2("Willy Wonka and the Chocolate Factory", 1971, "Wolper Pictures")
    };

    private static void displayMovies(MovieV2[] movies)
    {
        System.out.println(" == List of Movies ==");
        for (MovieV2 movieV2 : movies)
        {
            System.out.println(movieV2);
        }
        System.out.println();
    }

    private static MovieV2[] sortByTitle(MovieV2[] movies, int order)
    {
        MovieV2[] output = new MovieV2[movies.length];

        if(order == 1)
        {
            for(int i = 0; i < movies.length; i++)
            {
                MovieV2 nextMovie = movies[i];
                int insertIndex = 0;
                int j = i;
                while(j > 0 && insertIndex == 0)
                {
                    if(nextMovie.getTitle().compareTo(output[j-1].getTitle()) > 0)
                    {
                        insertIndex = j;
                    }
                    else
                    {
                        output[j] = output[j-1];
                    }
                    j--;
                }
                output[insertIndex] = nextMovie;
            }
        }
        else if (order == 2)
        {
            for(int i = 0; i < movies.length; i++)
            {
                MovieV2 nextMovie = movies[i];
                int insertIndex = 0;
                int j = i;
                while(j > 0 && insertIndex == 0)
                {
                    if(nextMovie.getTitle().compareTo(output[j-1].getTitle()) < 0)
                    {
                        insertIndex = j;
                    }
                    else
                    {
                        output[j] = output[j-1];
                    }
                    j--;
                }
                output[insertIndex] = nextMovie;
            }
        }

        return output;
    }

    private static MovieV2[] sortByYear(MovieV2[] movies, int order)
    {
        MovieV2[] output = new MovieV2[movies.length];

        if(order == 1)
        {
            for(int i = 0; i < movies.length; i++)
            {
                MovieV2 nextMovie = movies[i];
                int insertIndex = 0;
                int j = i;
                while(j > 0 && insertIndex == 0)
                {
                    if(nextMovie.getYear() > output[j-1].getYear())
                    {
                        insertIndex = j;
                    }
                    else
                    {
                        output[j] = output[j-1];
                    }
                    j--;
                }
                output[insertIndex] = nextMovie;
            }
        }
        else if (order == 2)
        {
            for(int i = 0; i < movies.length; i++)
            {
                MovieV2 nextMovie = movies[i];
                int insertIndex = 0;
                int j = i;
                while(j > 0 && insertIndex == 0)
                {
                    if(nextMovie.getYear() < output[j-1].getYear())
                    {
                        insertIndex = j;
                    }
                    else
                    {
                        output[j] = output[j-1];
                    }
                    j--;
                }
                output[insertIndex] = nextMovie;
            }
        }

        return output;
    }

    private static MovieV2[] sortByStudio(MovieV2[] movies, int order)
    {
        MovieV2[] output = new MovieV2[movies.length];

        if(order == 1)
        {
            for(int i = 0; i < movies.length; i++)
            {
                MovieV2 nextMovie = movies[i];
                int insertIndex = 0;
                int j = i;
                while(j > 0 && insertIndex == 0)
                {
                    if(nextMovie.getStudio().compareTo(output[j-1].getStudio()) > 0)
                    {
                        insertIndex = j;
                    }
                    else
                    {
                        output[j] = output[j-1];
                    }
                    j--;
                }
                output[insertIndex] = nextMovie;
            }
        }
        else if (order == 2)
        {
            for(int i = 0; i < movies.length; i++)
            {
                MovieV2 nextMovie = movies[i];
                int insertIndex = 0;
                int j = i;
                while(j > 0 && insertIndex == 0)
                {
                    if(nextMovie.getStudio().compareTo(output[j-1].getStudio()) < 0)
                    {
                        insertIndex = j;
                    }
                    else
                    {
                        output[j] = output[j-1];
                    }
                    j--;
                }
                output[insertIndex] = nextMovie;
            }
        }

        return output;
    }
}
