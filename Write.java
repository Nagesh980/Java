public class Write{
	static int[] array;
	public static void addElement(){
		for(int index = 0; index < array.length; index++){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the element:");
			array[index] = sc.nextLine();
			System.out.println("element added successfully");
		}
	}
	
}