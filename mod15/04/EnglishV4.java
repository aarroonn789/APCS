/**
 * Author: Aaron
 * Description: Manages EnglishV4 assignments
 * Date: 7-30-18
 */
public class EnglishV4 extends HomeworkV4 {
    public EnglishV4(){
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
