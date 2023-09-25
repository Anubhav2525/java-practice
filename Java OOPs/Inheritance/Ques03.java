/*
 Constructor Chaining:

Create a class hierarchy with multiple levels of inheritance. Demonstrate constructor chaining from the child class to the parent class using super().   
 */

import javax.swing.text.AsyncBoxView.ChildLocator;

class Base {
    Base() {
        System.out.println("Base class");
    }
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived class");
    }
}

class ChildDerived extends Derived {
    ChildDerived() {
        super();
        System.out.println("Child of derived class");
    }
}

public class Ques03 {
    public static void main(String[] args) {
        // ChildDerived Object
        ChildDerived cd = new ChildDerived();
    }
}
