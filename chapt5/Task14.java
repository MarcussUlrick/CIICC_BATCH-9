package chapt5;

abstract class abstractClass {
    abstract void abstractMethod();

    void concreteMethod() { // concrete methods are still allowed in abstract classes
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    // Your code goes here
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Task14 {
    public static void main(String args[]) {
        // Test class B
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        
        System.out.println("---");
        
        // Test class C
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}