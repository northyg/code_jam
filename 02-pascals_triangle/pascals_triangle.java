/************************************************************
 * 
 * Code Jam Recursion Challenge
 * 4/17/2020
 * pascals_triangle.java JDK 14
 * 
 * WHAT THIS PROGRAM WAS SUPPOSED TO DO:
 * 
 * Compute Pascal's triangle up to a given number of rows.
 * In Pascal's Triangle each number is computed by adding the numbers to the right and left of the current position in the previous row.
 * https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif
 * 
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
# ... etc

* WHAT THE PROGRAM ACTUALLY DOES
* 
* Computes 11 to the power of a user entered Integer, 0 - ?
* 
* WHAT I LEARNED
* 
* While searching for a way to make this program, I came across this page on
* Pascal's triangle https://www.mathsisfun.com/pascals-triangle.html
* It stated that 11^? works to find Pascal's Triangle. 
* I later realized that stops working at 11^5 because the numbers start to roll over;
* A fact that I had initially glossed over in my excitement, whoops!
* 
* Not to be deterred, I decided to use this as a learning experience to work on:
*
* A. Setting up JDK 14 on Windows machine and library's https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Math.html
* B. IO in Java https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/class-use/Scanner.html
* C. Command line menu's in Java and returning numbers in an Int format instead of Double
* D. Recursive calls in Java
* E. Finally, I learned a lot by trying to accomplish things in Java that I've already done in C/C++
************************************************************/

import java.lang.Math;
import java.util.Scanner;

class pascals_triangle {
  public static void main(String[] args) {

    double a = 11;
    double b;
    System.out.print("Welcome to the Magical World of Pascal's triangle err POW MATHS! \n");
    b = testMenu(a);
    computeMaths(a,b-1); // b minus 1 so that it won't return an extra row    
  }

// Menu that asks user for an Integer
static double testMenu(double a){

    // New Scanner Input
    Scanner scan = new Scanner(System.in);

    System.out.print("Spin the wheel and gimme an Integer from 0 to ?! \n");
    double num = scan.nextDouble();

    // Displaying the number 
    System.out.printf("Computing 11 to the power of %.0f\n", num);

    // Finds a to the power of the user entered integer
    double doIt = (Math.pow(a,num));
    System.out.printf("Result: %.0f\n", doIt);
        
    // Closing Scanner after the use
    scan.close();

    return num;
  }

  // Recursive method Computes the power a of b
static void computeMaths(double a, double b) {
    //System.out.printf("%.0f\n", b);
    if (b > 0) {
      computeMaths(a, b - 1);
    }
    
    double test;
    test = (Math.pow(a, b));
    System.out.printf("%.0f\n", test);
  }

} // end class Main 
