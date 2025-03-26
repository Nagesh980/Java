class ShirtRunner{
	public static void main(String... args){
		Shirt shirt = new Shirt();
		System.out.println("Fabric = "+shirt.fabric);
		System.out.println("Collar_type = "+shirt.collar_type);
		System.out.println("Sleev_length = "+shirt.sleeve_length);
		System.out.println("Fit_type = "+shirt.fit_type);
		
		shirt.fabric = "Cotton";
		shirt.collar_type = "Round Neck";
		shirt.sleeve_length = "Full";
		shirt.fit_type = "Slim";
		
		System.out.println("---Updatedd values---");
		System.out.println("Fabric = "+shirt.fabric);
		System.out.println("Collar_type = "+shirt.collar_type);
		System.out.println("Sleev_length = "+shirt.sleeve_length);
		System.out.println("Fit_type = "+shirt.fit_type);

	}
}