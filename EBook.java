public class EBook extends Book {
    
//Add additional attributes fileSize and format
private int fileSize;
private String format; //e.g, PDF, ePub

public EBook(String t, String a, String I, int fs, String f)
{
    super(t, a, I);
    fileSize = fs;
    format = f;
}

//Getter method
public int getFileSize()
{
    return fileSize;
}

//Setter method
public void setFileSize(int fs)
{
    fileSize = fs;
}

//Getter method
public String getFormat()
{
    return format;
}

//Setter method
public void setFormat(String f)
{
    String hi = f;
    format = hi;
}


public String toString(){
    
    String h;
    h= "Title: "+ getTitle()+", Author: "+getAuthor()+", ISBN: "+getISBN()+", Availability: "+ isAvailable()+", FileSize: "+getFileSize()+", Format: "+getFormat();
   
          


return h;

}

}
