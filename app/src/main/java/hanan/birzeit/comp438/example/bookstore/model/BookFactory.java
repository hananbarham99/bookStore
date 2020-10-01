package hanan.birzeit.comp438.example.bookstore.model;

public class BookFactory {
    public IBookData getModel(){
        //if statement to check the internet connections
        return  new BookData();
    }

}
