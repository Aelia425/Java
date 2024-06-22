import java.util.Scanner;

public class EX5 {
    public static int index = 0;
//    static String s;
    public static String ReverseString(String s){
        if (s.length() <=1){
            return s;
        }else {
            int mid = s.length() / 2;
            String right = ReverseString(s.substring(mid));
            String left = ReverseString(s.substring(0,mid));

            return right + left;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String s = input.nextLine();

        System.out.println("Output: "+ReverseString(s));
    }
}
