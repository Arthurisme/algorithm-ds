package com.algoexpert.depthFirstSearch;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Program9 {

    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.


            array.add(name);

            System.out.println(   "size: "+   children.size());

            for(int i=0; i < children.size(); i++){
                this.children.get(i).depthFirstSearch(array);
            }

            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static void main(String arg []) {



            Node graph = new Node("A");
            graph.addChild("B").addChild("C").addChild("D");
            graph.children.get(0).addChild("E").addChild("F");
            graph.children.get(2).addChild("G").addChild("H");
            graph.children.get(0).children.get(1).addChild("I").addChild("J");
            graph.children.get(2).children.get(0).addChild("K");
            String[] expected = {"A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"};
            List<String> inputArray = new ArrayList<String>();

            System.out.println(      graph.depthFirstSearch(inputArray));






    }

}
