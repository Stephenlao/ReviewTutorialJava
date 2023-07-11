package TomTutorial.week10.question5;

import java.util.Map;
import java.util.HashMap;

public class RMITStudent {
    private String name;
    private Map<String,Integer> marks;

    public RMITStudent(String name) {
        this.name = name;
        this.marks = new HashMap<>();
    }

    public String getName() {
        return name;
    }
    public void updateCourse(String code, int mark) throws RMITException {
        if(mark < 0 || mark > 100) {
            throw new MarkException("Invalid mark value");
        }

        if (marks.size() >= 3) {
            throw new CourseException("Maximum course limit reached ");
        }
        marks.put(code,mark);
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }
}
