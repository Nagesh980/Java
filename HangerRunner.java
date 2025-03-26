class HangerRunner{
	public static void main(String... values){
		Hanger hanger = new Hanger();
		System.out.println("Material = "+hanger.material);
		System.out.println("Shape = "+hanger.shape);
		System.out.println("Hook_rotation = "+hanger.hook_rotation);
		System.out.println("Size = "+hanger.size);
		
		hanger.material = "Wood";
		hanger.shape = "Curved";
		hanger.hook_rotation = true;
		hanger.size = "Adult";
		
		System.out.println("---Updatedd values---");
		System.out.println("Material = "+hanger.material);
		System.out.println("Shape = "+hanger.shape);
		System.out.println("Hook_rotation = "+hanger.hook_rotation);
		System.out.println("Size = "+hanger.size);
	}
}