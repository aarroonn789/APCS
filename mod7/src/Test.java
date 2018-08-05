public class Test
{
    public static void main(String[] args){
        int length1 = 1;
        int length2 = 5;
        int width1 = 5;
        int width2 = 25;

        double lengthRatio = (double)length1/length2;
        double widthRatio = (double)width1/width2;

        System.out.println("Length ratio: " + lengthRatio);
        System.out.println("Width ratio: " + widthRatio);
        if (lengthRatio == widthRatio){
            System.out.println("The rectangles are similar.");
        } else {
            System.out.println("The rectangles are not similar.");
        }
    }
}
