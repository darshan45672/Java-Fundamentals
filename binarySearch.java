import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: \t ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        System.out.println("Enter "+ num +" elements:");
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }
        
    }
}
