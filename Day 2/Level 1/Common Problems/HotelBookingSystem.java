// Creating Class with name HotelBooking 

class HotelBooking {
    // Defining attributes of the HotelBooking class
    String guestName, roomType;
    int nights;

    // Default constructor 
	
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor 
	
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor 
	
    public HotelBooking(HotelBooking copy) {
        this.guestName = copy.guestName;
        this.roomType = copy.roomType;
        this.nights = copy.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() { 
	
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

public class HotelBookingSystem {
    public static void main(String[] args)  
	{
        // Creating a booking using the default constructor
        HotelBooking defaultBooking = new HotelBooking();

        // Creating a booking using the parameterized constructor
        HotelBooking paramBooking = new HotelBooking("John", "Deluxe", 3);

        // Creating a booking using the copy constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);

        // Displaying details of all bookings
        System.out.println("Default Constructor:");
        defaultBooking.displayBookingDetails();

        System.out.println("\nParameterized Constructor:");
        paramBooking.displayBookingDetails();

        System.out.println("\nCopy Constructor:");
        copyBooking.displayBookingDetails();
    }
}
