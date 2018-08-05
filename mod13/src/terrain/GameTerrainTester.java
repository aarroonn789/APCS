package terrain;
/**
 * This class tests Terrain.
 *
 * @author aaron
 * @version 4-18-18
 */
public class GameTerrainTester {
    public static void main(String [] args){
        Terrain land = new Terrain(100, 100);
        Forest forest = new Forest(100, 100, 276);
        Mountain mountain = new Mountain(100000, 100000, 12);
        WinterMountain winterMountain = new WinterMountain(100000, 100000, 6, 12.8);
        Farmland farmand = new Farmland(100, 100, "Wheat");
        Swamp swamp = new Swamp(100, 100, 0.76);

        System.out.println(land.getTerrainSize());
        System.out.println("Forest " + forest.getTerrainSize() + " and has " + forest.getNumberOfTrees());
        System.out.println("Mountain " + mountain.getTerrainSize() + " and has " +  mountain.getNumberOfMountains());
        System.out.println("Winter Mountain " + winterMountain.getTerrainSize() + " and has " + winterMountain.getNumberOfMountains() + " and is " + winterMountain.getTemp());
        System.out.println("Farmland " + farmand.getTerrainSize() + " and has " + farmand.getCrop());
        System.out.println("Swamp " + swamp.getTerrainSize() + " and has " + swamp.getSaturation());

    }
}
