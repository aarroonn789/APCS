/**
 * This is a class that tests the Card class.
 *
 *  aaron
 *  8-4-18
 */

public class CardTester
{
    /**
     * The main method in this class checks the Card operations for consistency.
     * @param args is not used.
     */
    public static void main(String[] args) {

        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

        // Establish new cards
        Card aceHearts = new Card("ace", "hearts", 1);
        Card aceDiamonds = new Card("ace", "diamonds", 1);
        Card twoHearts = new Card("two", "hearts", 2);

        // Test card 1 and methods
        System.out.println("**** Tests Card 1: ace of hearts ****");
        displayCard(aceHearts);

        // Test card 2
        System.out.println("**** Tests Card 2: ace of diamonds ****");
        displayCard(aceDiamonds);

        // Test card 3
        System.out.println("**** Tests Card 3: two of hearts ****");
        displayCard(twoHearts);

        // Test matches() method
        System.out.println("**** Test Card 1 match with Card 2 ****");
        if(aceHearts.matches(aceDiamonds))
        {
            System.out.println("     Card 1 matches Card 2!");
        }
        else
        {
            System.out.println("     Card 1 does not match Card 2!");
        }

        System.out.println("**** Test Card 2 match with Card 3 ****");
        if(aceDiamonds.matches(twoHearts))
        {
            System.out.println("     Card 2 matches Card 3!");
        }
        else
        {
            System.out.println("     Card 2 does not match Card 3!");
        }
    }

    private static void displayCard(Card card)
    {
        System.out.println("  rank: " + card.rank());
        System.out.println("  suit: " + card.suit());
        System.out.println("  pointValue: " + card.pointValue());
        System.out.println("  toString: " + card.toString());
        System.out.println();
    }
}