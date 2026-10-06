package am.aua.homeworks.homework5;

import am.aua.Queue.LinkedQueue;
import am.aua.Stack.ArrayStack;
import am.aua.Stack.Stack;

public class Main {

    public static void removeSecondAndReverse(LinkedQueue queue) {
        // 1. Remove every second element (Your fixed logic, this part is perfect)
        int size = queue.size();
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                queue.dequeue();
            } else {
                queue.enqueue(queue.dequeue());
            }
        }

        // 2. Reverse the remaining elements using a Stack
        Stack<Object> stack = new ArrayStack<>(queue.size());

        // Drain the queue into the stack (1, then 3, then 5)
        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }

        // Pop them back into the original queue (5 comes out first, then 3, then 1)
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        removeSecondAndReverse(queue);

        System.out.println(queue.toString());

        StackQueue<Integer> sq = new StackQueue<>();
        sq.enqueue(1);
        sq.enqueue(2);
        sq.enqueue(3);
        sq.enqueue(4);
        sq.enqueue(5);

        System.out.println(sq.dequeue());
        System.out.println(sq.first());
    }
}
