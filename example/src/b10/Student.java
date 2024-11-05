package b10;

public class Student {

    private String name;
    private int year;
    private double grade;

    public Student() {

    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getGrade() {
        return grade;
    }
}
