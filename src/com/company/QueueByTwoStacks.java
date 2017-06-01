package com.company;
import java.util.LinkedList;

/**
 * Created by rong on 5/31/17.
 */
public class QueueByTwoStacks {
    private LinkedList<Integer> queueHead;
    private LinkedList<Integer> queueTail;

    public QueueByTwoStacks() {
        queueHead = new LinkedList<>();
        queueTail = new LinkedList<>();
    }

    public void offer(int element) {
        queueTail.push(element);
    }

    public Integer poll() {
        if (queueHead.isEmpty()) {
            move();
        }
        return queueHead.pollFirst();
    }

    public Integer peek() {
        if (queueHead.isEmpty()) {
            move();
        }
        return queueHead.peekFirst();
    }

    public int size() {
        return queueHead.size() + queueTail.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void move() {
        while (!queueTail.isEmpty()) {
            queueHead.push(queueTail.pop());
        }
    }
}










































//    public void offer(int element) {
//        tail.offerFirst(element);
//    }
//
//    public Integer poll(){
//
////        if (head.size() == 0) {
////            while (tail.size() != 0) {
////                int temp = tail.pop();
////                head.push(temp);
////            }
////            return head.pop();
////        }
////        return head.pop();
//
//
//
//
//
//
//    }
//
//    public Integer peek(){
////        if (head.size() == 0) {
////            while (tail.size() != 0) {
////                int temp = tail.pop();
////                head.push(temp);
////            }
////            return head.peekFirst();
////        }
////        return
//    }
//
//    public int size() {
//        return head.size() + tail.size();
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
