import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library()
    {
        books = new ArrayList<Book>();
    }





    //Method to add books to the collection
    public void addBook(Book book)
    {
        books.add(book);
    }

    //Method to check out books (mark as not available)
    public void checkOutBook(String I)
    {
        for (Book book: books)
        {
            if (book.getISBN().equals(I) && book.isAvailable())
            {
                book.setAvailable(false);
                break;
            }
        }
    }

    //Method to return books (mark as not available)
    public void returnBook(String I)
    {
        for (Book book: books)
        {
            if (book.getISBN().equals(I) && !book.isAvailable())
            {
                book.setAvailable(true);
                break;
            }
        }
    }

    //Method to display details of all books
    public void displayBooks()
    {
          for (Book book: books)
        {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " +
            book.getISBN() + ", Availability: " + book.isAvailable());
            if (book instanceof EBook)
            {
                EBook EBook = (EBook) book;
                System.out.println(", File Size: " + EBook.getFileSize() + ", Format: " + EBook.getFormat());
            }
            else if (book instanceof AudioBook)
            {
                AudioBook audioBook = (AudioBook) book;
                System.out.println(", Duration in hours: " + audioBook.getDuration() + ", Audio Format: " + audioBook.getAudioFormat());
            }
            System.out.println("-----");


        }
    }

}
