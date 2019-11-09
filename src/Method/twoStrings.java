package Method;

public class twoStrings {
    public static void main(String[] args) {
//        System.out.println(dayName("day","night"));
        System.out.println(dayName("day","night",5));

    }
    public static String dayName(String firstWord,String seconWord ) {
return firstWord+seconWord+firstWord;
        }
    public static String dayName(String first, String second, int times) {
// Only need this condition with substring
//        if(times <= 0) {
//            return "";
//        }
        String word = "";
        for(int i = 0; i < times; i++) {
            word += first;
            if(i == times -1) {
                break;
            }
            word += second;
        }
        return word;
        //  return word.substring(0,word.length() - second.length());
    }






}

