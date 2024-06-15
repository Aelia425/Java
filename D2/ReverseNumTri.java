public class ReverseNumTri {
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
    }
}
