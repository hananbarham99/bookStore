package hanan.birzeit.comp438.example.bookstore.model;

import java.util.ArrayList;
import java.util.List;

public class BookData implements IBookData {
    private ArrayList<Book> books = new ArrayList<>();

public BookData(){

    books.add(new Book (300, "DataStructure", "thinking" ));
    books.add(new Book (3, "java", "thinking222" ));
    books.add(new Book (1300, "c", "c1" ));
    books.add(new Book (30, "c#", "cccc" ));
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


}
