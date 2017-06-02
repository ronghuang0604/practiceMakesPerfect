package com.company;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Rong on 6/1/17.
 */


public class StackWithMinII {
    class Wrapper {
        int value;
        int position;
        public Wrapper(int value, int position) {
            this.value = value;
            this.position = position;
        }
    }

    private Deque<Integer> stack;
    private Deque<Wrapper> minStack;

    public StackWithMinII() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int element) {
        stack.push(element);
        if (minStack.isEmpty() || element < minStack.peekFirst().value) {
            Wrapper newElement = new Wrapper(element, stack.size());
            minStack.push(newElement);
        }
    }


    public Integer pop() {
        if (stack.isEmpty()) {
            return null;
        }
        if (stack.size() == minStack.peekFirst().position) {
            minStack.pollFirst();
        }
        return stack.pollFirst();
    }

    public Integer top() {
        return stack.peekFirst();
    }
    public Integer min() {
        if (minStack.isEmpty()) {
            return null;
        }
        return minStack.peekFirst().value;
    }
}
