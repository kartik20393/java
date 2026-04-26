public class VariablesDemo {
    static int staticVar = 10; // static (class level)

    public void method() {
        int localVar = 20; // local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj = new VariablesDemo();
        obj.method();
        System.out.println("Global (static) Variable: " + staticVar);
    }
}
