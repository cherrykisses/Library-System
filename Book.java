import java.util.List;

public class Book {
    
    //Create attributes
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String t, String a, String I)
    {
        title = t;
        author = a;
        ISBN = I;
        isAvailable = true;
    }

    //Getter method
    public String getTitle()
    {
        return title;
    }

    //Setter method
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    //Getter method
    public String getAuthor()
    {
        return author;
    }

    //Setter method
    public void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }

    //Getter method
    public String getISBN()
    {
        return ISBN;
    }

    //Setter method
    public void setISBN(String newISBN)
    {
        ISBN = newISBN;
    }

    //Getter method
    public boolean isAvailable()
    {
        return isAvailable;
    }

    //Setter method
    public void setAvailable(boolean Availability)
    {
        isAvailable = Availability;
    }

public String toString(){
    
    String h= "Title: "+ getTitle()+", Author: "+getAuthor()+", ISBN: "+getISBN()+", Availability: "+ isAvailable();
   // h= "Title: "+ getTitle()+", Author: "+getAuthor()+", ISBN: "+getISBN()+", Availability: "+ isAvailable();
   
          


return h;

}


}