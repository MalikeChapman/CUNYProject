import java.util.regex.*;
public class QueensStudent extends CUNY {
    private String semesterEntered;
    private String StudentName;
    private String StudentYear;
    private String StudentMajor;
    private String StudentAddress;
    private String allClasses;
    private String password;
    private int studentID;
    private String emailRegEx;
    private String StudentEmail;
    private String passwordRegEX;

}

    public String getPasswordRegEX() {
        return passwordRegEX;
    }

    public void setPasswordRegEX() {
        this.passwordRegEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^\\w\\s]).{5,10})";
    }
    public boolean isValidPassword( String password){
        Pattern pass = Pattern.compile(this.passwordRegEX);
        if (password == null)
            return false;
         return pass.matcher(password).matches();
    }

    public String getEmailRegEx() {
        return emailRegEx;
    }

    public void setEmailRegEx() {
        this.emailRegEx = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
    }
    public QueensStudent(){
        this.emailRegEx = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

    }

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
    public boolean isValidEmail(String emailRegEx, String email){
        Pattern p = Pattern.compile(emailRegEx);
        if (email == null)
            return false;
        return p.matcher(email).matches();

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args){
        QueensStudent q1 = new QueensStudent();
        QueensStudent q2 = new QueensStudent();
        q1.setEmail("Test.email@test.org");
        q2.setEmail("test..23@..com");
        System.out.println(q1.isValidEmail(q1.emailRegEx, q1.email));
        System.out.println(q2.isValidEmail(q2.emailRegEx, q2.email));
        q1.setPasswordRegEX();
        q2.setPasswordRegEX();
        q1.setPassword("ab12d5");
        q2.setPassword("Test@11");
        System.out.println(q1.isValidPassword(q1.password));
        System.out.println(q2.isValidPassword(q2.password));


    }


}
