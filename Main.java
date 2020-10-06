import java.util.Scanner;

/**
 *This proram shows a multiplication table for the users given number
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a Scanner
    Scanner input = new Scanner(System.in);

    //asks user to input number
    System.out.println("Please enter an integer to create a multiplication table for");
    //creates intergers for the usersnumber and the product
    int userNumber = input.nextInt();
    int product;

    //creates for loop for integer
    for(int multicator = 1; multicator <= 12; multicator++){
      //multiplys to get quoicent
      product = userNumber * multicator;
      //prints out the given equation
      System.out.println(multicator + " x " + userNumber + " = " + product);
    }
    
  }
}
