package Voidmethhod;

public class WEEKEND {
    public static void main(String[] args) {
        System.out.println(weekdDay(""));


    }


    public static boolean weekdDay(String day) {

        day = day.toLowerCase();

        switch (day) {
            case"monday":
            case"tuesday":
            case"wed":
            case"thurs":
            case"friday":
                return true;
            case "sat":
            case"sun":
                return false;
            default:
                System.out.println("invalid day provided");
                return false;

        }




    }


}



