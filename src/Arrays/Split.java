package Arrays;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String str = "java is progr lanfuududu";

        String[] regular = str.trim().toLowerCase().split("");
//        char [] charArr=str.toCharArray();
        System.out.println(Arrays.toString(regular));

    }
}
