class Syringe{
	public static void details(int quantity,String medicineName,String nurseName){
		System.out.println("running deatils in Syringe");
		System.out.println("quantity: "+quantity);
		System.out.println("medicine name: "+medicineName);
		System.out.println("nurse Name: "+nurseName);
	}
	
	public static void inject(boolean prescribed){
		System.out.println("Running inject in Syringe");
		if(prescribed==true){
			System.out.println("injection is prescribed");
		}
		else{
			System.out.println("injection is not prescribed");
		}
	}
}