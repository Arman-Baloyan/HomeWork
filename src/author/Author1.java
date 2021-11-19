package author;

import lesson3.Array;

public class Author1 {
    public Author getByIndex(int index) {
        int size=10;
        if (index < 0 || index > size) {
            System.err.print(index);
            return null;
            
        }

        Author[] array = new Author[0];
        return array[index];
    }
    
    public void print() {
        int size=10;
        for (int i = 0; i < size; i++) {

            boolean array = false;
        }
        System.out.println();
    }
}
