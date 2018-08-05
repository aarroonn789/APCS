/**
 * Author: Aaron
 * Description: Manages EconomicsV4 assignments
 * Date: 7-30-18
 */
public class EconomicsV4 extends HomeworkV4 {
    public EconomicsV4(){
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
