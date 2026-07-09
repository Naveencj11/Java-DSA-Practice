public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());

            int num = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught.");
        }

        System.out.println("Program completed.");
    }
}
