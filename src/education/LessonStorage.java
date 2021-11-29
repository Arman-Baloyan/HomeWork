package education;

import author.Book;

public class LessonStorage {

    private Lesson[] lessons = new Lesson[16];
    private int size = 0;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;

    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }


    public void printLessons() {
        for (int i = 0; i < size; i++) {
            if (lessons[i] != null) {
                System.out.println(lessons[i]);
            }
        }
    }


    public void deleteLessonsByName(String lessonName) {
        Lesson tempLesson = new Lesson();
        int tempLength = lessons.length;
        for (int i = 0; i < tempLength; i++) {
            if (lessons[i].getName().equals(lessonName)) {
                tempLesson = lessons[i + 1];
                lessons[i + 1] = lessons[i];
                lessons[i] = tempLesson;
                tempLength--;


            }


        }


    }
}