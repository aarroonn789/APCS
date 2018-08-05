package terrain;
/**
 * This class defines a mountain Terrain.
 *
 * @author aaron
 * @version 4-18-18
 */
public class Mountain extends Terrain{

    //Instance vars
    private int numberOfMountains;

    public Mountain(int l, int w, int n) {
        //Call super
        super(l, w);

        //Init instance vars
        numberOfMountains = n;
    }

    public String getNumberOfMountains() {
        return numberOfMountains + " Mountains";
    }
}
