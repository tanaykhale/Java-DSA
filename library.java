class Information {
    String librarySection;
    int shelfNumber;
    int bookNumber;

    Information(String librarySection, int shelfNumber, int bookNumber) {
        this.librarySection = librarySection;
        this.shelfNumber = shelfNumber;
        this.bookNumber = bookNumber;
    }
}

class Payment {
    double rentalFees;
    double lateFees;
    double totalBalance;

    Payment(double rentalFees, double lateFees, double totalBalance) {
        this.rentalFees = rentalFees;
        this.lateFees = lateFees;
        this.totalBalance = totalBalance;
    }
}

class Book {
    String bookTitle;
    String authorName;
    int publicationYear;
    String genre;
    Information information;
    Payment payment;

    Book(String bookTitle, String authorName, int publicationYear, String genre, Information information,
            Payment payment) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.information = information;
        this.payment = payment;
    }

    void bookDetails() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Library Section: " + information.librarySection);
        System.out.println("Shelf Number: " + information.shelfNumber);
        System.out.println("Book Number: " + information.bookNumber);
        System.out.println("Rental Fees: " + payment.rentalFees);
        System.out.println("Late Fees: " + payment.lateFees);
        System.out.println("Total Balance: " + payment.totalBalance);
    }
}

public class library {
    public static void main(String[] args) {
        Information info = new Information("Fiction", 3, 101);
        Payment payment = new Payment(10.0, 2.0, 15.0);

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", info, payment);
        book.bookDetails();
    }
}
