import java.util.Scanner;
public class CUNY {
    private String emplID;
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
                int i = x.nextInt();
                age = i;

            }
            this.age = age;
        }
    }

    public String getEmplID() {
        return emplID;
    }

    public void setEmplID(String emplID) {
        if(emplID.length() < 8 || emplID.length() > 8)
        {
            System.out.println("Invalid id format too short or too long");
            this.emplID = null;
        }
        else {
            this.emplID = emplID;
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
        emplID = "00000000";
        name = "John Doe";
        campus = "Unknown";
    }
    public CUNY(String emplID, String name, String campus){
        if (emplID.length() < 8 || emplID.length() > 8)
        {
            System.out.println("Invalid emplID");
            this.emplID = null;
        }
        else
        {
            this.emplID = emplID;
        }
        this.name = name;
        this.campus = campus;
    }
}
