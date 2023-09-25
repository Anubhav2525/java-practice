// create a class Base and create an object to call the method 
class Base {
    public int num1 = 10, num2 = 20;

    public void sum() {
        System.out.println(num1 + num2);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Base base = new Base();
        base.sum();
    }
}