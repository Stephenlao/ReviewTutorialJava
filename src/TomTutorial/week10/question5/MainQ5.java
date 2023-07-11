package TomTutorial.week10.question5;
import java.util.Map;
public class MainQ5 {
    public static void main(String[] args) {
        RMITStudent student = new RMITStudent("John");

        try {
            student.updateCourse("CS101", 85);
            student.updateCourse("ENG202", 78);
            student.updateCourse("ENG202", 85);


            // Update existing course mark
            student.updateCourse("CS101", 95);

            // Add a new course mark
            student.updateCourse("MATH301", 92);

        } catch (RMITException e) {
            e.printStackTrace();
        }

        System.out.println("Student: " + student.getName());
        System.out.println("Marks:");
        for (Map.Entry<String, Integer> entry : student.getMarks().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
