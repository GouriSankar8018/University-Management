import java.util.ArrayList;
import java.util.List;

class Teacher extends Person {
    private int teacherId;
    private List<Course> taughtCourses;

    public Teacher(String name, int age, int teacherId) {
        super(name, age);
        this.teacherId = teacherId;
        this.taughtCourses = new ArrayList<>();
    }

    public int getTeacherId() {
        return teacherId;
    }

    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }

    public void teachCourse(Course course) {
        taughtCourses.add(course);
    }
}
