import java.util.Scanner;

public class EX8 {
    public static int stringToInt(String s){
        if (s.isEmpty()){
            return 0;
        }else {
            int first = Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
            int rest =stringToInt(s.substring(0,s.length()-1)) * 10;
            return first+rest;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String s = input.nextLine();

        System.out.println("Output: "+ stringToInt(s));
    }
}
