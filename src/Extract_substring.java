import java.util.Scanner;

public class Extract_substring {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your Email: ");
        String email = sc.next();
        int Indexof = email.indexOf('@');
        String SubString = email.substring(0, Indexof);
        System.out.println(" Your Username is: " + SubString);
        System.out.println("length of Substring is: " + SubString.length());


    }
}
