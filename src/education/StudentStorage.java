package education;





public class StudentStorage {

    private Student[] students = new Student[15];
    private int size;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, size);
        students = tmp;
    }

        public void print (){
        for (int i = 0; i < size; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }

        }
    }


    public void printStudentsByLesson(String lessonName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getLesson().getName().equals(lessonName)) {
                System.out.println(students[i]);
            }

        }


    }






    public void deleteByEmail(String email) {
        Student tempStudent = new Student();
        int tempLength = students.length;
        for (int i = 0; i < tempLength; i++) {
            if (students[i].getName().equals(email)) {
                tempStudent = students[i + 1];
                students[i + 1] = students[i];
                students[i] = tempStudent;
                tempLength--;


            }
        }
    }
}