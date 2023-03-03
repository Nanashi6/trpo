public class Student {
    private String name;
    private int age;
    private int id;
    private double gpa;

    public Student(String name, int age, int id, double gpa) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
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

    public void display() {
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nID: " + this.getId() +
                "\nGPA: " + this.getGpa());
    }

}

