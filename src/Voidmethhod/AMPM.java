package Voidmethhod;

public class AMPM {
    public static void main(String[] args) {

        printTime(2, 59, true);


    }


    public static void printTime(int hour, int minutes, boolean amOrPm) {
        if ((hour > 0 && hour<13) && (minutes > 0 && minutes < 60)) {
            String date = hour + ":" + minutes;
            if (amOrPm) {
                date += " AM";
            } else {
                date += " PM";
            }
            System.out.println(date);

        } else {
            System.out.println("inavlid");
        }

    }

}

