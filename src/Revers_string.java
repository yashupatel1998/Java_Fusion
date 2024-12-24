import java.util.Scanner;

public class Revers_string {
    public static void reversString(String str, int index){

        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reversString(str, index-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.next();
        reversString(str, str.length()-1);
    }
}
