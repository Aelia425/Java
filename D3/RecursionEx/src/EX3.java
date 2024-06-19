import java.util.*;
public class EX3 {
    public static int Fibonacci(int n){
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int num = input.nextInt();

        System.out.println("Output: "+Fibonacci(num));
    }
}
