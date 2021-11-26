package author;

public class AuthorStorage {

    private Author[] authors = new Author[16];
    private int size;

    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            if (authors[i] != null) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void updateAuthor(String email, String name, int age, String surname, String gender) {
        if (getByEmail(email) != null) {
            Author updateAuthor = getByEmail(email);
            updateAuthor.setName(name);
            updateAuthor.setSurname(surname);
            updateAuthor.setEmail(email);
            updateAuthor.setAge(age);
            updateAuthor.setGender(gender);

        }
    }

    public void deleteAuthor(String email) {
        Author tempAuthor = new Author();
        int tempLength = authors.length;
        for (int i = 0; i < tempLength; i++) {
            if (authors[i].getEmail().equals(email)) {
                tempAuthor = authors[i + 1];
                authors[i + 1] = authors[i];
                authors[i] = tempAuthor;
                tempLength--;
            }
        }
    }
}


