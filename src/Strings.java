import java.util.Scanner;

public class Strings {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int TotLeanghth = 0;

        for(int i=0; i< size; i++){
            array[i] = sc.next();
            TotLeanghth += array.length;
        }
        System.out.println(TotLeanghth);

    }
}
