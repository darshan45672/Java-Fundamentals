import java.util.Scanner;

public class averageOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number:\t");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum =0;
        for( long i =0; i<num;  i++){
            sum +=i;
        }
        System.out.println("Average sum of Natural Numbers upto "+num+" = "+sum);
    }
}