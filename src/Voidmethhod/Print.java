package Voidmethhod;

public class Print {
    public static void main(String[] args) {
        printName("james");
        printName("hello world");
        firstChar("world is best");

        goTo("london","china");
        makeEmail("james","bond",35);

    }
    public static void printName(String name){
        System.out.println(name);
    }

    public  static void firstChar(String name) {
        System.out.println(name.charAt(7));
    }

    public static void goTo(String origin,String location) {
        System.out.println("you start from " + origin);
        System.out.println("you go to " + location);
    }

    public static void makeEmail(String firstName,String lastName,int age) {
        String email = firstName+age+lastName+"@cybertek.com";
        System.out.println(email);

    }
}
