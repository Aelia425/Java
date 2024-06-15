public class MirrorImgTri {
    public static void main(String[] args) {
        for (int i = 0; i <4; i++){
            int sum = i;
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<4-i;k++){
                sum ++;
                System.out.print( sum +" ");
            }
            System.out.println();
        }
        for (int i = 1; i<4; i++){
            int sum = 4-i;
            for (int j = 4; j-1>i;j--){
                System.out.print(" ");
            }
            for (int k = 0; k<=i;k++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
