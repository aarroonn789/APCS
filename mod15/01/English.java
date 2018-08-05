/**
 * Author: Aaron
 * Description: Manages EnglishV3 assignments
 * Date: 7-30-18
 */
public class English extends Homework {
    public English(){
        super();
    }

    public void createAssignment(int pages) {
        setPagesToRead(pages);
        setHomeworkType("EnglishV3");
    }
}
