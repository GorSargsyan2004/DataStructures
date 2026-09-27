package am.aua.Stack;

import am.aua.Stack.ArrayStack;
import am.aua.Stack.LinkedStack;
import am.aua.Stack.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- ArrayStack Demonstration ---");
        demonstrateStack(new ArrayStack<Integer>());

        System.out.println("\n--- LinkedStack Demonstration ---");
        demonstrateStack(new LinkedStack<Integer>());
    }

    private static void demonstrateStack(Stack<Integer> S) {
        S.push(5);
        S.push(3);
        System.out.println("Size: " + S.size());
        System.out.println("Pop: " + S.pop());
        System.out.println("isEmpty: " + S.isEmpty());
        System.out.println("Pop: " + S.pop());
        System.out.println("isEmpty: " + S.isEmpty());
        System.out.println("Pop (empty): " + S.pop());
        S.push(7);
        S.push(9);
        System.out.println("Top: " + S.top());
        S.push(4);
        System.out.println("Size: " + S.size());
        System.out.println("Pop: " + S.pop());
    }
}
