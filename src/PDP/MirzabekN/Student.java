package PDP.MirzabekN;
import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private List<Integer> grades;

    public Student(String name, int age) {
        super(name, age);
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Grades: " + grades.toString();
    }
}
