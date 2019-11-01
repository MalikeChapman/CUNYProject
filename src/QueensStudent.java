public class QueensStudent extends CUNY {
    private String semesterEntered;
    private String semester;
    private String year;
    private String major;
    private String address;
    private String allClasses;
    private String password;
    private int studentID;



    public String getSemesterEntered() {
        return semesterEntered;
    }

    public void setSemesterEntered(String semesterEntered) {
        this.semesterEntered = semesterEntered;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAllClasses() {
        return allClasses;
    }

    public void setAllClasses(String allClasses) {
        this.allClasses = allClasses;
    }

    public void setSemesterEntered(String semester, String year) {
        this.semesterEntered = String.format("Semester entered is: %1$s %1$s." + semester, year);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}
