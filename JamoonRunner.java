class JamoonRunner{
	public static void main(String... args){
		Jamoon jamoon = new Jamoon();
		System.out.println("Shape = "+jamoon.shape);
		System.out.println("Color = "+jamoon.color);
		System.out.println("Taste = "+jamoon.taste);
		System.out.println("Nutritional_value = "+jamoon.nutritional_value);
		
		jamoon.shape = "Round";
		jamoon.color = "Blackish"; 
		jamoon.taste = "Sweet";
		jamoon.nutritional_value = "Rich in Antioxidants";
		
		System.out.println("---Updated values---");
		System.out.println("Shape = "+jamoon.shape);
		System.out.println("Color = "+jamoon.color);
		System.out.println("Taste = "+jamoon.taste);
		System.out.println("Nutritional_value = "+jamoon.nutritional_value);

	}
}