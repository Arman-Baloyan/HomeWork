package lesson11;

public class StudentTest {

    public static void main(String[] args) {

        Student poxos= new Student("Poxos","Poxosyan","0123456789",23,"Java");
        System.out.println(poxos.getName());
        poxos.setName("poxosik");
        System.out.println();
    }
}
