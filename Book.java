public class Book {
    private String title, author;
    private boolean isBookAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBookAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    public void borrowBook() {
        if (isBookAvailable) {
            isBookAvailable = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Sorry, this book is currently not available");
        }
    }

    public void returnBook() {
        isBookAvailable = true;
        System.out.println("Book returned successfully");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBookAvailable=" + isBookAvailable +
                '}';
    }
}
