/* Program to calculate the average of n Natural numbers*/

import java.util.Scanner;   // header file that contias classes of scanner 

public class averageOfNaturalNumbers {  // creating a class small as file name
    public static void main(String[] args) {  // main() of classs

        System.out.println("Enter a number:\t"); // taking input from the user uisng Sout
        Scanner sc = new Scanner(System.in);  // creating a object sc of class 
        long num = sc.nextLong();
        long sum =0;
        for( long i =0; i<num;  i++){
            sum +=i;
        }
        System.out.println("Average sum of Natural Numbers upto "+num+" = "+(sum/num));
    }
}
