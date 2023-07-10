// Progran to find the biggset number

import java.util.Scanner;  // header file that contians classes of scanner 

public class biggestNumber {  // creating a public class biggestNumber

    public static void main(String[] args) {  //start of main

        int big; // declaring the variable

        System.out.println("Enter the number of elements:\t");  // taking input from the user
        Scanner input = new Scanner(System.in); 
        int num = input.nextInt();  // storing the user entered data in variable num

        System.out.println("Enter "+ num +" elements:"); // asking the user to entered the elements
        int a[] = new int[num];  // creating a array of integers named a

        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();  // storing the data int the array
        }

        // checking the biggest number
        for (int i = 0; i < num; i++) {
            big = a[0]; // assiging first array element as big
            if (a[i] > big)  // checking the next element is bigger than big
                big = a[i];  // if true then assign big as the element present in that index
        }
        //System.out.println("Biggest number entered is : " + big );
    }
}
