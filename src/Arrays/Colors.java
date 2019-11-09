package Arrays;

public class Colors {
    public static void main(String[] args) {

        String [] colors = new String [4];
        colors [0] = "red";
        colors[1]="blue";
        colors[2]= "white";
for(int i=0; i < colors.length;i++) {
    String color = colors[i];
    if (colors[i].length() >=4) {
        System.out.println(colors);

    }
}




    }
}
