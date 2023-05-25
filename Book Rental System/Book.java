//note: this program only works in VSCode

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookRentalSystem {

    class Book {
         String title;
         String author;
         int yearofpublication;
         int copies;
    
        public Book(String title, String author, int year, int copies) {
            this.title = title;
            this.author = author;
            this.yearofpublication = year;
            this.copies = copies;
        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        public int getYear() {
            return yearofpublication;
        }    
        public int getCopies() {
            return copies;
        }
        public void setCopies(int copies) {
            this.copies = copies;
        }
    }
     Map<Integer, Book> books;
     int nextIndex;

    public BookRentalSystem() {
        books = new HashMap<>();
        nextIndex = 1;
    }

    public void addBook(String title, String author,int yearofpublication, int copies) {
        Book book = new Book(title, author, yearofpublication, copies);
        books.put(nextIndex, book);
        nextIndex++;
    }

    public void borrowBook(int index) {
        Book book = books.get(index);
        if (book == null) {
            System.out.println("Book Unavailable");
            return;
        }
        if (book.getCopies() == 0) {
            System.out.println("Book No Longer Available :(");
            return;
        }
        book.setCopies(book.getCopies() - 1);
        System.out.println("Book Successfully Borrowed!");
    }

    public void printBookList() {
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            int index = entry.getKey();
            Book book = entry.getValue();
            System.out.printf("%d. %s by %s (%d, %d copies available)\n",
            index, book.getTitle(), book.getAuthor(), book.getYear(), book.getCopies());
        }
    }


    public static void main(String[] args) {
        BookRentalSystem rentalSystem = new BookRentalSystem();
        rentalSystem.addBook("Artemis Fowl", "Eoin Colfer",2001,3);
        rentalSystem.addBook("Divergent", "Veronica Roth",2011,4);
        rentalSystem.addBook("Percy Jackson: The Lightning Thief", "Rick Riordan",2005,7);
        rentalSystem.addBook("Pride and Prejudice", "Jane Austen",1813,1);
        rentalSystem.addBook("To Kill a Mockingbird", "Harper Lee",1960,2);

        Scanner scanner = extracted();
        while (true) {
            System.out.println("Which book would you like to borrow?");
            rentalSystem.printBookList();
            int index = scanner.nextInt();
            rentalSystem.borrowBook(index);
            System.out.println();
        }
    }

    private static Scanner extracted() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}

class Book {
     String title;
     String author;
     int yearofpublication;
     int copies;

    public Book(String title, String author,int yearofpublication, int copies) {
        this.title = title;
        this.author = author;
        this.yearofpublication = yearofpublication;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return yearofpublication;
    }
    public int getCopies() {
        return copies;
    }
    public void setCopies(int copies) {
        this.copies = copies;
    }
}
