package am.aua.PositionalList;

/**
 * A simple demonstration of how to use Positional Lists.
 * 
 * Note: Assuming standard PositionalList interfaces/classes exist.
 */
public class Main {
    public static void main(String[] args) {
        // This is a placeholder for your actual implementation
        System.out.println("Positional List Demonstration");
        
        // Example logic:
         PositionalList<String> list = new LinkedPositionalList<>();
         Position<String> p1 = list.addFirst("Hello");
         Position<String> p2 = list.addAfter(p1, "World");
         System.out.println("First element: " + list.first().getElement());
    }
}
