/**
 * Author: Aaron
 * Description: Manages ChemistryV3 assignments
 * Date: 7-30-18
 */
public class ChemistryV3 extends HomeworkV3 {
    public ChemistryV3(){
        super();
    }

    public void createAssignment(int pages) {
        setPagesToRead(pages);
        setHomeworkType("Chemistry");
    }

    @Override
    public void doHomework(int pages) {
        setPagesToRead(getPagesToRead() - pages);
    }
}
