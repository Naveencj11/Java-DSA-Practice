public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 20 / 2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
