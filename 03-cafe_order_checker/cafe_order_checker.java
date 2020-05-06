/************************************************************
 * 
 * Code Jam Cafe Order Checker
 * 5/5/2020
 * cafe_order_checker.java JDK 14
 * 
 * https://www.interviewcake.com/question/javascript/cafe-order-checker?course=fc1&section=array-and-string-manipulation
 * 
 * I have two registers: one for take-out orders, and the other for the other folks eating inside the cafe. 
 * All the customer orders get combined into one list for the kitchen, where they should be handled first-come, first-served. 
 * 
 * Task:
 * 
 * Given all three arrays, write a function to check that my service is first-come, first-served. 
 * All food should come out in the same order customers requested it. 
 * 
    The take-out orders as they were entered into the system and given to the kitchen. (takeOutOrders)
    The dine-in orders as they were entered into the system and given to the kitchen. (dineInOrders)
    Each customer order (from either register) as it was finished by the kitchen. (servedOrders)

 * Note: Order numbers are arbitrary. They do not have to be in increasing order. 
 * Data structure: Queue implemented with a LinkedList in Java FIFO 
 * https://www.geeksforgeeks.org/linked-list-in-java/
 * 
 * RUN THIS THING
 *  E:\SCHOOL\CS\code_jam\03-cafe-order-checker> java .\cafe_order_checker.java 
************************************************************/

import java.util.*;

class cafe_order_checker {
  public static void main(String[] args) {

    System.out.print("Welcome to the Cafe Order Checker! \n");
    testMenu();
  }

static int orderNumber; // keeps track of current order number

// Menu that asks user for an Integer
static double testMenu(){

    // Delcaring the LinkedList's for each order type
    LinkedList<Integer> takeOutOrders = new LinkedList<Integer>(); 
    LinkedList<Integer> dineInOrders = new LinkedList<Integer>(); 
    LinkedList<Integer> servedOrders = new LinkedList<Integer>(); 

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Starting... ");
    
    int choice;


do{
    System.out.println("Pick an order list to put in an order \n");
    System.out.print("1. Add to Take out Orders \n");
    System.out.print("2. Add to Dine in Orders  \n");
    System.out.print("3. Quit \n");

    choice = scan.nextInt();

    switch(choice){

        case 1:
            takeOutOrders.add(orderNumber);
            servedOrders.add(orderNumber);
            orderNumber = orderNumber + 1;
            break;

        case 2:
            dineInOrders.add(orderNumber);
            servedOrders.add(orderNumber);
            orderNumber = orderNumber + 1;
            break;

        case 3:
            System.out.printf("Quitting! \n");
            return 0;

        default:
            System.out.println("Invalid menu choice; try again.");
            break;
    }
        // Display the contents of the LinkedLists
        System.out.printf("Take out Orders: \n" + takeOutOrders);
        System.out.printf("Dine in Orders:  \n"+ dineInOrders);
        System.out.printf("Served Orders:  \n" + servedOrders);
}while(choice < 3);

    scan.close();

    return 0;
  }

}; // end class Main 
