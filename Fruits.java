public class Fruits{
	static String[] fruitNames = {null, null, null};
	static int index = 0;
	public static void addFruit(String fruitName){
		if(fruitNames != null){
			if(index < fruitNames.length){
				fruitNames[index] = fruitName;
				System.out.println("Name added successfully");
				index++;
			}
			else{
				System.out.println("array out of range");
			}
		}
		else{
			System.out.println("The array is null");
		}
	}
}