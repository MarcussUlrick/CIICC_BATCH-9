class Book {
    private String title;
    private String Author;
    private int yearPub;
    private double price;

    public Book (String title, String Author, int yearPub, double price){
        this.title = title;
        this.Author = Author;
        this.yearPub = yearPub;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
        "Author: \"" + Author + "\"\n" +
        "Year Published: " + yearPub + "\n" +
        "Price: $" + price;
    }
}


public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John S.", 2021, 39.99);
        Book book2 = new Book("Python", "Jane M.", 2022, 59.99);
        Book book3 = new Book("C++", "Charles L.", 2023, 79.99);

        System.out.println("Book 1:");
        System.out.println(book1.toString());
        System.out.println(); // Empty line for spacing

        System.out.println("Book 2:");
        System.out.println(book2.toString());
        System.out.println(); // Empty line for spacing

        System.out.println("Book 3:");
        System.out.println(book3.toString());

    }
}
