import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Hello, To get started, Please Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Great! The factorial of " + n + " is : " + intFactorial(n));
    }
    public static int intFactorial(int n){
        if (n==1){
           // System.out.println("Factorial(" + n + ") = 1 ");
            return 1;
        }
        else
        {
            //System.out.println("Factorial(" + n + ") = " + n + " * Factorial(" + (n-1) + ")");
            return n * intFactorial(n-1); //this computes n(n-1) recursively
        }

    }
}
