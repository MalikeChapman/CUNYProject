public class QueensUndergraduate extends CUNY {
    private String standing;
    private String myClasses;
    private double grade;
    private float gpa;
    private String name;
    private String email;
    private String[] uploaded = new String[10];//needs to be updated
    private String[] downloaded = new String[10];//needs to be updated
    private int pointSystem;
    private String studentStanding;

    public String getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(String myClasses) {
        this.myClasses = myClasses;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStanding() {
        return standing;
    }

    public void setStanding(String standing) {
        this.standing = standing;
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
