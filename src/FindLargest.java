public class FindLargest {
    public static int findLargest(int[] arry){
        int max = arry[0];
        for(int i=0; i<arry.length; i++){
            if(arry[i]>max){
                max = arry[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arry = {1,2,5,8,9};
        System.out.println(findLargest(arry));
    }
}
