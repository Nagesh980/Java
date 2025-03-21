//public class CheckTarget {
    //public static void main(String[] args) {
        //int[] arr = {5, 12, 23, 34, 45, 56};
        //int target = 23; 

        //boolean found = false;
        //for (int num : arr) {
            //if (num == target) {
                //found = true;
                //break;
            //}
        //}

        //System.out.println("Target Number: " + target);
        //if (found) {
            //System.out.println(target + " is present in the array.");
        //} else {
            //System.out.println(target + " is not present in the array.");
        //}
    //}
//}
public class CheckTarget {
    public static void main(String[] args) {
		int i=0;
        int[] arr = {5, 12, 23, 34, 45, 56};
        int target = 23; 
		for(i=0;i<arr.length;i++){
			if(target==arr[i]){
				System.out.println("Element found at index "+i);
				break;	
			}
		}
		if(i==arr.length){
			System.out.println("not found");
			
		}
		
    }
}
