public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
