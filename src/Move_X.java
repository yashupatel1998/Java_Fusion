public class Move_X {

    public static void moveallX(String str, int idx, int count, String newstring){
        if(idx == str.length()){
            for(int i=0; i<count; count++)
            {
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        char currentchar = str.charAt(idx);
        if(currentchar == 'x'){
            count++;
            moveallX(str, idx+1, count, newstring);
        }else {
            newstring += currentchar;
            moveallX(str, idx+1, count, newstring);
        }

    }
    public static void main(String args[]){
        String str = "axbcxxd";
        moveallX(str, 0, 0, "");
    }
}
