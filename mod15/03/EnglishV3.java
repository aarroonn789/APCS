/**
 * Author: Aaron
 * Description: Manages EnglishV3 assignments
 * Date: 7-30-18
 */
public class EnglishV3 extends HomeworkV3 {
    public EnglishV3(){
        super();
    }

    public void createAssignment(int pages) {
        setPagesToRead(pages);
        setHomeworkType("English");
    }

    @Override
    public void doHomework(int pages) {
        setPagesToRead(getPagesToRead() - pages);
    }
}
