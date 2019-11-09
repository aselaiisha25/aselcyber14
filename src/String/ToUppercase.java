package String;

public class ToUppercase {
    public static void main(String[] args) {
        String word = "jaVa";

        String fixed = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();

        System.out.println(fixed);

        String word2 = "Kevin fell from his bike";

        int from = word2.indexOf(" from");
        String word3 = word2.substring(0,from);
        System.out.println(word3);
        System.out.println(word2.substring(from) + " " + word3);

        String str = "   java   ";
        str = str.trim();
        System.out.println(str);

//        String name = "Today is fun day";
//        boolean b = word.startsWith("Today");
//        System.out.println(b);
//        System.out.println("Not: " +!b);


        String n = "Java";
        String n2 = "James";
        System.out.println(n.compareTo(n2));








    }
}
