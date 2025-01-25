package singleinheritance.LibraryManagement;
public class Author extends Book { // Extend Book directly
        String name;
        String bio;

        // Overriding displayInfo to include author details

        public void displayInfo() {
            // Call the displayInfo of the superclass to show book details
            super.displayInfo();

            // Add author details
            System.out.println("Author Name: " + name);
            System.out.println("Author Bio: "  + bio);
        }
    }