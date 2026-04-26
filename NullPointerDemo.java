public class NullPointerDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
