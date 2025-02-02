public class Book {
    public String ISBN;     
    protected String title;  
    private String author;   

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);     
        System.out.println("Title: " + title);   
        System.out.println("Author: " + getAuthor()); 
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "The Great Adventure", "Jane Doe");
        
        ebook.displayEBookDetails();

        ebook.setAuthor("John Smith");
        System.out.println("\nUpdated Author: " + ebook.getAuthor());
    }
}
