public class HollowDiamond {
    public static void main(String[] args) {
        for (int i = 1 ; i<=5; i++){
            for (int j = 1; j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=i;k++){
                if (k==1|| k==i ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1 ; i<5; i++){
            for (int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for (int k = 4; k>=i;k--){
                if (k==i|| k==4 ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
