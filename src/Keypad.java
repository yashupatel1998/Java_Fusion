public class Keypad {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void combinations(String str, int idx, String newstring){
        if(idx == str.length())
        {
            System.out.println(newstring);
            return;
        }
        char currentChar = str.charAt(idx);
        int keypadIdx = currentChar - '0';
        String mapping = keypad[keypadIdx];
        for(int i=0; i<mapping.length(); i++){
            combinations(str, idx+1, newstring+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "23";
        combinations(str, 0, "");
    }
}
