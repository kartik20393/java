public class FactorialCLI {
    public static void main(String[] args) {
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }
    }
}
