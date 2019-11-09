package Arrays;

import Project.Array;

import java.util.Arrays;

public class SmallBig {
    public static void main(String[] args) {

        int [] number = {31,20,25,20,3,48,26,12};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));


        String checked = "";
        int count = 0;

        for (int i=number.length-1;i >=0;i--) {
if(count==2) {
    break;
}
         if(!checked.contains(number[i] + ""));
            System.out.println(number[i]);
            checked+=number[i] + " ";
            count++;}
}

        }



