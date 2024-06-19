import java.util.*;
public class EX2 {
    public static int SumOfNaturalNumber(int n){
        if (n==0){
            return 0;
        }else {
            return n+SumOfNaturalNumber(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int num = input.nextInt();

        System.out.println("Output: "+SumOfNaturalNumber(num));
    }
}
