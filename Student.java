

public class Student extends Patron {
    private String studentID;
    private String gradeLevel;

    public Student(String name, String address, String phoneNumber, String studentID, String gradeLevel) {
        super(name, address, phoneNumber);
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    // Setters
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    // Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", studentID='" + this.studentID + '\'' +
                ", gradeLevel='" + this.gradeLevel + '\'' +
                '}';
    }
}
