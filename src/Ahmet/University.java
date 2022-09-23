package Ahmet;

public class University {
    private String name;
    private String lastName;

    public University(String name, String lastName, String universityName, String facultyName, int phone, String mail, String address) {
        this.name = name;
        this.lastName = lastName;
        UniversityName = universityName;
        FacultyName = facultyName;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
    }

    private String UniversityName;
    private String FacultyName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int phone;
    private String mail;
    private String address;

    @Override
    public String toString() {
        return name +" "+ lastName + "\n " + getFacultyName();
    }
}
