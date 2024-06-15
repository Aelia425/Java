public class PalindromeTri {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++){
//            left-spacing
            for (int j = 0; j<4-i;j++){
                System.out.print("  ");
            }
            int x = i;
            for (int k = 2; k<=i;k++){
                System.out.print(x+" ");
                x -= 1;
            }
//            System.out.print(" ");
            for (int k = 1; k<=i;k++){
                System.out.print(k+" ");

            }
            System.out.println();
        }
    }
}
