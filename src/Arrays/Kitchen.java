package Arrays;

public class Kitchen {
    public static void main(String[] args) {
        String[] names = {"knife","wooden spoons", "  plates","cups","froks","pan","pot","trash can","fridge","dish washer"};

        for(int i=0;i<names.length;i++) {
            if(names[i].trim().contains("")) {
                System.out.println(names[i]);}
            }
        }






    }


