//package com.company;
//
//import sun.reflect.generics.tree.Tree;
//
//import java.util.*;
//import java.util.LinkedList;
//
///**
// * Created by rong on 6/7/17.
// */
//public class printLayerByLayer {
//    List<List<Integer>> LayerByLayer(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> layer = new ArrayList<>();
//
//            for (int i = size; i > 0; i--) {
//                TreeNode popEle = queue.poll();
//                if (popEle.left != null) {
//                    queue.offer(popEle.left);
//                }else if (popEle.right != null) {
//                    queue.offer(popEle.right);
//                }
//                layer.add(popEle.value);
//            }
//            result.add(layer);
//
//        }
//        return result;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    public List<List<Integer>> layerByLayer(TreeNode root) {
////        if (root == null) {
////            return null;
////        }
////
////        List<List<Integer>> result = new ArrayList<>();
////        Queue<TreeNode> queue = new LinkedList<>();
////        queue.offer(root);
////        while (!queue.isEmpty()) {
////            List<TreeNode> curLayer = new ArrayList<>();
////            int size = queue.size();
////            for (int i = 0; i < size; i++) {
////                TreeNode cur = queue.poll();
////                curLayer.add(cur);
////                if (cur.left != null) {
////                    queue.offer(cur.left);
////                }else if (cur.right != null) {
////                    queue.offer(cur.right);
////                }
////                System.out.println(cur.value + " ");
////            }
////
////            System.out.println();
////
////        }
////    }
