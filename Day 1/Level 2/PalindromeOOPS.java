import java.util.*;

// Creating Class with name CheckPalindrome to check if a given string is a palindrome 

class CheckPalindrome {

    private String text;

    // Creating Constructor to initialize the text attribute 
	
    public CheckPalindrome(String text) {                   // public constructor
        this.text = text;
    }

    // Creating Method with name isPalindrome to check if the text is a palindrome 
	
    public boolean isPalindrome() 
	{
        int left = 0;
        int right = text.length() - 1;

        while (left < right) 
		{
            if (text.charAt(left) != text.charAt(right)) 
			{
                return false;
            }
			
            left++;
            right--;
        }
        return true;
    }

    // Creating Method with name displayResult to display if the text is a palindrome 
	
    public void displayResult() 
	{
        if (isPalindrome()) 
		{
            System.out.println(text + " is a palindrome.");
        } 
		else 
		{
            System.out.println(text + " is not a palindrome.");
        }
    }
}

public class PalindromeOOPS {

    // Main method to run the program
	
    public static void main(String[] args) {
		
        // Creating Scanner object to read user input
		
        Scanner scanner = new Scanner(System.in);

        // taking the input from the user 
		
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Creating an object 
		
        CheckPalindrome obj = new CheckPalindrome(input);

        // Calling displayResult to show the result
        obj.displayResult();

        // Closing the scanner object
        scanner.close();
    }
}
