/**
 * Purpose: Tests and sorts Movie objects
 *
 * Name: Aaron H
 * Date: 8-2-18
 */
public class MovieSorterV4
{
    public static void main(String[] args)
    {
        displayMovies(movies);

        System.out.println("Movies sorted by title in ascending order.");
        sortByTitle(movies, 0, movies.length - 1);
        displayMovies(movies);

        System.out.println("Movies sorted by year in ascending order.");
        sortByYear(movies, 0, movies.length - 1);
        displayMovies(movies);

        System.out.println("Movies sorted by studio in ascending order.");
        sortByStudio(movies, 0, movies.length - 1);
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

    private static void sortByTitle(Movie[] movies, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        int mid = (low + high) / 2;

        sortByTitle(movies, low, mid);
        sortByTitle(movies, mid + 1, high);

        mergeByTitle(movies, low, mid, high);
    }

    private static void mergeByTitle(Movie[] movies, int low, int mid, int high)
    {
        Movie[] temp = new Movie[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high)
        {
            if( i > mid )
            {
                temp[n] = movies[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = movies[i];
                i++;
            }
            else if( movies[ i ].getTitle().compareTo(movies[ j ].getTitle()) > 0 )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ ) {
            movies[k] = temp[k - low];
        }
    }

    private static void sortByYear(Movie[] movies, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        int mid = (low + high) / 2;

        sortByYear(movies, low, mid);
        sortByYear(movies, mid + 1, high);

        mergeByYear(movies, low, mid, high);
    }

    private static void mergeByYear(Movie[] movies, int low, int mid, int high)
    {
        Movie[] temp = new Movie[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high)
        {
            if( i > mid )
            {
                temp[n] = movies[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = movies[i];
                i++;
            }
            else if( movies[ i ].getYear() < movies[ j ].getYear())
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ ) {
            movies[k] = temp[k - low];
        }
    }


    private static void sortByStudio(Movie[] movies, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        int mid = (low + high) / 2;

        sortByStudio(movies, low, mid);
        sortByStudio(movies, mid + 1, high);

        mergeByStudio(movies, low, mid, high);
    }

    private static void mergeByStudio(Movie[] movies, int low, int mid, int high)
    {
        Movie[] temp = new Movie[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high)
        {
            if( i > mid )
            {
                temp[n] = movies[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = movies[i];
                i++;
            }
            else if( movies[ i ].getStudio().compareTo(movies[ j ].getStudio()) > 0 )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ ) {
            movies[k] = temp[k - low];
        }
    }

}
