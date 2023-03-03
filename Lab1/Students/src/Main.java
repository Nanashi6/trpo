public class Main {
    public static void main(String[] args) {
        Student[] st = { new BudgetStudent("Friday",5,6,6),
                         new BudgetStudent("Monday",5,692,6.5),
                         new BudgetStudent("Donnerstag",5,62354,6.9),
                         new BudgetStudent("Dienstag",5,65436,6.66),
                         new BudgetStudent("Fraytag",5,656785,6.7),
                         new BudgetStudent("Fraytag",5,656785,6.7),
                         new BudgetStudent("Fraytag",5,656785,6.7),
                         new BudgetStudent("Fraytag",5,656785,6.7),
                         new BudgetStudent("Fraytag",5,656785,6.7),
                         new BudgetStudent("Fraytag",5,656785,6.7),
                         new Student("Andrey", 17, 543, 6),
                         new Student("Yury", 17, 54, 8),
                         new Student("Bogdan", 17, 53, 4),
                         new Student("Dimiriy", 18, 43, 6),
                         new Student("Alexander", 20, 876, 7),
                         new Student("Nikita", 23, 435, 5),
                         new Student("Imya", 35, 135, 8.6),
                         new Student("Simon", 99, 967, 5),
                         new Student("L", 123, 5, 6),
                         new Student("Kira", 124, 567, 9)
                        };
        /*st[0].getClass().getName();*/
        System.out.println("Студенты платники: ");
        for(int i = 0; i < st.length; i++) {
            if (st[i].getClass().getName() == "Student") {
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