package ProblemStatement.LibraryManagementSystem;

//Create an abstract class LibraryItem with the following attributes and methods:
public abstract class LibraryItem {
    //instance variables
    private final int ITEMID;
    private String title;
    private String author;

    //constructor for initializing the instance variables
    public LibraryItem(int itemid, String title, String author) {
        this.ITEMID = itemid;
        this.title = title;
        this.author = author;
    }

    //getter method for ITEMID
    public int getITEMID() {
        return ITEMID;
    }

    //getter and setter methods for title and author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //abstract method getLaonDuration
    public abstract int getLaonDuration();

    //method getItemDetails to display the details of the item
    public void getItemDetails(){
        System.out.println("Item Id: "+ ITEMID);
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
    }
}