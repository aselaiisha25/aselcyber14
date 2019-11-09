package Arrays;

public class Email {
    public static void main(String[] args) {
        String[] emails={ "Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com"};

        for(int i=0;i<emails.length;i++) {

            if(emails[i].contains("@") && emails[i].contains(".")) {

                int at = emails[i].indexOf("@");
                int dot = emails[i].indexOf(".");

                if (at < dot) {
                    System.out.println(emails[i]+"valid");
                } else {
                    System.out.println(emails[i] + "invalid");
                }

            } else System.out.println("invalid");}


                }


            }






