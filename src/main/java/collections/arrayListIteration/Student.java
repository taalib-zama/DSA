package collections.arrayListIteration;

public class Student {private int studentId;
    private String studentName;
    private boolean courseRegistered;

    public Student(int studentId, String studentName, boolean courseRegistered) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseRegistered = courseRegistered;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean getCourseRegistered() {
        return courseRegistered;
    }

    public void setCourseRegistered(boolean courseRegistered) {
        this.courseRegistered = courseRegistered;
    }

}
