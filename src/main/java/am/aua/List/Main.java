package am.aua.List;

public class Main {
    public static void main(String[] args) {
        // Simple demonstration of ArrayList
        // Assuming your ArrayList implementation constructor takes initial capacity
        // Adjust if your implementation differs
        ArrayList<String> list = new ArrayList<>(); 
        
        System.out.println("Adding elements to the list...");
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        System.out.println("Size of list: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        
        System.out.println("Removing element at index 1...");
        list.remove(1);
        
        System.out.println("New size: " + list.size());
        System.out.println("New element at index 1: " + list.get(1));
    }
}
