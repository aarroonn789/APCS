/**
 * Name: Aaron Harabedian
 * Date: 8-1-18
 * Description: Tests "Candidate" class
 */
public class ElectionTesterV1
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
    }

    //method to print all candidate names and votes
    private static void printCandidateData(Candidate[] data)
    {
        for(Candidate candidate : data)
        {
            System.out.println(candidate);
        }
    }

    //method that counts total number of votes
    private static int totalVotes(Candidate[] data)
    {
        int sum = 0;
        for(Candidate candidate : data)
        {
            sum += candidate.getVotes();
        }
        return sum;
    }

    //method that prints table to screen with name, number of votes, percentage of total votes, and total votes
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
}
