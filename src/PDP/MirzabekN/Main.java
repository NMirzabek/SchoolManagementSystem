package PDP.MirzabekN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a Person (Student or Teacher)");
            System.out.println("2. View All People");
            System.out.println("3. Assign Grade to Student");
            System.out.println("4. View Student Grades");
            System.out.println("5. Exit");
            System.out.println("Choose one of the options");
            // six choice may be added.
            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
                case 1:
                    Person person = new Person();
                    System.out.println("Student or Teacher (Please write with lowercase words): ");
                    String level = scanner.nextLine().trim().toLowerCase();

                    System.out.println("Enter a name: ");
                    String name = scanner.nextLine();
                    person.setName(name);

                    System.out.println("Enter an age: ");
                    int age = scanner.nextInt();
                    person.setAge(age);

                    if (level.equals("student")) {
                        school.addPerson(new Student(name, age));
                    } else if (level.equals("teacher")) {
                        school.addPerson(new Teacher(name, age));
                    } else {
                        System.out.println("Invalid Level!");
                    }
                    break;

                case 2:
                    school.viewPeople();
                    break;

                case 3:
                    System.out.println("Enter a student name: ");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter a Grade: ");
                    int grade = scanner.nextInt();
                    school.assignGrade(studentName, grade);
                    break;

                case 4:
                    System.out.println("Enter a student name");
                    studentName = scanner.nextLine();
                    school.viewStudentGrades(studentName);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, Please try again later!");


                    // documentation branch is created and pushed codes to create a pull request
            }
        }
    }
}