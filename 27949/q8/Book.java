package p27949.q8;

import java.util.Date;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN) throws LibraryException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        if (ISBN == null || ISBN.length() < 10) {
            throw new LibraryException("ISBN must be at least 10 characters long");
        }
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
