import java.util.Scanner;

public class MultiplicationTable {
    static void printMultiplicationTable(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(i+" x "+j+" = "+i*j+"\t");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("Multiplication Table:");
        printMultiplicationTable(n);
    }
}
