public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();

        System.out.println("Sum of integers: " + obj.add(10, 20));

        System.out.println("Sum of floats: " + obj.add(5.5f, 4.5f));

        // Default values if no args
        int defaultIntSum = obj.add(0, 0);
        float defaultFloatSum = obj.add(0.0f, 0.0f);
        System.out.println("Default int sum: " + defaultIntSum);
        System.out.println("Default float sum: " + defaultFloatSum);
    }
}
