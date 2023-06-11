/* Java Procedural-Program to calculate area */

import java.util.Scanner;  // header file that contias classes of scanner 

public class areaOfASquare {  // creating a class small as file name

    public static void main(String[] args) {  // main() of classs

        System.out.println("Enter the Dimensions of a square: "); // taking input from the user uisng Sout
        Scanner sc = new Scanner(System.in); // creating a object sc of class Scanner 

        double a = sc.nextDouble();  //reading the user entered data from the console using the scanner object 
        System.out.println("Area of the square is "+ (a*a));
    }    
}
