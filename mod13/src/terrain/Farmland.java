package terrain;
/**
 * This class defines a farmland Terrain.
 *
 * @author aaron
 * @version 4-18-18
 */
public class Farmland extends Terrain {

    //Instance vars
    private String FarmLandCrop;

    public Farmland(int l, int w, String crop) {
        //call super
        super(l, w);

        //init instance vars
        FarmLandCrop = crop;
    }

    public String getCrop() {
        return FarmLandCrop + " as a crop";
    }
}
