import java.util.Scanner;

public class areaOfASquare {
    public static void main(String[] args) {
        System.out.println("Enter the Dimensions of a square: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Area of the square is "+ (a*a));
    }    
}
