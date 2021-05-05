package com.algoexpert.staticMethod;
// Example to illustrate Accessing
// the Static method(s) of the class.

class Geek2 {

    public static String geekName = "";

    public  void geek(String name)
    {
        geekName = name;
    }
}

class GFG2 {
    public static void main(String[] args)
    {

        // Accessing the static method geek()
        // and field by class name itself.
        System.out.println(Geek2.geekName);

        // Accessing the static method geek()
        // by using Object's reference.
        Geek2 obj = new Geek2();
        obj.geek("mohit");
        System.out.println(obj.geekName);

        System.out.println(Geek2.geekName);

         System.out.println(Geek2.geekName);

        System.out.println(obj.geekName);

    }
}
