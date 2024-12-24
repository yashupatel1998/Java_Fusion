import java.util.Scanner;

public class String_replacement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Orginal String: ");
        String orginal = sc.next();

        String result = orginal.replace('e' , 'i');

        System.out.println("Old String: " + orginal );
        System.out.println("New String: " + result);

    }
}
