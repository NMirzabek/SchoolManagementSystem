package PDP.MirzabekN;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class School {
    private final Person[] people;
    private int peopleCount;

    public School(int maxSize) {
        this.people = new Person[maxSize];
        this.peopleCount = 0;
    }

    public void addPerson(Person person) {
        if (peopleCount < people.length) {
            people[peopleCount++] = person;
        } else {
            System.out.println("School is full!");
        }
    }

    public void viewPeople() {
        if (peopleCount == 0) {
            System.out.println("No people yet!");
        } else {
            for (int i = 0; i < peopleCount; i++) {
                System.out.println(people[i].getDetails());
            }
        }
    }

    public void assignGrade(String studentName, int grade) {
        for (int i = 0; i < peopleCount; i++) {
            if(people[i] instanceof Student && people[i].getName().equals(studentName)) {
                ((Student) people[i]).addGrade(grade);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void viewStudentGrades(String studentName) {
        for (int i = 0; i < peopleCount; i++) {
            if(people[i] instanceof Student && people[i].getName().equals(studentName)) {
                System.out.println(people[i].getName() + " grade: " +((Student) people[i]).getGrades());
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
