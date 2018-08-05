/**
 * Author: Aaron
 * Description: Manages homework assignments
 * Date: 7-30-18
 */
public abstract class HomeworkV3 implements Processing {
    //Instance vars
    private int pagesToRead;
    private String homeworkType;

    //Constructor
    public HomeworkV3() {
        pagesToRead = 0;
        homeworkType = "none";
    }

    //getter and setter methods
    public int getPagesToRead() {
        return pagesToRead;
    }

    public void setPagesToRead(int pagesToRead) {
        this.pagesToRead = pagesToRead;
    }

    public String getHomeworkType() {
        return homeworkType;
    }

    public void setHomeworkType(String homeworkType) {
        this.homeworkType = homeworkType;
    }

    public String toString() {
        return homeworkType + " - " + pagesToRead + " Pages to read";
    }

    //Abstract methods
    public abstract void createAssignment(int pages);
}
