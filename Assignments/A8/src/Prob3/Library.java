package Prob3;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("A book with ISBN " + ISBN + " already exists.");
        } else {
            Book book = new Book(ISBN, title, author);
            books.put(ISBN, book);
            System.out.println("Book added successfully: " + title);
        }
    }

    public void borrowBook(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist.");
            return;
        }

        Book book = books.get(ISBN);

        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed: " + book.getTitle());
        } else {
            book.setBorrowed(true);
            System.out.println("Book borrowed successfully: " + book.getTitle());
        }
    }

    public void returnBook(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist.");
            return;
        }

        Book book = books.get(ISBN);

        if (!book.isBorrowed()) {
            System.out.println("Book was not borrowed: " + book.getTitle());
        } else {
            book.setBorrowed(false);
            System.out.println("Book returned successfully: " + book.getTitle());
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist.");
            return false;
        }

        return books.get(ISBN).isBorrowed();
    }

    public Book getBookDetails(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist.");
            return null;
        }

        return books.get(ISBN);
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("All books in the library:");
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void listBorrowedBooks() {
        boolean found = false;
        System.out.println("Borrowed books:");

        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No borrowed books.");
        }
    }
}