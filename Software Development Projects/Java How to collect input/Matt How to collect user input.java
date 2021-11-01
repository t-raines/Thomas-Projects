import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter A Time: "); // Prompt user to enter time

    String timeString = myObj.nextLine();  // Read user input

    System.out.println("Enter a Date: "); // prompt user to enter date

    String dateString = myObj.nextLine(); // store that input into date string (read the user input) 


    System.out.println("Time is: " + timeString + " and The date is: " + dateString);  // Output user input. This is contatenation of variables and strings
  }
}