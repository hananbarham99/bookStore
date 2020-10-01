package hanan.birzeit.comp438.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import hanan.birzeit.comp438.example.bookstore.model.Book;
import hanan.birzeit.comp438.example.bookstore.model.BookData;
import hanan.birzeit.comp438.example.bookstore.model.BookFactory;
import hanan.birzeit.comp438.example.bookstore.model.IBookData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGetBooksOnClick(View view) {
        BookFactory factory = new BookFactory();
        IBookData objBook = factory.getModel();
       // BookData objBook = new BookData();
        List<Book> books = objBook.getBooks("thinking222");
        String str = " ";
        for (Book b:books){
            str += b.getTitle()  +"\n" ;
        }
       Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}