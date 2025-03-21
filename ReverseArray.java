public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
		

        System.out.print("Original Array: ");
        //for (int num : arr) {
         //   System.out.print(num + " ");
        //}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}


        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.print("\nReversed Array: ");
        //for (int num : arr) {
          //System.out.print(num + " ");
        //}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
    }
}
