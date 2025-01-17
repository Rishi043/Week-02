// Creating Class with name Circle 
class Circle {
    double radius; // Attribute to store the radius of the circle

    // Constructor for Circle class to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
	
    double calculateArea() {
        return (Math.PI * radius * radius);      // Using formula: Area = π * r^2
    }

    // Method to calculate and return the circumference of the circle
	
    double calculateCircumference() {
        return (2 * Math.PI * radius);         // Using formula: Circumference = 2 * π * r
    }

    // Method to display the area and circumference of the circle
	
    void displayDetails() {
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
	}
}

// Main class 
public class CircleDetails {
    public static void main(String[] args) {
        // Creating a Circle object with radius 5.0
        Circle circle = new Circle(8);

        // Displaying the area and circumference of the circle
        circle.displayDetails();
    }
}
