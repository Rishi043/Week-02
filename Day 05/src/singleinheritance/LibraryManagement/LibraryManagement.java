package singleinheritance.LibraryManagement;

public class LibraryManagement {

    public static void main(String[] args) {

        // Create an Author object with predefined values
        Author author = new Author();

        // Set book details
        author.title = "If we become Strangers Again";
        author.publicationYear = 2024;

        // Set author details
        author.name = "Unknown";
        author.bio = "An Indian writer!!!";

        // Display the details of the book and author
        System.out.println("--- Book and Author Details ---");
        author.displayInfo();
    }
}
