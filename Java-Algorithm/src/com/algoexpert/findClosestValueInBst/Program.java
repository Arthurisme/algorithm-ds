
/*This program is not able pass the algoexpert online test*/

package com.algoexpert.findClosestValueInBst;

import java.util.*;

class Program {
    BST root;
    static List<Integer> listDistance = new ArrayList<>();
    static Map<Integer,Integer> mapDistance = new HashMap<Integer, Integer>();



    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.



        if (tree!=null  ){
            listDistance.add(Math.abs(tree.value - target));
            mapDistance.put(tree.value, Math.abs(tree.value - target));

        }else { }





        // Base Cases: root is null or key is present at root
        if (tree==null || tree.value==target){
            if (tree!=null ){
                listDistance.add(Math.abs(tree.value - target));
                mapDistance.put(tree.value, Math.abs(tree.value - target));

                return tree.value;

            }


        }


        // Key is greater than root's key
        if (tree!=null && tree.value < target){
            listDistance.add(Math.abs(tree.value - target));
            mapDistance.put(tree.value, Math.abs(tree.value - target));

            return findClosestValueInBst(tree.right, target);

        } else {
            if (tree!=null ){
                listDistance.add(Math.abs(tree.value - target));
                mapDistance.put(tree.value, Math.abs(tree.value - target));


            }


        }

        List<Integer> listDistanceSorted = new ArrayList<>(listDistance);
        Collections.sort(listDistanceSorted);
        //return listDistanceSorted.get(0);


        Map.Entry<Integer,Integer> min = null;
        for (Map.Entry<Integer,Integer> entry : mapDistance.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }




        // Key is smaller than root's key
        if (tree!=null ){
            return findClosestValueInBst(tree.left, target);

        }

//        return listDistanceSorted.get(0);
        return min.getKey();


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

//        public void print(PrintStream os) {
//            os.print(traversePreOrder(tree));
//        }

    }


    public static void main(String arg []) {

        Program bt = new Program();

        bt.add(10);
        bt.add(15);
        bt.add(22);
        bt.add(13);
        bt.add(14);
        bt.add(5);
        bt.add(5);
        bt.add(2);
        bt.add(1);

//        bt.traversePostOrder(bt.root);

//         new BinaryTreePrinter(bt.root).print(System.out);

        int result= Program.findClosestValueInBst(bt.root, 9);


        System.out.println();
        System.out.println(result);




    }
}
