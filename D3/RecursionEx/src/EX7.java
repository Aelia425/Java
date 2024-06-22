import java.util.Scanner;

public class EX7 {
//    public static int divisor = 1;
//    Euclid's algorithm
    public static int gcd(int a, int b){
        if (a == b){
            return a;
        }else {
            if (a > b){
                return gcd(a-b,b);
            }else{
                return gcd(a,b-a);
            }


        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String s = input.nextLine();

        String[] num = s.split(",");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);

        System.out.println("Output: "+gcd(a,b));
    }
}
