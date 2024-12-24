import java.util.Scanner;

public class Fiblocci {
    public static void calFibo(int a, int b, int n)
    {
        if(n==0){
            return ;
        }

        int c = a+b;
        System.out.println(c);
        calFibo(b, c, n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n: ");
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
        System.out.println(a);
        System.out.println(b);
        calFibo(a, b, n-2);
    }

}
