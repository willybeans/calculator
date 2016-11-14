
// link for validating user input using system.in:
//  http://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner


//problems to still solve :
 // how do you get the program to loop back to the top if there is either
// a mistake or if they select the clear all option
//
package dp2;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class DP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int selection, num1, num2, total;
        boolean finish = true;
     
        System.out.println("Welcome to Will's Calculator.");
        
        while (finish) {
        System.out.println( "What is the first number of your equation?");
        num1 = sc.nextInt();
        
        System.out.println("What is your second number in your equation?");
        num2 = sc.nextInt();
        
        //do {
        System.out.println("Would you like to: \n" 
                + "1 - Add"
                + "2 - Substract \n"
                + "3 - Multiply \n"
                + "4 - Divide \n"
                + "5 - Start Over \n"
                + "6 - End Program \n" // this is bad cause its out of order with the flow
                + "Please use numbers to make your selection");
        

        while (!sc.hasNextInt()) {
        System.out.println("Not a number you smartass");
        sc.next();
        }
        selection = sc.nextInt();
        
        if (selection == 1) {
            total = (num1 + num2);
            System.out.println(total);
        }
        else if (selection == 2) {
            total = (num1 - num2);
            System.out.println(total);
        }
        else if (selection == 3){
            total = (num1 * num2);
            System.out.println(total);
        }
        else if (selection == 4){
            total = (num1 / num2);
            System.out.println(total);
        }
        else if (selection == 5) {
            //find a way to clear
        }
        else if (selection == 6){
            finish = false;
        }
        else {
            System.out.println("Seems an error as occured"); 
        }
        
        }
        
    }
    
}
