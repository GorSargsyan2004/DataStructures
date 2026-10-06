package am.aua.homeworks.homework5;

import am.aua.Queue.Queue;
import am.aua.Stack.LinkedStack;

public class StackQueue<E> implements Queue<E> {
    private LinkedStack<E> stack = new LinkedStack<>();
    private LinkedStack<E> temp = new LinkedStack<>();

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        while (!stack.isEmpty())
            temp.push(stack.pop());
        stack.push(e);
        while (!temp.isEmpty())
            stack.push(temp.pop());
    }

    @Override
    public E first() {
        return stack.top();
    }

    @Override
    public E dequeue() {
        return stack.pop();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
