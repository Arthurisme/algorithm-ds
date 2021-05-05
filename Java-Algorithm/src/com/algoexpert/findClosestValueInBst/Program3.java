
/*This program is not able pass the algoexpert online test*/

package com.algoexpert.findClosestValueInBst;

import java.io.PrintStream;
import java.util.*;

class Program3 {
    BST root;





    public static int findClosestValueInBst(BST tree, int target) {


        return findClosestValueInBst( tree,  target, tree.value);

    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        // Write your code here.
        if(Math.abs(closest - target)>Math.abs(tree.value - target)){
            closest = tree.value;

        }



        // Key is greater than root's key
        if (tree!=null && tree.value < target){




            return findClosestValueInBst(tree.left, target,closest);

        } else {
            if (tree!=null ){

                return findClosestValueInBst(tree.right, target,closest);


            } else {
                return closest;
            }


        }





    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BST getLeft() {
            return left;
        }

        public void setLeft(BST left) {
            this.left = left;
        }

        public BST getRight() {
            return right;
        }

        public void setRight(BST right) {
            this.right = right;
        }

    }

    private int findSmallestValue(BST root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private BST addRecursive(BST current, int value) {

        if (current == null) {
            return new BST(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value >= current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    private boolean containsNodeRecursive(BST current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public void traversePreOrder(BST node) {
        if (node != null) {
            visit(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(BST node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            visit(node.value);
        }
    }
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<BST> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            BST node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }


    private void visit(int value) {
        System.out.print(" " + value);
    }

    public static class BinaryTreePrinter {

        private BST tree;

        public BinaryTreePrinter(BST tree) {
            this.tree = tree;
        }

        private String traversePreOrder(BST root) {

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

        private void traverseNodes(StringBuilder sb, String padding, String pointer, BST node,
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

        var root = new Program3.BST(10);
        root.left = new Program3.BST(5);
        root.left.left = new Program3.BST(2);
        root.left.left.left = new Program3.BST(1);
        root.left.right = new Program3.BST(5);
        root.right = new Program3.BST(15);
        root.right.left = new Program3.BST(13);
        root.right.left.right = new Program3.BST(14);
        root.right.right = new Program3.BST(22);

//        bt.traversePostOrder(bt.root);

          new BinaryTreePrinter(root).print(System.out); ;

        var expected = 13;
        var actual = Program3.findClosestValueInBst(root, 36);

//        int result= Program3.findClosestValueInBst(bt.root, 36);


        System.out.println();
        System.out.println(actual);




    }
}
