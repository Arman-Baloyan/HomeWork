package education;
import java.util.LinkedList;

public class StudentStorage {
    private LinkedList<Student> students = new LinkedList<>();



    public void add(Student student) {
        if (student != null){
            students.add(student);
        }
    }

    public void print(){
        for (Student student : students) {
            if(student != null){
                System.out.println(student);
            }
        }
    }

    public void printStudentsByLesson(String lessonName) {

        for (Student student : students) {
            Lesson[] lesson = student.getLessons();
            for (int i = 0; i < lesson.length; i++) {
                if(lesson[i].getName().equals(lessonName)){
                    System.out.println(student);
                }
            }
        }
    }

    public Student getByEmail(String email){
        for (Student student : students) {
            if(student.getEmail().equals(email)){
                return student;
            }
        }
        return null;
    }


    public void deleteByEmail(String email) {

        for (Student student : students) {
            if(student.getEmail().equals(email)){
                students.remove(student);
            }
        }
    }

}

