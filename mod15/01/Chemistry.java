/**
 * Author: Aaron
 * Description: Manages ChemistryV3 assignments
 * Date: 7-30-18
 */
public class Chemistry extends Homework {
    public Chemistry(){
        super();
    }

    public void createAssignment(int pages) {
        setPagesToRead(pages);
        setHomeworkType("ChemistryV3");
    }
}
