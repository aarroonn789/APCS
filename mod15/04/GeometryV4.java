/**
 * Author: Aaron
 * Description: Manages GeometryV4 assignments
 * Date: 7-30-18
 */
public class GeometryV4 extends HomeworkV4 {
    public GeometryV4(){
        super();
    }

    public void createAssignment(int pages) {
        setPagesToRead(pages);
        setHomeworkType("Geometry");
    }

    @Override
    public void doHomework(int pages) {
        setPagesToRead(getPagesToRead() - pages);
    }
}
