import java.util.Scanner;

public class Vottingage {
 public static boolean ageElligible(int a){

     if(a > 18){
         return true;
     }else {
         return false;
     }
    }
    public static void main(Strings[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:78");
        int a = sc.nextInt();
        System.out.println(ageElligible(a));
    }
}
