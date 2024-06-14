import java.util.Scanner;

public class SumOfNaturalNumbers {
    static void sumUsingForLoop(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum += i;
        }
        System.out.println("Sum using for loop: "+sum);
    }

    static void sumUsingWhileLoop(int n){
        int sum = 0;
        while(n != 0){
            sum += n;
            n--;
        }
        System.out.println("Sum using while loop: "+sum);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = input.nextInt();
        sumUsingForLoop(n);
        sumUsingWhileLoop(n);


    }
}
