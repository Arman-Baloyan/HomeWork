package education;
import  java.util.LinkedList;
public class LessonStorage {
    private LinkedList<Lesson>lessons=new LinkedList<>();
    public void add(Lesson lesson){
        if(lesson!=null){
            lessons.add(lesson);
        }
    }
    public void printLessons(){
        for(Lesson lesson:lessons){
            if(lessons!=null){
                System.out.println(lesson);
            }

        }
    }
    public  void deleteLessonsByName(String lessonsName){
        for(Lesson lesson:lessons){
            if(lesson.getName().equals(lessonsName)){
                lessons.remove(lesson);
            }
        }
    }
    public Lesson getLessonByName(String lessonName){
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessonName)){
                return lesson;
            }
        }
        return null;
    }

}




