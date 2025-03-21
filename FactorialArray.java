public class FactorialArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        
        for (int num : arr) {
            System.out.println("Factorial of " + num + ": " + factorial(num));
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
