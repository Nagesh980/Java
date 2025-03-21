public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 2, 6, 8};
        int sum = 0;

        //for (int num : arr){
            //sum += num;
        //}
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}

        System.out.println("Sum of all elements: " + sum);
    }
}
