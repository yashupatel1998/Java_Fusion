import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        // Simplified loop
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get each character from the string

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false; // Check for mismatch
                }
            }
        }

        return stack.isEmpty(); // Ensure no unmatched opening brackets
    }

    // Helper function to check matching pairs
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}")); // Output: true
        System.out.println(isBalanced("{[([])]}")); // Output: false
    }
}
