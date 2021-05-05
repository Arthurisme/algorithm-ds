package com.algoexpert.branchSum;

class Program {
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, Double.MAX_VALUE);//A
    }
    public static int findClosestValueInBst(BST tree, int target, double closest) {
        if (Math.abs(target - closest) > Math.abs(target - tree.value)){
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null){//B
            return findClosestValueInBst(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null){
            return findClosestValueInBst(tree.right, target, closest);
        } else {
            return (int)closest;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
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

        var root = new BST(1);
        root.left = new BST(2);
        root.left.left = new BST(3);
        root.left.left.left = new BST(4);
        root.left.right = new BST(5);
        root.right = new BST(6);
        root.right.left = new BST(7);
        root.right.left.right = new BST(8);
        root.right.right = new BST(9);
        root.right.right = new BST(10);

//        bt.traversePostOrder(bt.root);

//         new BinaryTreePrinter(bt.root).print(System.out);

        var expected = 13;
        var actual = Program.findClosestValueInBst(root, 36);

//        int result= Program3.findClosestValueInBst(bt.root, 36);


        System.out.println();
        System.out.println(actual);




    }

}
