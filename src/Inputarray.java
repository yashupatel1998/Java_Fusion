import java.util.Scanner;

public class Inputarray {
    public static void main(Strings[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAssnding = true;
        for (int i = 0; i < size -1 ; i++) {
            if (numbers[i] > numbers[i+1]) {
               isAssnding = false;
            }
        }
        if(isAssnding){
            System.out.println("Array is sorted assending order");
        }else{
            System.out.println("Array is not sorted assending order");
        }
}
}


