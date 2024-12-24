import java.util.Scanner;

public class TwoDArray {
    public static void main(Strings arg[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];
        //input
        //row
        for (int i = 0; i < row; i++) {
            //col
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        for (int i = 0; i < row; i++) {
            //col
            for (int j = 0; j < col; j++) {

                if (numbers[i][j] == x) {
                    System.out.print(" X found at the location: (" + i + " , " + j + ")");
                }
                System.out.println();
            }

        }
    }
}

