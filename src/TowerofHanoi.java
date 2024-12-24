import java.util.Scanner;

public class TowerofHanoi {
    public static void powerOfHanoi(int n, String src, String help, String dest){

        if(n==1){
            System.out.println("Move Disk" + "" + n + " " + src + "to" + "" + dest);
            return;
        }
        powerOfHanoi(n-1, src, dest, help);
        System.out.println("Move Disk" + "" + n + " " + src + "to" + "" + dest);
        powerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Value of N: ");
        int n = sc.nextInt();

        //int n = 1;
        powerOfHanoi(n, "S", "H", "D");
    }
}
