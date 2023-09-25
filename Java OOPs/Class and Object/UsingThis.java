class Base {
    public int num1, num2;

    Base(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum() {
        System.out.println("Sum : " + (num1 + num2));
    }
}

public class UsingThis {
    public static void main(String[] args) {
        Base obj = new Base(10, 20);
        obj.sum();
    }
}
