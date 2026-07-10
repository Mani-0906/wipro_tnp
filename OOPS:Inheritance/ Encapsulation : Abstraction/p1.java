import java.util.*;
class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Author Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Author Gender (M/F): ");
        char gender = sc.next().charAt(0);

        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity in Stock: ");
        int qty = sc.nextInt();

        Author a = new Author(authorName, email, gender);
        Book b = new Book(bookName, a, price, qty);

        System.out.println("\nBook Details");
        System.out.println("Book Name : " + b.getName());
        System.out.println("Price : " + b.getPrice());
        System.out.println("Quantity : " + b.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("Name : " + b.getAuthor().getName());
        System.out.println("Email : " + b.getAuthor().getEmail());
        System.out.println("Gender : " + b.getAuthor().getGender());
    }
}