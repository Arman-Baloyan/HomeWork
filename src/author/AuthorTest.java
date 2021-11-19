package author;
import java.util.Scanner;
public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println();
int x=scanner.nextInt();
AuthorStorage authorStorage=new AuthorStorage();
        for (int i = 0; i < x; i++) {
            System.out.print("ИМЯ");
            String name=scanner.next();
            System.out.print("ФАМИЛИЯ");
            String surname=scanner.next();
            System.out.print("ИМЕЙЛ");
            String email=scanner.next();
            System.out.print("ВОЗРАСТ");
            String age=scanner.next();
            System.out.print("ПОЛ");
            String gender=scanner.next();
            Author author=new Author(name,surname,email,age,gender);
            authorStorage.Add(author);

            authorStorage.println();
        }

        }
    }

