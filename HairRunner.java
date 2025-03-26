class HairRunner{
	public static void main(String... args){
		Hair hair = new Hair();
		System.out.println("Texture = "+hair.texture);
		System.out.println("Color = "+hair.color);
		System.out.println("Density = "+hair.density);
		System.out.println("Growth_rate = "+hair.growth_rate);
		
		
		hair.texture = "Straight";
		hair.color = "Black";
		hair.density = "Thick";
		hair.growth_rate = 1.5 ;
		
		System.out.println("---Updated values---");
		System.out.println("Texture = "+hair.texture);
		System.out.println("Color = "+hair.color);
		System.out.println("Density = "+hair.density);
		System.out.println("Growth_rate = "+hair.growth_rate);

	}
}