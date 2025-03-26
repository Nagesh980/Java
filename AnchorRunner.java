class AnchorRunner{
	public static void main(String... args){
		Anchor anchor = new Anchor();
		System.out.println("Material = "+anchor.material);
		System.out.println("Holding_power = "+anchor.holding_power);
		System.out.println("Weight = "+anchor.weight);
		System.out.println("Design_type = "+anchor.design_type);
		
		
		anchor.material = "Iron";
		anchor.holding_power = 200;
		anchor.weight = 10;
		anchor.design_type = "Fluke";
		
		System.out.println("---Updated values---");
		System.out.println("Material = "+anchor.material);
		System.out.println("Holding_power = "+anchor.holding_power);
		System.out.println("Weight = "+anchor.weight);
		System.out.println("Design_type = "+anchor.design_type);

	}
}