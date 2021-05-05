package com.algoexpert.findClosestValueInBst;

class Program2 {
    static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        int diff = -1, closest = Integer.MAX_VALUE, nodeVal = -1;
        BST parent = null, current = tree;

        while(current != null) {
            //System.out.println("Current node: " + current.value);
            diff = Math.abs(current.value-target);

            if(diff == 0)
                return current.value;

            if(diff < closest) {
                closest = diff;
                nodeVal = current.value;
            }

            if(target < current.value)
                current = current.left;
            else
                current = current.right;
        }

        return nodeVal;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
