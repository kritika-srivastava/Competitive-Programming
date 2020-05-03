class Book {
    private String code;
    private String title;
    private double price;

    public Book(String bookCode, String t, double pr) {
        code = bookCode;
        title = t;
        price = pr;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class BookStore {
    public static void main(String Args[]) {
        Book book1 = new Book("Tech101", "Learning Java", 175.00);
        Book book2 = new Book("Fict101", "Your Stories", 225.00);
        Book book3 = new Book("Myth101", "Philosophy of Faith", 375.00);
        System.out.println("Book 1 Details");
        System.out.println(
                "Code : " + book1.getCode() + " , Title : " + book1.getTitle() + " , Price :" + book1.getPrice());
        System.out.println("Book 2 Details");
        System.out.println(
                "Code : " + book2.getCode() + " , Title : " + book2.getTitle() + " , Price :" + book2.getPrice());
        System.out.println("Book 3 Details");
        System.out.println(
                "Code : " + book3.getCode() + " , Title : " + book3.getTitle() + " , Price :" + book3.getPrice());
    }
}
