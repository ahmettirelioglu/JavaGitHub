package Ahmet;

public class student extends University {
    private int StudentNumber;
    private String clas;

    public student(String name, String lastName, String universityName, String facultyName, int phone, String mail, String address) {
        super(name, lastName, universityName, facultyName, phone, mail, address);
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public int getNumberOfCoursesTaken() {
        return NumberOfCoursesTaken;
    }

    public void setNumberOfCoursesTaken(int numberOfCoursesTaken) {
        NumberOfCoursesTaken = numberOfCoursesTaken;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private int NumberOfCoursesTaken;
    private String nationality;
}
