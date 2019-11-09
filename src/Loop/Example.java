package Loop;

public class Example {
    public static void main(String[] args) {
        String word = "cybertek";
         for (int i=0; i < word.length(); i++) {
             if(word.charAt(i) == 'b') {
                 String s = word.charAt(i) + "";
                 System.out.println(word.charAt(i) + " " + i);
                 continue;
             }
             if(word.charAt(i) == 't') {
                 break;
             }
             System.out.println(word.charAt(i) + " " +i);

             }
         }
    }

