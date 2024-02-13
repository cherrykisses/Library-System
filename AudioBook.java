public class AudioBook extends Book {

    //Create attributes
    private int duration; //Duration in hours
    private String audioFormat; //e.g., MP3, WAV

    public AudioBook(String t, String a, String I, int d, String af)
    {
        super(t, a, I);
        duration = d;
        audioFormat = af;
    }

    //Getter method
    public int getDuration()
    {
        return duration;
    }

    //Setter method
    public void setDuration(int d)
    {
        duration = d;
    }

    //Getter method
    public String getAudioFormat()
    {
        return audioFormat;
    }

    //Setter methody
    public void setAudioFormat(String af)
    {
        String audio = af;
        audioFormat = audio;
    }



    public String toString(){
    
        String h;
        h= "Title: "+ getTitle()+", Author: "+getAuthor()+", ISBN: "+getISBN()+", Availability: "+ isAvailable()+", Duration: "+getDuration()+", Format: "+getAudioFormat();
       
              
    
    
    return h;
    
    }
}