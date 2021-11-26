package author;
import java.util.Arrays;
import java.util.Scanner;
public class AuthorBookTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";
    private static final String DELETE_BOOK = "12";
    private static final String DELETE_AUTHOR = "13";
    private static final String DELETE_BY_AUTHOR = "14";

    public static void main(String[] args) {

        authorStorage.add(new Author("poxos", "poxosyan", 22, "poxos@mail.com", "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan", 23, "poxosuhi@mail.com", "female"));
        authorStorage.add(new Author("petros", "petrosyan", 25, "petros@mail.com", "male"));



        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    updateAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    updateBookAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BY_AUTHOR:
                    deleteAuthorAllBooks();
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        }
    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        if (keyword.length() == 0) {
            System.out.println("Wrong input!");
            return;
        }
        bookStorage.searchByTitle(keyword);
    }

    private static void addBook() {

        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        } else {
            System.out.println("invalid email! please try again");
            addBook();
        }

    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for searching books by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count books by author");
        System.out.println("please input " + CHANGE_AUTHOR + " for changing author");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " for changing book author");
        System.out.println("please input " + DELETE_BOOK + " for delete book by title");
        System.out.println("please input " + DELETE_AUTHOR + " for delete author");
        System.out.println("please input " + DELETE_BY_AUTHOR + " for delete book by author");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you, author was added");
        }

    }

    private static void updateAuthor() {
        System.out.println("please input author email");
        String email = scanner.nextLine();
        if (authorStorage.getByEmail(email) == null) {
            System.out.println("Author was not found!");
            updateAuthor();
        }
        System.out.println("input author new name");
        String name = scanner.nextLine();
        System.out.println("input author new surname");
        String surname = scanner.nextLine();
        System.out.println("input author new age");
        int age = scanner.nextInt();
        System.out.println("input author new gender");
        String gender = scanner.nextLine();
        authorStorage.updateAuthor(name, surname, age, email, gender);
        System.out.println("Author was updated");
    }

    private static void searchBookByAuthor() {
        System.out.println("please input author email");
        String inputtedEmail = scanner.nextLine();
        if (authorStorage.getByEmail(inputtedEmail) == null) {
            System.out.println("No author was found!");
            searchBookByAuthor();
        }
        Author authorByEmail = authorStorage.getByEmail(inputtedEmail);
        System.out.println("Following books are found!");
        Book[] byAuthor = bookStorage.getByAuthor(authorByEmail);
        System.out.println(Arrays.toString(byAuthor));

    }

    private static void countBooksByAuthor() {
        System.out.println("please input author email");
        String email = scanner.nextLine();
        if (authorStorage.getByEmail(email) == null) {
            System.out.println("No author was found!");
            countBooksByAuthor();
        }
        Author byEmail = authorStorage.getByEmail(email);
        int bookCountByAuthor = bookStorage.getBookCountByAuthor(byEmail);
        System.out.println("Count is: " + bookCountByAuthor);
    }

    private static void updateBookAuthor() {
        System.out.println("please input book title");
        String inputtedTitle = scanner.nextLine();
        Book searchedBook = bookStorage.searchByTitle(inputtedTitle);
        if (searchedBook == null) {
            System.out.println("No books found!");
            updateBookAuthor();
        }
        System.out.println("please input new author email");
        String inputtedEmail = scanner.nextLine();
        Author searchedAuthor = authorStorage.getByEmail(inputtedEmail);
        if (searchedAuthor == null) {
            System.out.println("Author not found!");
            updateBookAuthor();
        }
        searchedBook.setAuthor(searchedAuthor);
        bookStorage.add(searchedBook);
        System.out.println("Book author changed!");
        System.out.println(searchedBook);
    }

    private static void deleteBook(){
        System.out.println("please input book title to delete a book");
        String title = scanner.nextLine();
        bookStorage.deleteBook(title);
    }

    private static void deleteAuthorAllBooks(){
        System.out.println("please input author email");
        String email = scanner.nextLine();
        Author byEmail = authorStorage.getByEmail(email);
        if (byEmail == null){
            System.out.println("No author was found!");
            deleteAuthorAllBooks();
        }
        bookStorage.deleteBookByAuthor(byEmail);
        System.out.println("Author books were deleted!");
    }

    private static void deleteAuthor(){
        System.out.println("please input email to delete author");
        String email = scanner.nextLine();
        if (authorStorage.getByEmail(email) == null){
            System.out.println("No author was found!");
            deleteAuthor();
        }
        authorStorage.deleteAuthor(email);
        System.out.println("Author was deleted!");
    }


}


