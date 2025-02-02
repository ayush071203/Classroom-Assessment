public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book2(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Book2 book1 = new Book2("1984", "George Orwell", 15.99, true);
        book1.displayBookDetails();

        System.out.println();

        book1.borrowBook();
        book1.displayBookDetails();

        System.out.println();

        book1.borrowBook();
    }
}
