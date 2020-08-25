import java.util.Scanner;
//Author: Gil Silva
//Exercise. Application that receives user input
//and verifies if it's a positive or negative number.


public class Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a number: ");
        double number = input.nextDouble();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if( number < 0){
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("You entered " + number + ". Zero is neither negative or positive.");
        }

    }

}
