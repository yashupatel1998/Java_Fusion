import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the ArrayList
        names.add("Quincy");
        names.add("Alice");
        names.add("Bob");
        names.add("Qasim");
        names.add("James");
        names.add("Queen");

        // Print names that start with 'Q'
        System.out.println("Names that start with 'Q':");
        for (String name : names) {
            if (name.startsWith("Q")) {
                System.out.println(name);
            }
        }
    }
}
