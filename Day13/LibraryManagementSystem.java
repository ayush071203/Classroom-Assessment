import java.util.ArrayList;
import java.util.List;

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = "";
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author +
                ", Loan Duration: " + getLoanDuration() + " days, Reserved: " + isReserved);
    }

    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrower = borrower;
            System.out.println(title + " has been reserved by " + borrower);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    protected String getBorrower() { return borrower; }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "The Alchemist", "Paulo Coelho"));
        items.add(new Magazine("M001", "National Geographic", "John Doe"));
        items.add(new DVD("D001", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            item.reserveItem("Alice");
            System.out.println("Available: " + item.checkAvailability());
        }
    }
}
