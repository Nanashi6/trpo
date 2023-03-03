public class Main {
    public static void main(String[] args) {
        Student[] st = { new Budget_Student("Friday",5,6,6, Student_Type.Budget),
                         new Budget_Student("Monday",5,692,6.5, Student_Type.Budget),
                         new Budget_Student("Donnerstag",5,62354,6.9, Student_Type.Budget),
                         new Budget_Student("Dienstag",5,65436,6.66, Student_Type.Budget),
                         new Budget_Student("Fraytag",5,656785,6.7, Student_Type.Budget),
                         new Budget_Student("Fraytag",5,656785,6.7, Student_Type.Budget),
                         new Budget_Student("Fraytag",5,656785,6.7, Student_Type.Budget),
                         new Budget_Student("Fraytag",5,656785,6.7, Student_Type.Budget),
                         new Budget_Student("Fraytag",5,656785,6.7, Student_Type.Budget),
                         new Budget_Student("Fraytag",5,656785,6.7, Student_Type.Budget),
                         new Student("Andrey", 17, 543, 6, Student_Type.Payer),
                         new Student("Yury", 17, 54, 8, Student_Type.Payer),
                         new Student("Bogdan", 17, 53, 4, Student_Type.Payer),
                         new Student("Dimiriy", 18, 43, 6, Student_Type.Payer),
                         new Student("Alexander", 20, 876, 7, Student_Type.Payer),
                         new Student("Nikita", 23, 435, 5, Student_Type.Payer),
                         new Student("Imya", 35, 135, 8.6, Student_Type.Payer),
                         new Student("Simon", 99, 967, 5, Student_Type.Payer),
                         new Student("L", 123, 5, 6, Student_Type.Payer),
                         new Student("Kira", 124, 567, 9, Student_Type.Payer)
                        };
        /*st[0].getClass().getName();*/
        System.out.println("Студенты платники: ");
        for(int i = 0; i < st.length; i++) {
            if (st[i].getType() == Student_Type.Payer) {
                st[i].display();
                System.out.println();
            }
        }

        System.out.println("Средний балл по всем студентам: ");
        for(int i = 0; i < st.length; i++) {
                System.out.println("Name: " + st[i].getName() + ", GPA: " + st[i].getGpa());
        }
    }
}