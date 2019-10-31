import java.util.Scanner;
public class CUNY {
    private String name;
    private String campus;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15 || age > 100)
        {
            System.out.println("Invalid, age please enter a valid age between 15 and 100");
            while(age < 15 || age > 100){
                Scanner x = new Scanner(System.in);
                x.close();
                int i = x.nextInt();
                age = i;

            }
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    public CUNY(){
        name = "John Doe";
        campus = "Unknown";
    }
    public CUNY(String name, String campus){
        this.name = name;
        this.campus = campus;
    }
}
