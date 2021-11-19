package author;

public class AuthorStorage {

private Author[]array;
private int size=0;
AuthorStorage(){
    array=new Author[10];
}
public  void Add(Author author){
    if(array.length==size){
        extend();
    }
    array[size++]=author;
}
private void extend(){
    Author[]regex=new Author[array.length+(((array.length)))];
        for (int i = 0; i < array.length; i++) {
            regex[i]=array[i];

        }
        array=regex;
    }

    public void println() {
    }
}




