package Test.Day_32.Practice_3;

public class Book {

    String nameOfBook;
    int numberOfPages;
    String nameOfAuthor;
    int publishDate;
    double price;

    public Book(String nameOfBook, int numberOfPages, String nameOfAuthor, int publishDate, double price) {
        this.nameOfBook = nameOfBook;
        this.numberOfPages = numberOfPages;
        this.nameOfAuthor = nameOfAuthor;
        this.publishDate = publishDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", nameOfAuthor='" + nameOfAuthor + '\'' +
                ", publishDate=" + publishDate +
                ", price=" + price +
                '}';
    }
}
