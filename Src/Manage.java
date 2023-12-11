 public class Manage {
    public static void main(String[] args) {
        // Creating students, teachers, and courses
        Student student1 = new Student("Ram", 25, 1);
        Student student2 = new Student("Shyam", 30, 2);

        Teacher teacher1 = new Teacher("Madhu", 40, 101);
        Teacher teacher2 = new Teacher("Mala", 35, 102);

        Course mathCourse = new Course("Mathematics", 1);
        Course physicsCourse = new Course("Physics", 2);

        // Enrolling students in courses
        student1.enrollCourse(mathCourse);
        student2.enrollCourse(physicsCourse);

        // Assigning teachers to courses
        teacher1.teachCourse(mathCourse);
        teacher2.teachCourse(physicsCourse);

        // Displaying information
        displayStudentInformation(student1);
        displayTeacherInformation(teacher1);

        displayStudentInformation(student2);
        displayTeacherInformation(teacher2);
    }

    public static void displayStudentInformation(Student student) {
        System.out.println("Student: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Enrolled Courses:");

        for (Course course : student.getEnrolledCourses()) {
            System.out.println(" - " + course.getCourseName());
        }

        System.out.println();
    }

    public static void displayTeacherInformation(Teacher teacher) {
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Teacher ID: " + teacher.getTeacherId());
        System.out.println("Taught Courses:");

        for (Course course : teacher.getTaughtCourses()) {
            System.out.println(" - " + course.getCourseName());
        }

        System.out.println();
    }
}
