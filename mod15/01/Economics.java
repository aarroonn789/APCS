/**
 * Author: Aaron
 * Description: Manages EconomicsV3 assignments
 * Date: 7-30-18
 */
public class Economics extends Homework {
    public Economics(){
        super();
    }

    public void createAssignment(int pages) {
        setPagesToRead(pages);
        setHomeworkType("EconomicsV3");
    }
}
