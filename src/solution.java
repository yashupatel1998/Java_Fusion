import java.util.Scanner;

public class solution {
    public static double circleCircumference(double r){
       return 2 * 3.14 * r;
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter value of r:5");
        double r = sc.nextInt();
        double v = circleCircumference(r);
        System.out.println(v);
    }
}