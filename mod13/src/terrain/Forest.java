package terrain;
/**
 * This class defines a forest Terrain.
 *
 * @author aaron
 * @version 4-18-18
 */
public class Forest extends Terrain {

    //Instance vars
    private int numberOfTrees;

    public Forest(int l, int w, int n) {
        //Call super
        super(l, w);

        //Init instance vars
        numberOfTrees = n;
    }

    public String getNumberOfTrees() {
        return numberOfTrees + " Trees";
    }
}
