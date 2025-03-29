import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Map<String, Book> books = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 :
                    addBook();
                    break;
                case 2 :
                    borrowBook();
                    break;
                case 3 :
                    returnBook();
                    break;
                case 4 :
                    displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }

    }

            // Method to add a book
            private static void addBook() {
                System.out.print("Enter book title: ");
                String title = sc.nextLine();
                System.out.print("Enter author name: ");
                String author = sc.nextLine();

                books.put(title.toLowerCase(), new Book(title, author));
                System.out.println("Book added successfully.");
            }

            // Method to borrow a book
            private static void borrowBook() {
                System.out.print("Enter book title to borrow: ");
                String title = sc.nextLine().toLowerCase();

                Book book = books.get(title);
                if (book != null) {
                    book.borrowBook();
                } else {
                    System.out.println("Book not found.");
                }
            }

            // Method to return a book
            private static void returnBook() {
                System.out.print("Enter book title to return: ");
                String title = sc.nextLine().toLowerCase();

                Book book = books.get(title);
                if (book != null) {
                    book.returnBook();
                } else {
                    System.out.println("Book not found.");
                }
            }

            // Method to display all books
            private static void displayBooks() {
                if (books.isEmpty()) {
                    System.out.println("No books in the library.");
                } else {
                    for (Book book : books.values()) {
                        System.out.println(book);
                    }
                }
            }
}