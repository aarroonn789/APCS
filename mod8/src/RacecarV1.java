public class RacecarV1
{
    public RacecarV1()
    {
    }

    //Calculates time to run lap based on length of track and speed of car.
    public double runLap(int trackLength, int speed)
    {
        return trackLength / speed;
    }

    //Returns true or false for race win
    public boolean race(int trackLength, int speed, int opponentSpeed)
    {
        double opponentTime = trackLength / opponentSpeed;
        double racecarTime = trackLength / speed;

        if (racecarTime < opponentTime) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        //Declaration and initialization of variables
        int speed = 10;
        int opponentSpeed = 9;
        int trackLength = 1200;

        RacecarV1 racecar = new RacecarV1();

        //Call methods
        double lapTime = racecar.runLap(trackLength, speed);
        boolean results = racecar.race(trackLength, speed, opponentSpeed);

        System.out.println("Your lap time: " + lapTime + " Seconds");
        if (results){
            System.out.println("You won the race!");
        } else {
            System.out.println("You lost the race!");
        }
    }
}