/**
 * Author: Aaron
 * Description: Manages EconomicsV3 assignments
 * Date: 7-30-18
 */
public class EconomicsV3 extends HomeworkV3 {
    public EconomicsV3(){
        super();
    }

    public void createAssignment(int pages) {
        setPagesToRead(pages);
        setHomeworkType("Economics");
    }

    @Override
    public void doHomework(int pages) {
        setPagesToRead(getPagesToRead() - pages);
    }
}
