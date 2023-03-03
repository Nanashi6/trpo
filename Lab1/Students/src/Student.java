public class Student {
    private String name;
    private int age;
    private int id;
    private double gpa;
    private Student_Type type;

    public Student(String name, int age, int id, double gpa, Student_Type type) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student_Type getType() {
        return type;
    }

    public void display() {
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nID: " + this.getId() +
                "\nGPA: " + this.getGpa());
    }

}

