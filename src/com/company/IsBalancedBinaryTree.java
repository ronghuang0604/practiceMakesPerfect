package com.company;
import com.company.TreeNode;

/**
 * Created by rong on 6/2/17.
 */

/**
 * balanced binary tree: height difference between left subtree and right subtree <= 1
 */

public class IsBalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int HeightDiff = Math.abs(getHeight(root.left) - getHeight(root.right));
        if (HeightDiff <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
