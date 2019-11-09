package Voidmethhod;

public class Hello {
    public static void main(String[] args) {
        HelloWorld();
        OddNumber();


    }
        public static void HelloWorld() {
            for (int i = 0; i < 5; i++) {
                System.out.println("HelloWorld " +(i+1));
            }
        }


        public static void  OddNumber(){
        for(int i=1;i<100;i++) {
            if(i%2==1) {
                System.out.println(i);
            }
        }
        }




    }

