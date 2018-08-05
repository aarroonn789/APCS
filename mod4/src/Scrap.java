public class Scrap
{
    public static void main(String args []) {

        int rand;
        int draws = 0;

        int blue = 0;
        int red = 0;

        while(draws < 10) {
            rand = (int) (Math.random() * 10);
            if (rand >= 2) {
                System.out.println("Blue");
                blue++;
            }
            else {
                System.out.println("Red");
                red ++;
            }
            draws++;
        }

        System.out.println("DONE");
        System.out.println("Blue: " + blue);
        System.out.println("Red: " + red);
    }
}
