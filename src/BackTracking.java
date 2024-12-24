public class BackTracking {

    public static void printCombination(String str, int idx, String combination){
        if(str.length() == 0){
            System.out.println(combination);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            printCombination(newString, idx+1, combination+currChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printCombination(str,0, "");
    }

}
