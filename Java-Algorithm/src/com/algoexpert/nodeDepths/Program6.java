package com.algoexpert.nodeDepths;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Program6 {
    public static int nodeDepths(BinaryTree tree) {
        // Write your code here.
        List<Integer> sums = new ArrayList<Integer>();
//        return calculatenodeDepths(tree, -1, sums) ;//A
        return calculatenodeDepths(tree, -1, sums).stream().mapToInt(Integer::intValue).sum();//A
    }


    public static List<Integer> calculatenodeDepths(BinaryTree node, int runningSum, List<Integer> sums ) {
        // Write your code here.

//        ArrayList resultArrayList = new ArrayList<Integer>();
//
//        resultArrayList.add(1);
//        resultArrayList.add(2);

        if (node == null){
//            sums.add(runningSum)  ;

            return null;
        }


        int newRunningSum = runningSum + 1;
        sums.add(newRunningSum)  ;


        if (node.left == null && node.right == null ) {
//            sums.add(newRunningSum)  ;
            return Collections.singletonList(0);
        } else {
//            sums.add(newRunningSum)  ;

        }




        calculatenodeDepths(node.left, newRunningSum, sums);
        calculatenodeDepths(node.right, newRunningSum, sums);


        return sums;
    }


    static class BinaryTree {
        public int value;
        public  BinaryTree left;
        public  BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BinaryTree getLeft() {
            return left;
        }

        public void setLeft(BinaryTree left) {
            this.left = left;
        }

        public BinaryTree getRight() {
            return right;
        }

        public void setRight(BinaryTree right) {
            this.right = right;
        }

    }



    public static class BinaryTreePrinter {

        private BinaryTree tree;

        public BinaryTreePrinter(BinaryTree tree) {
            this.tree = tree;
        }

        private String traversePreOrder(BinaryTree root) {

            if (root == null) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            sb.append(root.getValue());

            String pointerRight = "└──";
            String pointerLeft = (root.getRight() != null) ? "├──" : "└──";

            traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
            traverseNodes(sb, "", pointerRight, root.getRight(), false);

            return sb.toString();
        }

        private void traverseNodes(StringBuilder sb, String padding, String pointer, BinaryTree node,
                                   boolean hasRightSibling) {

            if (node != null) {

                sb.append("\n");
                sb.append(padding);
                sb.append(pointer);
                sb.append(node.getValue());

                StringBuilder paddingBuilder = new StringBuilder(padding);
                if (hasRightSibling) {
                    paddingBuilder.append("│  ");
                } else {
                    paddingBuilder.append("   ");
                }

                String paddingForBoth = paddingBuilder.toString();
                String pointerRight = "└──";
                String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

                traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
                traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);

            }

        }

        public void print(PrintStream os) {
            os.print(traversePreOrder(tree));
        }

    }


    public static void main(String arg []) {

//        Program3 bt = new Program3();

//        bt.add(10);
//        bt.add(15);
//        bt.add(22);
//        bt.add(13);
//        bt.add(14);
//        bt.add(5);
//        bt.add(5);
//        bt.add(2);
//        bt.add(1);

        var root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);
        root.left.right = new BinaryTree(5);
        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);

//        bt.traversePostOrder(bt.root);

         new BinaryTreePrinter(root).print(System.out);

        var expected = 13;
         var actual2 = Program6.nodeDepths(root);

//        int result= Program3.findClosestValueInBinaryTree(bt.root, 36);


        System.out.println();
         System.out.println(actual2);




    }

}
