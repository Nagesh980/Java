class CraneRunner{
	public static void main(String... args){
		Crane crane = new Crane();
		System.out.println("load_capacity = "+crane.load_capacity);
		System.out.println("boom_length = "+crane.boom_length);
		System.out.println("mobility = "+crane.mobility);
		System.out.println("operating_mechanism = "+crane.operating_mechanism);
    
    
		crane.load_capacity = 10000;
		crane.boom_length = 50;
		crane.mobility = "Mobile";
		crane.operating_mechanism = "Hydraulic";

		System.out.println("---Updated values---");
		System.out.println("load_capacity = "+crane.load_capacity);
		System.out.println("boom_length = "+crane.boom_length);
		System.out.println("mobility = "+crane.mobility);
		System.out.println("operating_mechanism = "+crane.operating_mechanism);
	}
}