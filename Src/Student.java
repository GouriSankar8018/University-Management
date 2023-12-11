import java.util.ArrayList;
import java.util.List;

class Student extends Person {
     private int studentId;
     private List<Course> enrolledCourses;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }
}
