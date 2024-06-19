import java.util.*;
public class EX1 {
    public static int  Factorial(int n){
        if (n==0){
            return 1;
        }else {
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int num = input.nextInt();

        System.out.println("Output: "+Factorial(num));

    }
}
