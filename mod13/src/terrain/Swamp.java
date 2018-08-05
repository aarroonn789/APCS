package terrain;
/**
 * This class defines a swamp Terrain.
 *
 * @author aaron
 * @version 4-18-18
 */
public class Swamp extends Terrain {

    //Instance vars
    private double waterSaturation;

    public Swamp(int l, int w, double saturation) {
        //call super
        super(l, w);

        //init instance vars
        waterSaturation = saturation;
    }

    public String getSaturation() {
        return waterSaturation + " saturation";
    }
}
