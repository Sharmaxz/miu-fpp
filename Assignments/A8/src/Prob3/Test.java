package Prob3;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("111", "The Hobbit", "J.R.R. Tolkien");
        library.addBook("222", "1984", "George Orwell");
        library.addBook("333", "Clean Code", "Robert C. Martin");

        library.addBook("111", "Duplicate Book", "Unknown");

        System.out.println();

        library.listAllBooks();

        System.out.println();

        library.borrowBook("222");
        library.borrowBook("222");
        library.borrowBook("999");

        System.out.println();

        System.out.println("Is book 222 borrowed? " + library.isBookBorrowed("222"));
        System.out.println("Is book 111 borrowed? " + library.isBookBorrowed("111"));

        System.out.println();

        System.out.println("Details of book 333:");
        System.out.println(library.getBookDetails("333"));

        System.out.println();

        library.listBorrowedBooks();

        System.out.println();

        library.returnBook("222");
        library.returnBook("222");
        library.returnBook("999");

        System.out.println();

        library.listBorrowedBooks();
    }
}