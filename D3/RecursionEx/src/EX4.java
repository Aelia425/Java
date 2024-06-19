import java.util.Scanner;

public class EX4 {
    public static int SumOfDigits(int n){
        if (n<10){
            return n;
        }else {
            int remainder = n%10;
            int otherDigit = n/10;
            return remainder+SumOfDigits(otherDigit);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int digits = input.nextInt();

        System.out.println("Output: "+SumOfDigits(digits));
    }
}
