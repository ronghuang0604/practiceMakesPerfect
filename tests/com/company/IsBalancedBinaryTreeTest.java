package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rong on 6/4/17.
 */
class IsBalancedBinaryTreeTest {
    @Test
    public void test1() {

        //                 1
//               /   \
//              2      3
//            /  \    /  \
//           4    5   6   7
//          /
//         8
//        /
//       9

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node8.left = node9;

        IsBalancedBinaryTree test = new IsBalancedBinaryTree();
        System.out.println(test.isBalanced(node1));
    }
}