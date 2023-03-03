import java.util.ArrayList;

public class Repository {
    private ArrayList<Student> _students = new ArrayList<>();

    public void addStudent(Student student) {
        if (student.getClass().getName() == "Student")
            _students.add(new Student(student.getName(), student.getAge(), student.getId(), student.getGpa()));
        else
            _students.add(student);    }

    public void removeStudent(int index) {
        if(_students.size() >= index)
            _students.remove(index);
    }

    public void updateStudent(int index, Student student) {
        if(_students.size() >= index) {
            if (student.getClass().getName() == "Student")
                _students.set(index, new Student(student.getName(), student.getAge(), student.getId(), student.getGpa()));
            else
                _students.set(index, student);
        }
    }

    public ArrayList<Student> getArray(){
        return _students;
    }

    public Object size() {
        return _students.size();
    }
}
