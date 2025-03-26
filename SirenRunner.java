class SirenRunner{
	public static void main(String... args){
		Siren siren = new Siren();
		System.out.println("sound_frequency = "+siren.sound_frequency);
		System.out.println("power_source = "+siren.power_source);
		System.out.println("volume_level = "+siren.volume_level);
		System.out.println("usage_type = "+siren.usage_type);
		
		
		siren.sound_frequency = 1200;
		siren.power_source = "Electric";
		siren.volume_level = 120;
		siren.usage_type = "Emergency";
		
		System.out.println("---Updated values---");
		System.out.println("sound_frequency = "+siren.sound_frequency);
		System.out.println("power_source = "+siren.power_source);
		System.out.println("volume_level = "+siren.volume_level);
		System.out.println("usage_type = "+siren.usage_type);
	}
}