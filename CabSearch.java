class CabSearch{
	public static int getCostBySourceAndDestination(String source,String destination){
	
		int cost = 0;
		if(source == "Majestic" && destination == "Mg road"){
			cost = 20;
			return cost;
		}
		else if(source == "Majestic" && destination == "Kormangala"){
			cost = 40;
			return cost;
		}
		 else if(source == "Majestic" && destination == "Bannerghatta road"){
			cost = 60;
			return cost;
		}
		else if(source == "Majestic" && destination == "Rajajinagar"){
			cost = 80;
			return cost;
		}
		else if(source == "Majestic" && destination == "Malleshwaram"){
			cost = 100;
			return cost;
		}
		else if(source == "Majestic" && destination == "HSR Layout"){
			cost = 120;
			return cost;
		}
		else if(source == "Majestic" && destination == "JP Nagar"){
		 	cost = 140;
			return cost;
		}
		else if(source == "Majestic" && destination == "CV Raman Nagar"){
			cost = 150;
			return cost;
		}
		else if(source == "Majestic" && destination == "Basavanagudi"){
			cost = 170;
			return cost;
		}
		else if(source == "Majestic" && destination == "Ulsoor"){
			cost = 140;
			return cost;
		}
		else if(source == "Majestic" && destination == "Sarjapur Road"){
			cost = 200;
			return cost;
		}
		else if(source == "Majestic" && destination == "Bellandur"){
			cost = 150;
			return cost;
		}
		else{
			System.out.println("Match not found");
			return 0;
		}
	}
	
	public static int getDistanceBySourceAndDestination(String source,String destination){
	
		int distance = 0;
		if(source == "Majestic" && destination == "Mg road"){
			distance = 10;
			return distance;
		}
		else if(source == "Majestic" && destination == "Kormangala"){
			distance = 20;
			return distance;
		}
		 else if(source == "Majestic" && destination == "Bannerghatta road"){
			distance = 30;
			return distance;
		}
		else if(source == "Majestic" && destination == "Rajajinagar"){
			distance = 40;
			return distance;
		}
		else if(source == "Majestic" && destination == "Malleshwaram"){
			distance = 50;
			return distance;
		}
		else if(source == "Majestic" && destination == "HSR Layout"){
			distance = 20;
			return distance;
		}
		else if(source == "Majestic" && destination == "JP Nagar"){
		 	distance = 30;
			return distance;
		}
		else if(source == "Majestic" && destination == "CV Raman Nagar"){
			distance = 40;
			return distance;
		}
		else if(source == "Majestic" && destination == "Basavanagudi"){
			distance = 50;
			return distance;
		}
		else if(source == "Majestic" && destination == "Ulsoor"){
			distance = 20;
			return distance;
		}
		else if(source == "Majestic" && destination == "Sarjapur Road"){
			distance = 10;
			return distance;
		}
		else if(source == "Majestic" && destination == "Bellandur"){
			distance = 20;
			return distance;
		}
		else if(source == "Majestic" && destination == "Singasandra"){
			distance = 30;
			return distance;
		}
		 else if(source == "Majestic" && destination == "Kudlu"){
			distance = 40;
			return distance;
		}
		else if(source == "Majestic" && destination == "GB palya"){
			distance = 50;
			return distance;
		}
		else if(source == "Majestic" && destination == "Bommanahalli"){
			distance = 20;
			return distance;
		}
		else if(source == "Majestic" && destination == "Roopena"){
			distance = 30;
			return distance;
		}
		else if(source == "Majestic" && destination == "Silk Board"){
		 	distance = 15;
			return distance;
		}
		else if(source == "Majestic" && destination == "BTM"){
			distance = 20;
			return distance;
		}
		else if(source == "Majestic" && destination == "Udupi Garden"){
			distance = 25;
			return distance;
		}
		else if(source == "Majestic" && destination == "Water Tank"){
			distance = 30;
			return distance;
		}
		else if(source == "Majestic" && destination == "Mico Layout"){
			distance = 18;
			return distance;
		}
		else if(source == "Majestic" && destination == "Jayadeva"){
			distance = 23;
			return distance;
		}
		else{
			System.out.println("Match not found");
			return 0;
		}
	}
	
	public static void searchAvailability(String destination){
		boolean available = false;
		if(destination == "Majestic"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Mg road"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Kormangala"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Bannerghatta road"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "HSR Layout"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "JP Nagar"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "CV Raman Nagar"){
			available = true;
			System.out.println("Availability :"+available);	
		}
		else if(destination == "Basavanagudi"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Ulsoor"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Sarjapur Road"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Bellandur"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Singasandra"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Kudlu"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "GB palya"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Bommanahalli"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Roopena"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Silk Board"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "BTM"){
			available = true;
			System.out.println("Availability :"+available);	
		}
		else if(destination == "Udupi Garden"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Water Tank"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Mico Layout"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Jayadeva"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Majestic"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "davangere"){
			available = true;
			System.out.println("Availability :"+available);
		}
		else if(destination == "Jamkhandi"){
			available = true;
			System.out.println("Availability :"+available);
		}
	}
}