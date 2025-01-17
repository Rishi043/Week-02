import java.util.Scanner;

// Creating a class Movieticket with variables for moviename, seatnumber and price.

class MovieTicket{
    String movieName; 
	int seatNumber; 
	double price; 
	
    // Creating Constructor
	
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1;                    // no seat assigned 
        this.price = 0;                         // Default price before booking
    }

    // Creating Method with name bookTicket to assign the seat and the price 
	
    void bookTicket(int seatNumber, double price) 
	{
        if (this.seatNumber == -1)              // Checking if the seat is not already booked
		{                   
            this.seatNumber = seatNumber;
            this.price = price;
			
            System.out.println("Ticket successfully booked!");
        } 
		else 
		{
            System.out.println("This Seat is already booked.");
        }
    }

    // Creating Method with name displayDetails to display ticket information 
	
    public void displayDetails() 
	{
        if (seatNumber == -1)         // Checking if the ticket is not booked
		{ 
            System.out.println("No ticket booked yet.");
        } 
		else 
		{
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }
}

public class MovieTicketBooking {

    // Main method 
	
    public static void main(String[] args) { 
	
        // Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine();

        MovieTicket ticket = new MovieTicket(movieName);           // putting the value as mentioned on the constructor

        System.out.print("Enter seat number to book: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        // Booking the ticket
        ticket.bookTicket(seatNumber, price);

        // Displaying the ticket details 
		
        System.out.println("Ticket Details:");
		System.out.println("---------------------------");
        ticket.displayDetails();

        // Closing the scanner obj
        scanner.close();
    }
}
