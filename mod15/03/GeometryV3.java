/**
 * Author: Aaron
 * Description: Manages GeometryV3 assignments
 * Date: 7-30-18
 */
public class GeometryV3 extends HomeworkV3 {
    public GeometryV3(){
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
