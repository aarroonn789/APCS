/**
 * Name: Aaron Harabedian
 * Date: 8-1-18
 * Description: Tests "Candidate" class
 */
public class ElectionTesterV5
{
    public static void main(String[] args)
    {
        //Array with 5 candidate objects
        Candidate[] candidates = new Candidate[5];

        candidates[0] = new Candidate("Woodrow Wilson", 6296284);
        candidates[1] = new Candidate("Theodore Roosevelt", 4122721);
        candidates[2] = new Candidate("William Taft", 3486242);
        candidates[3] = new Candidate("Eugene Debs", 901551);
        candidates[4] = new Candidate("Eugene Chafin", 208156);

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

    //Method to print all candidate names and votes
    private static void printCandidateData(Candidate[] data)
    {
        for(Candidate candidate : data)
        {
            System.out.println(candidate);
        }
    }

    //Method that counts total number of votes
    private static int totalVotes(Candidate[] data)
    {
        int sum = 0;
        for(Candidate candidate : data)
        {
            sum += candidate.getVotes();
        }
        return sum;
    }

    //Method that prints table to screen with name, number of votes, percentage of total votes, and total votes
    private static void printElectionResults(Candidate[] data)
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
    private static void changeName(Candidate[] data, String oldName, String newName)
    {
        for(int i = 0; i < data.length; i++)
        {
            if(data[i].getName().equals(oldName))
            {
                data[i].setName(newName);
            }
        }
    }

    //A method that will find a particular candidate by name and change the number of votes for that candidate. Its arguments should include the array, a name to find, and the replacement votes.
    private static void changeVotes(Candidate[] data, String name, int newVotes)
    {
        for(int i = 0; i < data.length; i++)
        {
            if(data[i].getName().equals(name))
            {
                data[i].setVotes(newVotes);
            }
        }
    }

    //Method that will find a particular candidate by name and replace both the name and number of votes for that candidate.
    //Its arguments should include the array, a name to find, the replacement name, and the replacement votes.
    private static void changeNameAndVotes(Candidate[] data, String oldName, String newName, int newVotes)
    {
        for(int i = 0; i < data.length; i++)
        {
            if(data[i].getName().equals(oldName))
            {
                data[i].setName(newName);
                data[i].setVotes(newVotes);
            }
        }
    }

    //a method that will insert a new candidate into a specified position. Its arguments should include the array, a position to insert, the name to add, and the votes to add.
    private static void insertCandidateByIndex(Candidate[] data, int index, String name, int votes)
    {
        for(int i = data.length - 1; i > index; i--)
        {
            data[index] = data[index - 1];
        }

        data[index] = new Candidate(name, votes);
    }

    public static void insertCandidateByName(Candidate[] data, String find, String name, int votes)
    {
        int index = 0;

        for(int i = 0; i < data.length; i++) {
            if (data[i].getName().equals(find)) {
                index = i;
            }
        }

        for(int i = data.length - 1; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = new Candidate(name, votes);
    }
}
