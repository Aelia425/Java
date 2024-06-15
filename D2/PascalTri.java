public class PascalTri {

    public static void main(String[] args) {
        for (int i = 1; i<=4; i++){
//            left-spacing
            for (int j = 0; j<4-i;j++){
                System.out.print(" ");
            }
            int sum = 1;
            for (int k = 1; k<=i;k++){
                System.out.print(sum+" ");
                sum = sum*(i-k)/k;

            }
            System.out.println();
        }
    }
}
