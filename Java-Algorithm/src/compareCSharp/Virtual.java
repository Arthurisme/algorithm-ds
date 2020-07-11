package compareCSharp;

abstract class Dog {
    final void bark() {               //bark() is not virtual because it is
        System.out.println("woof");   //final and if you tried to override it
    }                                 //you would get a compile time error.


     void bark2() {
        System.out.println("woof2");
    }

    abstract void jump();             //jump() is a virtual function because it
}                                     //is part of an abstract class and isn't
//final.
class MyDog extends Dog{
    void jump(){
        System.out.println("boing");    //here jump() is being overridden, a
    }                                   //demonstration that it is virtual.

    void bark2() {
        System.out.println("woof2b");
    }
}


class A{
    void sayhi(){ System.out.println("A");}
}
class B extends A{
    void sayhi(){ System.out.println("B");}
}




public class Virtual  {
    public static void main(String[] args) {
        MyDog myDog = new MyDog();       //instantiating myDog
       // myDog.jump();                    //calling the overridden function jump()
        //myDog.bark2();


        A a = new A();
        a.sayhi();
    }
}