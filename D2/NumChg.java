public class NumChg {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i< 4; i++){
            for (int j = 0; j<=i; j++){
                sum +=1;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
