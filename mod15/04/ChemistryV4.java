/**
 * Author: Aaron
 * Description: Manages ChemistryV4 assignments
 * Date: 7-30-18
 */
public class ChemistryV4 extends HomeworkV4 {
    public ChemistryV4(){
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
