import javax.swing.*;

public class ZeoOneTri {
    public static void main(String[] args) {
        boolean toggle = false;
        for (int i = 0; i< 4; i++){
            if (i %2 == 0){
                toggle = true;
            }
            for (int j = 0; j<=i;j++){
                int myInt = toggle ? 1:0;
                System.out.print(myInt+" ");
                toggle = !toggle;
            }
            System.out.println();
        }
    }
}
