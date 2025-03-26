class Bed2Runner{
	public static void main(String... args){
		Bed2 bed2 = new Bed2();
		System.out.println("Frame_material = "+bed2.frame_material);
		System.out.println("Mattress_type = "+bed2.mattress_type);
		System.out.println("Size = "+bed2.size);
		System.out.println("Height = "+bed2.height);
		
		bed2.frame_material = "Wood" ;
		bed2.mattress_type = "Memory Foam";
		bed2.size = "Queen";
		bed2.height = 2;
		
		System.out.println("---Updated values---");
		System.out.println("Frame_material = "+bed2.frame_material);
		System.out.println("Mattress_type = "+bed2.mattress_type);
		System.out.println("Size = "+bed2.size);
		System.out.println("Height = "+bed2.height);
	}
}