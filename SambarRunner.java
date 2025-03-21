class SambarRunner{
	public static void main(String... args){
		String[] veggies = Sambar.vegetables();
		for(String veg : veggies){
			System.out.println(veg+ " ");
		}
		int noofpersons = Sambar.quantity();
		System.out.println(noofpersons);
		boolean hotorcold = Sambar.hotOrCold();
		System.out.println(hotorcold);
		boolean goodorbad = Sambar.goodOrBad();
		System.out.println(goodorbad);
	}
}