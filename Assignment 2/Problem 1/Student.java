public class Student {
    private String name;
    private String major;
    private Double gpa;

    public Student() {
        name = "";
        major = "";
        gpa = 0.0;
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.gpa = 0.0;
    }

    public Student(String name, String major, Double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "The student " + name + " is a " + major + " Major with a GPA of " + gpa;
    }

    public boolean equals(Student stu) {
        if(name.equals(stu.getName()) && major.equals(stu.getMajor()))
            return true;
        else
            return false;
    }
}
