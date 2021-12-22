package education;

import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonstorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();
    static UserContext context = new UserContext();


    private static final String EXIT = "0";
    private static final String LOGIN = "1";
    private static final String REGISTER = "2";
    private static final String ADD_LESSON = "3";
    private static final String ADD_STUDENT = "4";
    private static final String PRINT_STUDENTS = "5";
    private static final String PRINT_STUDENTS_BY_LESSON = "6";
    private static final String PRINT_LESSONS = "7";
    private static final String DELETE_LESSONS_BY_NAME = "8";
    private static final String DELETE_STUDENT_BY_EMAIL = "9";
    private static final String ADD_LESSON_TO_STUDENT = "10";


    public static void main(String[] args) {
        lessonstorage.add(new Lesson("visa", 12, "master", 32));
        lessonstorage.add(new Lesson("vtb", 9, "card", 12));
        lessonstorage.add(new Lesson("amg", 1, "mercedes", 350));


        boolean isRun = true;
        while (isRun) {
            if(context.getUser() == null){
                loginRegisterCommands();
            }
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
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
                case ADD_LESSON_TO_STUDENT:
                    addLessonToStudent();
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }

    private static void addUserToContext(User user){
        context.setUser(user);
    }

    private static void register() {
        addUser();
        login();
    }

    private static void login() {
        System.out.println("please input login and password");
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        try{
            User userByEmail = userStorage.getUserByEmail(login);
            if(userStorage.getUserByEmail(login)==null){
                throw  new UserNotFoundException();
            }
            if (userByEmail.getPassword().equals(password) && userByEmail.getType().equals("admin")) {
                addUserToContext(userByEmail);
                printAdminCommands();
            }
            if (userByEmail.getPassword().equals(password) && userByEmail.getType().equals("user")){
                addUserToContext(userByEmail);
                printUserCommands();
            }
        }catch(UserNotFoundException e){
            System.out.println(e.getMessage());


            return;
        }

    }

    private static void deleteStudentByEmail() {
        System.out.println("please input student email");
        String email = scanner.nextLine();
        studentStorage.deleteByEmail(email);

    }

    private static void deleteLessonsByName() {
        System.out.println("please input lesson name to delete");
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

    private static void loginRegisterCommands(){
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + LOGIN + " for LOGIN");
        System.out.println("please input " + REGISTER + " for REGISTER");
    }

    private static void printAdminCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("please input " + DELETE_LESSONS_BY_NAME + " for DELETE_LESSONS_BY_NAME");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL");
        System.out.println("please input " + ADD_LESSON_TO_STUDENT + " for add lesson to student");

    }

    private static void printUserCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("please input " + ADD_LESSON_TO_STUDENT + " for add lesson to student");

    }

    private static void addUser(){
        System.out.println("please input user name");
        String name = scanner.nextLine();
        System.out.println("please input user surname");
        String surname = scanner.nextLine();
        System.out.println("please input user email");
        String email = scanner.nextLine();
        System.out.println("please input user password");
        String password = scanner.nextLine();
        System.out.println("please input user type");
        String type = scanner.nextLine();
        if (userStorage.getUserByEmail(email) != null){
            System.out.println("User already exists!");
            addUser();
        }
        if (userStorage.getUserByEmail(email) == null && name.length() > 0 && surname.length() > 0 && email.length() > 0
                && password.length() > 0 && type.equals("admin") || type.equals("user")){
            User user = new User(name, surname, email, password, UserType.valueOf(type));
            userStorage.add(user);
            System.out.println("User registered successfully!");
        }
        if (userStorage.getUserByEmail(email) == null && !type.equals("admin") && !type.equals("user")){
            System.out.println("wrong user type!");
            addUser();
        }
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

        Lesson lesson = new Lesson(name, duraction, lectureName, price);
        lessonstorage.add(lesson);
    }

    private static void addStudent() {
        System.out.println("please input student name");
        String name = scanner.nextLine();
        System.out.println("please input student surname");
        String surname = scanner.nextLine();
        System.out.println("please input student age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student email");
        String email = scanner.nextLine();
        System.out.println("please input student phone");
        String phone = scanner.nextLine();
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        System.out.println("\"please input student password\"");
        String password = scanner.nextLine();
        System.out.println("please input student type");
        String type = scanner.nextLine();
        if (lessonName.length() == 0) {
            Student student = new Student(name, surname, age, email, phone);
            studentStorage.add(student);
            System.out.println("student added!");
        }
        if (lessonName.length() != 0 && lessonstorage.getLessonByName(lessonName) != null) {
            Lesson lessonByName = lessonstorage.getLessonByName(lessonName);
            Lesson[] lessons = new Lesson[5];
            for (int i = 0; i < lessons.length; i++) {
                if (lessons[i] == null) {
                    lessons[i] = lessonByName;
                }
            }
            Student student = new Student(name, surname, age, email, phone, lessons);
            studentStorage.add(student);
            loginRegisterCommands();
        }
    }

    private static void addLessonToStudent() {
        System.out.println("please input student email");
        String email = scanner.nextLine();
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        Student studentByEmail = studentStorage.getByEmail(email);
        Lesson lessonByName = lessonstorage.getLessonByName(lessonName);
        if (studentByEmail != null && lessonByName != null) {
            Student byEmail = studentStorage.getByEmail(email);
            Lesson[] lessons = byEmail.getLessons();
            if (lessons == null) {
                Lesson[] studentLessons = new Lesson[5];
                for (int i = 0; i < studentLessons.length; i++) {
                    Lesson getLessonByName = lessonstorage.getLessonByName(lessonName);
                    studentLessons[i] = getLessonByName;
                    break;
                }
                byEmail.setLessons(studentLessons);
                System.out.println("successfully added!");
                return;
            }
            if (lessons != null) {
                for (int i = 0; i < lessons.length; i++) {
                    if (lessons[i] == null) {
                        Lesson getLessonByName = lessonstorage.getLessonByName(lessonName);
                        lessons[i] = getLessonByName;
                        byEmail.setLessons(lessons);
                        System.out.println("successfully added!");
                        return;
                    }
                }
            }
        } else System.out.println("No lesson or student was found!");
    }

    public static void printStudents() {
        System.out.println("here is the list of students");
        studentStorage.print();
    }
}
