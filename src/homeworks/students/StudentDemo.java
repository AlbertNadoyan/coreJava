package homeworks.students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run){
            System.out.println("Please input 0 for exit.");
            System.out.println("Please input 1 for add student.");
            System.out.println("Please input 2 for print all students.");
            System.out.println("Please input 3 for delete student by index.");
            System.out.println("Please input 4 for print student by lesson.");
            System.out.println("Please input 5 for students count.");
            System.out.println("Please input 6 for change students lesson.");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command){
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.printArray();
                    break;
                case 3:
                    studentStorage.printArray();
                    System.out.println("Please choose student index.");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorage.deleteDyIndex(index);
                    break;
                case 4:
                    System.out.println("Please input lesson name.");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentsbyLessonName(lessonName);
                    break;
                case 5:
                    System.out.println("Student's count.");
                    System.out.println(studentStorage.getSize());
                    break;
                case 6:
                    studentStorage.printArray();
                    System.out.println("Please choose student index.");
                    int stIndex = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input new lesson name.");
                    String newLesson = scanner.nextLine();
                    studentStorage.replaceLesson(stIndex, newLesson);
                    break;
                default:
                    System.out.println("Invalid command.");
            }

        }


    }

    private static void addStudent() {
        System.out.println("Please input student's name: ");
        String stName = scanner.nextLine();
        System.out.println("Please input student's surname: ");
        String stSurName = scanner.nextLine();
        System.out.println("Please input student's gender: ");
        String stGender = scanner.nextLine();
        System.out.println("Please input student's age: ");
        String stAgeStr = scanner.nextLine();
        System.out.println("Please input student's phoneNumber: ");
        String stPhoneNumber = scanner.nextLine();
        System.out.println("Please input student's city: ");
        String stCity = scanner.nextLine();
        System.out.println("Please input student's lesson: ");
        String stLesson = scanner.nextLine();

        int stAge = Integer.parseInt(stAgeStr);

        Student student = new Student(stName, stSurName, stGender, stAge, stPhoneNumber, stCity, stLesson);
        studentStorage.add(student);
        System.out.println("Student created.");
    }
}
