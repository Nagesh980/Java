class IronBoxRunner{
	public static void main(String... args){
		IronBox ironbox = new IronBox();
		System.out.println("Heating_capacity = "+ironbox.heating_capacity);
		System.out.println("Soleplate_material = "+ironbox.soleplate_material);
		System.out.println("Has_steam_mode = "+ironbox.has_steam_mode);
		System.out.println("Temperature_control = "+ironbox.temperature_control);
		
		
		ironbox.heating_capacity = 1500;
		ironbox.soleplate_material = "Ceramic";
		ironbox.has_steam_mode = true;
		ironbox.temperature_control = "Adjustable";
		
		System.out.println("---Updated values---");
		System.out.println("Heating_capacity = "+ironbox.heating_capacity);
		System.out.println("Soleplate_material = "+ironbox.soleplate_material);
		System.out.println("Has_steam_mode = "+ironbox.has_steam_mode);
		System.out.println("Temperature_control = "+ironbox.temperature_control);
	}
}