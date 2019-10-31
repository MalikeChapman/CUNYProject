public class QueensStudent extends CUNY {
    private String semesterEntered;
    private String major;
    private float gpa;

    public String getSemesterEntered() {
        return semesterEntered;
    }

    public void setSemesterEntered(String semesterEntered) {
        this.semesterEntered = semesterEntered;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa < 0.0 || gpa > 4)
        {
            System.out.println("Invalid gpa, gpa set to 0.0");
            this.gpa = 0.0f;
        }
        else
            this.gpa = gpa;
    }
}
