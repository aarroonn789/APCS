/**
 * Name: Aaron Harabedian
 * Date: 8-1-18
 * Description: Tests "Candidate" class
 */

import java.util.ArrayList;
import java.util.List;

public class ElectionTesterV6
{
    public static void main(String[] args)
    {
        //Array with 5 candidate objects
        List<Candidate> candidates = new ArrayList<Candidate>();

        candidates.add(new Candidate("Woodrow Wilson", 6296284));
        candidates.add(new Candidate("Theodore Roosevelt", 4122721));
        candidates.add(new Candidate("William Taft", 3486242));
        candidates.add(new Candidate("Eugene Debs", 901551));
        candidates.add(new Candidate("Eugene Chafin", 208156));

        printCandidateData(candidates);
        System.out.println("\n\n");
        printElectionResults(candidates);

        System.out.println("\n == Woodrow Wilson changed to Aaron Harabedian == \n");
        changeName(candidates, "Woodrow Wilson", "Aaron Harabedian");
        printElectionResults(candidates);

        System.out.println("\n == Aaron Harabedian's votes changed to 10,000,000 == \n");
        changeVotes(candidates, "Aaron Harabedian", 10000000);
        printElectionResults(candidates);

        System.out.println("\n == Aaron Harabedian has been changed back to Woodrow Wilson == \n");
        changeNameAndVotes(candidates, "Aaron Harabedian", "Woodrow Wilson", 6296284);
        printElectionResults(candidates);

        System.out.println("\n == Aaron Harabedian has been added to position 3 == \n");
        insertCandidateByIndex(candidates, 3, "Aaron Harabedian", 5000000);
        printElectionResults(candidates);

        System.out.println("\n == Aaron Harabedian has been added before Theodore Roosevelt == \n");
        insertCandidateByName(candidates, "Theodore Roosevelt", "Aaron Harabedian", 5000000);
        printElectionResults(candidates);
    }

    //method to print all candidate names and votes
    private static void printCandidateData(List<Candidate> data)
    {
        for(Candidate candidate : data)
        {
            System.out.println(candidate);
        }
    }

    //method that counts total number of votes
    private static int totalVotes(List<Candidate> data)
    {
        int sum = 0;
        for(Candidate candidate : data)
        {
            sum += candidate.getVotes();
        }
        return sum;
    }

    //method that prints table to screen with name, number of votes, percentage of total votes, and total votes
    private static void printElectionResults(List<Candidate> data)
    {
        int totalVotes = totalVotes(data);
        System.out.printf("%-20s%10s%12s%n", "Name", "# of Votes", "% of Votes");
        for(Candidate candidate : data)
        {
            System.out.printf("%-20s%10d%10.1f%n", candidate.getName(), candidate.getVotes(), ((double)candidate.getVotes()/totalVotes * 100));
        }
        System.out.println("Total # of Votes: " + totalVotes);
    }

    //A method that will find a particular candidate by name and change the name for that candidate. Its arguments should include the array, a name to find, and the replacement name.
    private static void changeName(List<Candidate> data, String oldName, String newName)
    {
        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i).getName().equals(oldName))
            {
                data.get(i).setName(newName);
            }
        }
    }

    //A method that will find a particular candidate by name and change the number of votes for that candidate. Its arguments should include the array, a name to find, and the replacement votes.
    private static void changeVotes(List<Candidate> data, String name, int newVotes)
    {
        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i).getName().equals(name))
            {
                data.get(i).setVotes(newVotes);
            }
        }
    }

    //Method that will find a particular candidate by name and replace both the name and number of votes for that candidate.
    //Its arguments should include the array, a name to find, the replacement name, and the replacement votes.
    private static void changeNameAndVotes(List<Candidate> data, String oldName, String newName, int newVotes)
    {
        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i).getName().equals(oldName))
            {
                data.get(i).setName(newName);
                data.get(i).setVotes(newVotes);
            }
        }
    }

    //a method that will insert a new candidate into a specified position. Its arguments should include the array, a position to insert, the name to add, and the votes to add.
    private static void insertCandidateByIndex(List<Candidate> data, int index, String name, int votes)
    {
        data.add(index, new Candidate(name, votes));
    }

    public static void insertCandidateByName(List<Candidate> data, String find, String name, int votes)
    {
        int index = 0;

        for(int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(find)) {
                index = i;
            }
        }

        data.add(index, new Candidate(name, votes));
    }
}
