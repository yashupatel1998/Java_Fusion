public class Pattern {
    public static void main(Strings[] arg)
    {
        int n = 4;
        for (int i = 1; i<=n; i++){
            for (int j= 1; j<=i ; j++){
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j= 1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--){
            for (int j= 1; j<=i ; j++){
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j= 1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}



