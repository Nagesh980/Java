class TerraceRunner{
	public static void main(String... args){
		Terrace terrace = new Terrace();
	
		System.out.println("Terrace is open = "+terrace.is_open);
		System.out.println("Waterproofing_type = "+terrace.waterproofing_type);
		System.out.println("Load = "+terrace.max_load);
		System.out.println("Has_drainage = "+terrace.has_drainage);
	
		terrace.is_open = true;
		terrace.waterproofing_type = "Bitumen Coating";
		terrace.max_load = 1000;  
		terrace.has_drainage = true;  
		
		System.out.println("----Updated values----");
		System.out.println("Terrace is open = "+terrace.is_open);
		System.out.println("Waterproofing_type = "+terrace.waterproofing_type);
		System.out.println("Load = "+terrace.max_load);
		System.out.println("Has_drainage = "+terrace.has_drainage);
	}
	
}