public class Subsequences {
    public static void subsequences(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currentChar = str.charAt(idx);
        subsequences(str, idx+1, newstring+currentChar);
        subsequences(str, idx+1, newstring);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str, 0, "");
    }
}
