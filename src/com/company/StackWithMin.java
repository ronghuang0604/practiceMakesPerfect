package com.company;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by rong on 6/1/17.
 */

// Method 1
public class StackWithMin {

    Deque<Integer> stack;
    Deque<Integer> minStack;

    public StackWithMin() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int element) {
        stack.push(element);
        if ( minStack.isEmpty() || ( element <= minStack.peekFirst() ) ) {
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


/**
 * Things to remember: should use Deque instead of LinkedList because it's more general 
 *
 * */















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