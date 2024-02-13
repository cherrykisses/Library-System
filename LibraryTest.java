import java.util.*;

public class LibraryTest {

    public static void main(String[] args)
    {

        ArrayList<Book> books= new ArrayList<Book>();
        Book book1 = (new Book("To Kill a Mockingbird", "Harper Lee", "9780060888695"));
        Book book2 = (new Book("Dracula", "Bram Stoker", "9780194789431"));
        Book book3 = (new Book("Anna Karenina", "Leo Tolstoy", "9780075536321"));
        Book book4 = (new EBook("Frankenstein", "Mary Shelley", "9781460400937", 692, "PDF"));
        Book book5 = (new EBook("Moby Dick", "Herman Melville", "9783741816789", 1, "eBook"));
        Book book6 = (new EBook("War and Peace", "Leo Tolstoy", "9781998114047", 2, "ePub"));
        Book book7 = (new AudioBook("The Resurrectionist", "E.B. Hudspeth", "9781299655960", 11, "MP3"));
        Book book8 = (new AudioBook("The Shining", "Stephen King", "9783785746042", 8, "WAV"));
        Book book9 = (new AudioBook("Classic Horror: Anthology", "Bram Stoker", "9781786647832", 9, "WAV"));

        System.out.println("1: " + book1 + "2: " + book2 + "3: " + book3 + "4: " + book4 + "5: " + book5 + "6: " 
        + book6 + "7: " + book7 + "8: " + book8 + "9: " + book9);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);


        for(int i=0;i<books.size();i++){
            System.out.println((i+1)+": "+books.get(i));
            System.out.println("\n");

        }

        //Simulate checking out and returning a few books
        Library choice= new Library();
        Scanner input= new Scanner(System.in);
        int choose=0;
       

       while(choose !=999){
        String option;
        System.out.println("Would you like to (R)eturn a book or (C)heck a book out?");
        option=input.next();


        if(option.equalsIgnoreCase("C")){
        System.out.println("Which book would you like to check out? Type a number to reference each book. E.g. To Kill A Mockingbird would be 1. Type 999 to quit.");
        choose=input.nextInt();
        
        choice.displayBooks();

        switch(choose)
        {
            case 1:
            System.out.println("You have successfully checked out the book: To Kill a Mockingjay");
            book1.setAvailable(false);
            break;
            
            case 2:
            System.out.println("You have successfully checked out the book: Dracula");
            book2.setAvailable(false);
            break;
            
            case 3:
            System.out.println("You have successfully checked out the book: Anna Karenina");
            book3.setAvailable(false);
            break;
            
            case 4:
            System.out.println("You have successfully checked out the book: Frankeinstein");
            book4.setAvailable(false);
            break;
            
            case 5:
            System.out.println("You have successfully checked out the book: Moby Dick");
            book5.setAvailable(false);
            break;

            case 6:
            System.out.println("You have successfully checked out the book: War and Peace");
            book6.setAvailable(false);
            break;

            case 7:
            System.out.println("You have successfully checked out the book: The Resurrectionist");
            book7.setAvailable(false);
            break;

            case 8:
            System.out.println("You have successfully checked out the book: The Shining");
            book8.setAvailable(false);
            break;

            case 9:
            System.out.println("You have successfully checked out the book: Classic Horror: Anthology");
            book9.setAvailable(false);
            break;

            default:
            System.out.println("The book you have selected does not exist. Please try again.");
        }
 }
         else if(option.equalsIgnoreCase("R")){
        System.out.println("Which book would you like to return? Type a number to reference each book. E.g. To Kill A Mockingbird would be 1");
        choose=input.nextInt();

        switch(choose)
        {
            case 1:
            if(book1.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: To Kill a Mockingjay");
            }else
                {
                System.out.println("You have not checked out this book");
                }
            break;
            case 2:
            if(book2.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: Dracula");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            case 3:
            if(book3.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: Anna Karenina");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            case 4:
            if(book4.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: Frankeinstein");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            case 5:
            if(book5.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: Moby Dick");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            case 6:
            if(book6.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: War and Peace");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            case 7:
            if(book7.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: The Resurrectionist");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            case 8:
            if(book8.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: The Shining");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            case 9:
            if(book9.isAvailable()==false)
            {
                System.out.println("You have successfully returned the book: Classic Horror: Anthology");
            }
            else
                {
                    System.out.println("You have not checked out this book");
                }
            break;
            default:
            System.out.println("The book you have selected does not exist. Please try again. ");
        }
    }else{

        System.out.println("Invalid Choice. Pick Again");
    }
    }
    }
}