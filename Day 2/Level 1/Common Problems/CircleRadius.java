class Circle
{
    double radius; 

    Circle()
    {
        System.out.println("The Default constructor called");     // getter and setters 
		radius = 5;
    }
 
    // parameterized constructor 
    Circle(double radius)
    {
		this();                                                           //    calling the default constructor
        this.radius = radius;                                                     
		System.out.println("Radius of Circle: " + radius + " cm");
        System.out.println("The Parameterized constructor called");
    }
 
    void display() 
	{
	System.out.println("Radius of Circle: " + radius + " cm"); 
	}
}
 
public class CircleRadius{

    public static void main(String args[])
    {
		Circle circle2 = new Circle(32.0);                // object created for parameterized constructor
		circle2.display(); 
		
    }
}