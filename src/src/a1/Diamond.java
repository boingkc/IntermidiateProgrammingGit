package a1;
import java.util.*;


/**
 * Created by BOINGKC on 24/08/2017 AD.
 */
public class Diamond {
    public static void printDiamond(int k){
        StringBuffer reverse = new StringBuffer();
        int star = 1;

        while (k >= 1){
            for (int i = 0; i < k; i++) {
                reverse.append("#");
            }

            for (int i = 0; i < star ; i++) {
                reverse.append("*");
            }

            for (int i = 0; i < k; i++) {
                reverse.append("#");
            }

            k--;
            star+=2;
            if (k==0)break;
            else reverse.append("\n");


        }

        System.out.println(reverse);

        System.out.println(reverse.reverse());


    }

    public static void main(String[] args) {
        printDiamond(3);
    }
}
