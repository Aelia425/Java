//TriangleStarPattern
public class Exb {
    public static void main(String[] args) {
        for (int i = 1; i<=8; i++){
//            left-spacing
            for (int j = 0; j<8-i;j++){
                System.out.print(" ");
            }

            for (int k = 1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
