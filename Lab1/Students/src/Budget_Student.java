public class Budget_Student extends Student {
    private double scholarship;

    public Budget_Student(String name, int age, int id, double gpa, Student_Type type) {
        super(name, age, id, gpa, type);
        scholarship = calculateScholarship();
    }

    private double calculateScholarship() {
        double scholarship = 100;
        if (this.getGpa() <= 5.0) {
            scholarship = 0;
        } else if (this.getGpa() >= 7.0 && this.getGpa() < 8.0) {
            scholarship += scholarship * 0.25;
        } else if (this.getGpa() >= 8.0 && this.getGpa() <= 10.0) {
            scholarship += scholarship * 0.5;
        }
        return scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setGpa(double gpa) {
        super.setGpa(gpa);
        scholarship = calculateScholarship();
    }

    public void display() {
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nID: " + this.getId() +
                "\nGPA: " + this.getGpa() + "\nScholarship: " + getScholarship());
    }
}
