package hanan.birzeit.comp438.example.bookstore.model;

import java.util.ArrayList;
import java.util.List;

public class BookData implements IBookData {
    private ArrayList<Book> books = new ArrayList<>();

public BookData(){

    books.add(new Book (300, "thinking in java", "java" ));
    books.add(new Book (3, "java", "thinking222" ));
    books.add(new Book (1300, "c", "c" ));
    books.add(new Book (30, "xxxxxxxxxxxx", "python" ));
    books.add(new Book (340, "javaScript", "th" ));
}

public List<Book> getBooks(String cat){
    ArrayList<Book> data = new ArrayList<>();
    for(Book b :books){
        if (b.getCategory().equals(cat)){
            data.add(b);
        }
    }
     return data;
    // here will be dataBase connection (sql or web service)
}

    @Override
    public String[] getCatigories() {
    String[] cats = new String[] {"java","c" , "python"};
    return cats;
    }


}
