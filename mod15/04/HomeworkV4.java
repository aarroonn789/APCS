/**
 * Author: Aaron
 * Description: Manages homework assignments
 * Date: 7-30-18
 */
public abstract class HomeworkV4 implements ProcessingV4, Comparable<HomeworkV4> {
    //Instance vars
    private int pagesToRead;
    private String homeworkType;

    //Constructor
    public HomeworkV4() {
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

    public int compareTo(HomeworkV4 obj) {
        if(this.pagesToRead > obj.pagesToRead)
        {
            return 1;
        }
        else if(this.pagesToRead == obj.pagesToRead)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

    //Abstract methods
    public abstract void createAssignment(int pages);
}
