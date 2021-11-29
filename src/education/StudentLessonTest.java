package education;

import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonstorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";//պետք է նույն անունով երկու տարբեր դասընթաց չունենանք
    private static final String ADD_STUDENT = "2";//պետք է նույն իմեյլով երկու ուսանող չունենանք
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSONS_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";


    public static void main(String[] args) {
        lessonstorage.add(new Lesson("visa", 12, "master", 32));
        lessonstorage.add(new Lesson("vtb", 9, "card", 12));
        lessonstorage.add(new Lesson("amg", 1, "mercedes", 350));


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSONS_BY_NAME:
                    deleteLessonsByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("please input student email");
        String email = scanner.nextLine();
        studentStorage.deleteByEmail(email);

    }

    private static void deleteLessonsByName() {
        System.out.println("please input lesson name to dalete");
        String title = scanner.nextLine();
        lessonstorage.deleteLessonsByName(title);
    }

    private static void printLessons() {
        System.out.println("here is the list of lessons");
        lessonstorage.printLessons();
    }

    private static void printStudentsByLesson() {
        System.out.println("please input lesson name to find students");
        String lesson = scanner.nextLine();
        studentStorage.printStudentsByLesson(lesson);
    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input"+ADD_LESSON+"for ADD_LESSON");
        System.out.println("please input"+ADD_STUDENT+"for ADD_STUDENT");
        System.out.println("please input"+PRINT_STUDENTS+"for PRINT_STUDENTS");
        System.out.println("please input"+PRINT_STUDENTS_BY_LESSON+"for PRINT_STUDENTS_BY_LESSON");
        System.out.println("please input"+PRINT_LESSONS+"for PRINT_LESSONS");
        System.out.println("please inpt"+DELETE_LESSONS_BY_NAME+"for DELETE_LESSONS_BY_NAME");
        System.out.println("please input"+DELETE_STUDENT_BY_EMAIL+"for DELETE_STUDENT_BY_EMAIL");
    }
    private static void addLesson() {
        System.out.println("please input lesson name");
        String name = scanner.nextLine();
        System.out.println("please input lesson duraction");
        int duraction = Integer.parseInt(scanner.nextLine());
        System.out.println("please input lesson lectureName");
        String lectureName = scanner.nextLine();
        System.out.println("please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(name, duraction,lectureName,price);
        lessonstorage.add(lesson);
    }
    private static void addStudent(){
        System.out.println("please input student name");
        String name=scanner.nextLine();
        System.out.println("please input student surname");
        String surname=scanner.nextLine();
        System.out.println("please input student age");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("please input student email");
        String email=scanner.nextLine();
        System.out.println("please input student phone");
        String phone=scanner.nextLine();

        Student student=new Student(name,surname,age,email,phone);
        studentStorage.add(student);
    }
    public static void  printStudents (){
        System.out.println("here is the list of students");
        studentStorage.print();
    }
}