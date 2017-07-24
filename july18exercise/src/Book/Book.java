package Book;

import java.util.List;

/**
 * Created by bhirudr on 7/20/2017.
 */
public class Book {
    String title;
    int price;
    String publisher;

    public Book(String title, int price, String publisher) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publisher=" + publisher +
                '}';
    }

    static List<Book> createSampleBookData() {

        Book b1 = new Book("WayOfLife",500,"NoOne");

        return null;
    }
}
