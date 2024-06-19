import java.util.Arrays;
import java.util.Scanner;
public class EX6 {
    public static int PowerNumber(int b ,int p){
        if (p==0){
            return 1;
        }else {
            return b*PowerNumber(b,p-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String s = input.nextLine();

        String[] num = s.split(",");
        int base = Integer.parseInt(num[0]);
        int power = Integer.parseInt(num[1]);

        System.out.println("Output: "+PowerNumber(base,power));
    }
}
