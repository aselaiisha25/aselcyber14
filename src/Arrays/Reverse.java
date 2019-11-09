package Arrays;

public class Reverse {
    public static void main(String[] args) {


        String word = "It started to snow in Chicago";

        String[] name = word.split(" ");
        String finalStr = "";

        for (String jake: name) {

            String rev = "";
            for (int i = jake.length() - 1; i >= 0; i--) {
                rev += jake.charAt(i);
            }
            finalStr += rev + "";
        }
        System.out.println(finalStr);
            }

        }





