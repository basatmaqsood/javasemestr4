 class Student {

    private String name, major, minor;
    private int hours;
    private double cumulativeGPA;

    public Student(String newStudentName,Double gpa) {
        name = newStudentName;
        major = "";
        minor = "";
        hours = 0;
        cumulativeGPA = gpa;
    }

    public String getName() {
        return name;
    }
    public Double getgpa() {
        return cumulativeGPA;
    }
    public void changeHours(int newHours) {
        if (newHours > 0 && newHours < 200)
            hours = hours + newHours;
    }

    public String getRank() {
        if (hours >= 90)
            return "senior";
        else if (hours >= 60)
            return "junior";
        else if (hours >= 30)
            return "sophomore";
        else
            return "freshman";
    }

    public String toString() {
        String tempMajor, tempMinor;
        if (!major.equals(""))
            tempMajor = major;
        else
            tempMajor = "undeclared";
        if (minor != "")
            tempMinor = minor;
        else
            tempMinor = "none";
        return name + "\t" + tempMajor + "\t" + tempMinor + getRank();
    }

}
public class Student1 {

    public static void main(String args[]){
        Student basat = new Student("basat",3.57);
        System.out.println(basat.getName());
        System.out.println(basat.getgpa());
    }
}