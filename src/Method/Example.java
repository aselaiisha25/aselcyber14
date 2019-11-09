package Method;

public class Example {
    public static void main(String[] args) {
        jump();
        jump();
        jump();

    }
     public static void  jump() {
         System.out.println("you dont get far");

     }
     public static void jump(String shoes) {
         System.out.println("this shoes made u go further");

     } public static void jump(int distance) {
        System.out.println("you jumped" + distance);
    } public static String jump(String[] arr) {
        return "jumped by array";

    }

}
