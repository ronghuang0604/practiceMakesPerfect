package com.company;

import java.util.LinkedList;

/**
 * Created by rong on 6/1/17.
 */

// Method 1
public class StackWithMin {

    LinkedList<Integer> stack;
    LinkedList<Integer> minStack;

    public StackWithMin() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int element) {
        stack.push(element);
        if ( minStack.isEmpty() || ( !minStack.isEmpty() && element <= minStack.peekFirst() ) ) {
            minStack.push(element);
        }
    }

    public Integer pop() {
        if (stack.peekFirst() == minStack.peekFirst()) {
            minStack.pollFirst();
        }
        return stack.pollFirst();
    }

    public Integer top() {
        return stack.peekFirst();
    }

    public Integer min() {
        return minStack.peekFirst();
    }
}
















//    Deque<int> stack;
//    Deque<>
//public StackWithMin() {
//
//        }
//
//public void push(int element) {
//
//        }
//
//public int pop() {
//
//        }
//
//public int top() {
//
//        }
//
//public int min() {
//
//        }