package SchoolTutorial.week6.question3;
import java.io.Serializable;
public class Student implements Serializable  {
    private String name;
    private String major;
    private double GPA;

    public Student(String name, String major,double GPA) {
        this.name = name;
        this.major = major;
        this.GPA = GPA;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
