// Progran to calculate the
import java.util.Scanner;

public class biggestNumber {
    public static void main(String[] args) {
        int big;
        System.out.println("Enter the number of elements:\t");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Enter "+ num +" elements:");
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < num; i++) {
            big = a[0];
            for (int j = 0; j < num; j++) {
                if (a[i] > big)
                    big = a[i];
            } 
        }
        //System.out.println("Biggest number entered is : " + big );
    }
}
