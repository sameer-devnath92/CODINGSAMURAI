import java.util.*;  // importing util package to use Scanner class for user input
// Main Class
public class Calculator {

    // function to take two two inputs from user of int type in array
    public static void InputNumbers(int nums[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        nums[0] = scan.nextInt();
        System.out.println("Enter second nuber: ");
        nums[1] = scan.nextInt();
        return;
    }
    
    // function to Add two numbers by taking values from array
    public static int Add(int nums[]){
        int result = nums[0] + nums[1];
        System.out.println("Result: " + result);
        return result;
    }

    // function to Subtract two numbers by taking values from array
    public static int Subtract(int nums[]){
        int result = nums[0] - nums[1];
        System.out.println("Result: " + result);
        return result;
    }

    // function to Multiply two numbers by taking values from array
    public static int Multiply(int nums[]){
        int result = nums[0] * nums[1];
        System.out.println("Result: " + result);
        return result;
    }

    // function to Divide two numbers by taking values from array
    public static int Divide(int nums[]){
        int result = nums[0] / nums[1];
        System.out.println("Result: " + result);
        return result;
        
    }

    //  function to take user input to perform an operation from menu
    public static int displayOperations(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a choice: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        return scan.nextInt();  
    }

    // Main Method
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);   // Taking scanner class to take input from user
        int nums[] = new int[2];     // declaring array to store the 2 numbers taken from user
        boolean validInput = false;

        // Exception handling to handle invalid user inputs 
        while(!validInput){
            try{
                InputNumbers(nums);
                validInput = true;
            } catch(InputMismatchException e){
                System.out.println("Invalid input!. Please enter integer values");
                scan.next();
            }
        }

        // Declaring variable to take input using function 'displayOperations'
        int choice;
        do{
            // Defining choice variable to take user input using function 'displayOperations'
            choice = displayOperations();
            
            
            // using switch case to perform operations by calling functions based on user input
            switch(choice){
                case 1:
                Add(nums);
                System.out.println();
                break;

                case 2:
                Subtract(nums);
                System.out.println();
                break;

                case 3:
                Multiply(nums);
                System.out.println();
                break;

                case 4:

                // Exception handling while calling function to avoid division by zero error
                try{
                Divide(nums);
                System.out.println();
                } catch(ArithmeticException e){
                    System.out.println("Error is " + e);
                    System.out.println();

                }
                break;

                case 5:
                System.out.println("Exited Successfully");
                System.out.println();
                break;

                default:
                System.out.println("Please enter a valid choice!");
            }

        // Loop will run as long as choice != 5
        }while(choice!=5);
        // Close the scanner object
        scan.close();   
    }
}
