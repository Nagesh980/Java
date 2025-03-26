class FloorRunner{
	public static void main(String... values){
		Floor floor = new Floor();
		System.out.println("Floor material = "+floor.material);
		System.out.println("Load_capacity = "+floor.load_capacity);
		System.out.println("Texture = "+floor.texture);
		System.out.println("Floor is waterproof = "+floor.is_waterproof);
		
		floor.material = "Tile"; 
		floor.load_capacity = 500;  
		floor.texture = "Smooth";  
		floor.is_waterproof = true;  
		
		System.out.println("----Updated values----");
		System.out.println("Floor material = "+floor.material);
		System.out.println("Load_capacity = "+floor.load_capacity);
		System.out.println("Texture = "+floor.texture);
		System.out.println("Floor is waterproof = "+floor.is_waterproof);
	}
}