package com.algoexpert.findClosestValueInBst;

import java.io.PrintStream;

class Program5 {
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, tree.value);//A
    }
    public static int findClosestValueInBst(BST tree, int target, int closest) {

        BST currentNode = tree;

        while(currentNode != null){
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)){
                closest = currentNode.value;
            }
            if (target < currentNode.value && currentNode.left != null){//B
                currentNode = currentNode.left;
            } else if (target > currentNode.value && currentNode.right != null){
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;



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

        var root = new Program5.BST(10);
        root.left = new Program5.BST(5);
        root.left.left = new Program5.BST(2);
        root.left.left.left = new Program5.BST(1);
        root.left.right = new Program5.BST(5);
        root.right = new Program5.BST(15);
        root.right.left = new Program5.BST(13);
        root.right.left.right = new Program5.BST(14);
        root.right.right = new Program5.BST(22);

//        bt.traversePostOrder(bt.root);

         new BinaryTreePrinter(root).print(System.out);

        var expected = 13;
        var actual = Program5.findClosestValueInBst(root, 36);

//        int result= Program3.findClosestValueInBst(bt.root, 36);


        System.out.println();
        System.out.println(actual);




    }

}
