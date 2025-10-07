package com.pluralsight;

import java.util.Scanner;

public class Library {
     Book[] books = new Book[] {
            new Book(1, "9780140449136", "The Odyssey", false, ""),
            new Book(2, "9780439139601", "Harry Potter and the Goblet of Fire", true, "User123"),
            new Book(3, "9780141439600", "Pride and Prejudice", false, ""),
            new Book(4, "9780307476463", "The Road", true, "User456"),
            new Book(5, "9780743273565", "The Great Gatsby", false, ""),
            new Book(6, "9780553386790", "A Game of Thrones", true, "User789"),
            new Book(7, "9780061120084", "To Kill a Mockingbird", false, ""),
            new Book(8, "9780385472579", "Zen and the Art of Motorcycle Maintenance", false, ""),
            new Book(9, "9780345339706", "The Hobbit", true, "User234"),
            new Book(10, "9781451673319", "Fahrenheit 451", false, ""),
            new Book(11, "9780142437230", "Moby-Dick", false, ""),
            new Book(12, "9780060850524", "Brave New World", true, "User876"),
            new Book(13, "9780143105985", "Meditations", false, ""),
            new Book(14, "9780525566151", "Where the Crawdads Sing", false, ""),
            new Book(15, "9780679783268", "1984", true, "User345"),
            new Book(16, "9780747532743", "Harry Potter and the Philosopher's Stone", false, ""),
            new Book(17, "9780812981605", "The Power of Habit", false, ""),
            new Book(18, "9780307277671", "The Kite Runner", true, "User567"),
            new Book(19, "9780316769488", "The Catcher in the Rye", false, ""),
            new Book(20, "9780062315007", "Sapiens: A Brief History of Humankind", true, "User999")
    };
    public void homeScreen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option by number\n 1. Show available books\n 2. Show checked out books\n 3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1){
            System.out.println("You chose 1");
            for (Book book : books){
                System.out.println(book.getTitle());
            }
        }else if (choice == 2) {
            System.out.println("You chose 2");
            for (Book book : books){
                if (book.isCheckedOut() == true){
                    System.out.println(book.getTitle());
                }
            }
        }else if (choice == 3) {
            System.out.println("Exit");
            System.exit(0);
        }
    }
    public void availableBooks(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one: 1. Select a book to check out or 2. go back to home screen");
        int choice2 = scanner.nextInt();
        scanner.nextLine();
        if (choice2 == 1){
            System.out.println("You chose 1");
            for (Book book : books) {
                if (book.isCheckedOut() == false){
                    System.out.println(book.getTitle() + " " + book.getId());
                }
            }
        }else if(choice2 == 2){
            System.out.println("Exit");
            homeScreen();
        }
        int booknr = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        Book checkedOutBook = books[booknr - 1];
        checkedOutBook.setCheckedOut(true);

    }
    public void checkedOutBooks(){

    }
    public void checkInABook(){

    }
    public static void main(String[] args) {
    Library library = new Library();
    library.homeScreen();
    library.availableBooks();
    }
}
