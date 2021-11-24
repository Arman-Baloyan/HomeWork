package author;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                return books[i];
            }
        }
        return null;
    }

    public Book[] getByAuthor(Author author){

        int temp = 1;
        Book [] returnBooks = new Book[temp];
        for (Book book : books) {
            if (book != null && book.getAuthor().equals(author)) {
                for (int i = 0; i < returnBooks.length; i++) {
                    if (returnBooks[i] == null){
                        returnBooks[i] = book;
                    }
                    temp++;
                }
            }
        }
        return returnBooks;
    }

    public int getBookCountByAuthor(Author author){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)){
                count++;
            }
        }
        return count;
    }

}


