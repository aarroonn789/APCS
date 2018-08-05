package terrain;
/**
 * This class defines a winterMountain Terrain.
 *
 * @author aaron
 * @version 4-18-18
 */
public class WinterMountain extends Mountain {

    //instance var
    private double temp;

    public WinterMountain(int l, int w, int n, double t) {
        //call super
        super(l, w, n);

        //init instance vars
        temp = t;
    }

    public String getTemp() {
        return temp + " degrees";
    }
}
