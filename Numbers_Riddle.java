/*=============================================================================
 |   Assignment:  Project 1.6 Numbers Riddle
 |       Author:  [Noah Matsukuma (201211329@gmail.com)]
 |      
 |  Course Name:  AP Computer Science A
 |   Instructor:  Mr. Jonathan Virak
 |     Due Date:  9/27/24
 |
 |  Description:  Algorithm that always returns 3 when a numerical value
 |                is inputted by user. Shows the user each step of its 
 |                computation leading to that solution
 |                 
 |
 |     Language:  Java           
 |                
 | Deficiencies:  All requirements satisfied and no logic errors.
 *===========================================================================*/

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers_Riddle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat ft = new DecimalFormat("#.##########");     
        while (true) { 
            System.out.print("\nEnter any value:   ");
            try{
                double x = sc.nextDouble(); // decimal input is set 
                double temp = x;
                if (x%1 == 0){
                    ft = new DecimalFormat("####");     
                }
                System.out.println("\n1. Double the value:          " + ft.format(temp) + " * 2 = " + ft.format(temp = temp * 2)); // double it
                System.out.println("2. Add 6 on the value:        " + ft.format(temp) + " + 6 = " + ft.format(temp = temp + 6)); // add six
                System.out.println("3. Divide the value in half:  " + ft.format(temp) + " / 2 = " + ft.format(temp = temp / 2)); // divide it in half
                System.out.println("4. Subtract by initial value: " + ft.format(temp) + " - " + ft.format(x) +" = " + ft.format(temp = temp - x)); // subtract the number you started with
                System.out.println("\nFinal Value:    " + ft.format(temp) + "\n"); // shows result
                break;
            }catch (InputMismatchException e) {
                System.out.println("Please input a number");
                sc.nextLine(); //Loops the thing
            }
        }
    }
}
    
