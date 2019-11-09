package Arrays;



import java.util.Arrays;
import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {

        String [] books = {"Leaders eat las","Harry Potter","Mindset","Oca","Eragon"};
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

        Scanner input = new Scanner(System.in);

        System.out.println("please enter book you want to replace");
        String book = input.nextLine();
        int index = Arrays.binarySearch(books,book);

        if(index>=0) {
            System.out.println("what book will u replace" + book + "with");
            String newbook = input.nextLine();

            books[index] = newbook;
        } else {
            System.out.println("book not found");}
        System.out.println(Arrays.toString(books));

        }




    }

