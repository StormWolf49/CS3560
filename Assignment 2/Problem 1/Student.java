public class Student {
    private String name;
    private String major;
    private Double gpa;

    public Student() {
        name = "";
        major = "";
        gpa = 0.0;
    }

    public Student(String n, String m) {
        name = n;
        major = m;
        gpa = 0.0;
    }

    public Student(String n, String m, Double g) {
        name = n;
        major = m;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String m) {
        major = m;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double g) {
        gpa = g;
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
