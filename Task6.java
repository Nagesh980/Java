class Syringe{
	public static void details(int quantity,String medicineName,String nurseName){
		System.out.println("running deatils in Syringe");
		System.out.println("quantity: "+quantity);
		System.out.println("medicine name: "+medicineName);
		System.out.println("nurse Name: "+nurseName);
	}
	
	public static void inject(boolean prescribed){
		System.out.println("Running inject in Syringe");
		if(prescribed==true){
			System.out.println("injection is prescribed");
		}
		else{
			System.out.println("injection is not prescribed");
		}
	}
}

class Tablet{
	public static void dissolve(String tabName,int time){
		System.out.println("running dissolve in Tablet");
		
		System.out.println(tabName+"dissolves in "+time+" minutes");
	}
	
	public static void cure(String tabName,String disease){
		System.out.println("running cure in Tablet");
		System.out.println(tabName+" cures "+disease);
	}
	
	public static void killThePain(String tabName,boolean killPain){
		System.out.println("running killThePain in Tablet");
		if(killPain==true){
			System.out.println(tabName+" kills pain");
		}
		else{
			System.out.println("tablet does not kill pain");
		}
	}
	
	public static void react(String tabName,int time){
		System.out.println("running react in Tablet");
		System.out.println(tabName+" reacts within "+time+" minutes");
	}
}

class Helmet{
	public static void details(String brand, String material, String color, String size, String type){
		System.out.println("Running details in helmet");
		System.out.println("helmet brand is "+brand);
		System.out.println("helmet material is "+material);
		System.out.println("helmet colour is "+color);
		System.out.println("helmet size is "+size);
		System.out.println("helmet type is "+type);
		
	}
}

class Wheel{
	public static void info(String brand,int diameter,float width,String material, boolean isTubeless,int loadCapacity,String usage,String Pattern, float price,boolean hasSpokes){
		System.out.println("running info in Wheel");
		System.out.println("brand :"+brand);
		System.out.println("diameter: "+diameter);
		System.out.println("width: "+width+" inches");
		System.out.println("material: "+material);
		System.out.println("isTubeless: "+isTubeless);
		System.out.println("loadCapacity: "+loadCapacity);
		System.out.println("usage: "+usage);
		System.out.println("Pattern: "+Pattern);
		System.out.println("price: "+price);
		System.out.println("hasSpokes: "+hasSpokes);
		
	}
}

class Key{
	public static void details(String keyType, String keyMaterial, int keyLength){
		System.out.println("Running details for Key");
		System.out.println("Key Type: " + keyType);
		System.out.println("Key Material: " + keyMaterial);
		System.out.println("Key Length: " + keyLength + " mm");
	}

}

class Bomb{
	public static void details(String bombName, String explosiveType, int blastRadius, String detonationMethod, float weight, String fuseType, int activationTime, String originCountry, int shockwaveSpeed, float destructivePower){
		System.out.println("Running displayBombInfo for Bomb");
		System.out.println("Bomb Name: " + bombName);
		System.out.println("Explosive Type: " + explosiveType);
		System.out.println("Blast Radius: " + blastRadius + " meters");
		System.out.println("Detonation Method: " + detonationMethod);
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Fuse Type: " + fuseType);
		System.out.println("Activation Time: " + activationTime + " seconds");
		System.out.println("Origin Country: " + originCountry);
		System.out.println("Shockwave Speed: " + shockwaveSpeed + " m/s");
		System.out.println("Destructive Power: " + destructivePower + " kilotons/megajoules");
	}

}

class Bullet{
	public static void displayInfo(String bulletName, String bulletManufacturer, int bulletCaliber, String bulletType,int bulletCost){
		System.out.println("Running displayInfo for Bullet");
		System.out.println("Bullet Name: " + bulletName);
		System.out.println("Bullet Manufacturer: " + bulletManufacturer);
		System.out.println("Bullet Caliber (mm): " + bulletCaliber);
		System.out.println("Bullet Type: " + bulletType);
		System.out.println("Bullet Cost Price: " + bulletCost);
	}

}

class Engine{
	public static void displayInfo(String engineName, String engineManufacturer, String engineType,int horsepower, int torque, int displacement, int numCylinders,String fuelType, float compressionRatio, float fuelEfficiency,int weight, int maxRPM, String coolingSystem, String ignitionType,boolean isTurbocharged, String transmissionType, String emissionStandard,int numValves, float bore, float stroke, String engineBlockMaterial,float oilCapacity, String starterType, String fuelInjectionType, int engineCost){
		System.out.println("Running displayInfo for Engine");
		System.out.println("Engine Name: " + engineName);
		System.out.println("Engine Manufacturer: " + engineManufacturer);
		System.out.println("Engine Type: " + engineType);
		System.out.println("Horsepower: " + horsepower + " HP");
		System.out.println("Torque: " + torque + " Nm");
		System.out.println("Displacement: " + displacement + " cc");
		System.out.println("Number of Cylinders: " + numCylinders);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Compression Ratio: " + compressionRatio);
		System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Max RPM: " + maxRPM);
		System.out.println("Cooling System: " + coolingSystem);
		System.out.println("Ignition Type: " + ignitionType);
		System.out.println("Turbocharged: " + isTurbocharged);
		System.out.println("Transmission Type: " + transmissionType);
		System.out.println("Emission Standard: " + emissionStandard);
		System.out.println("Number of Valves: " + numValves);
		System.out.println("Bore: " + bore + " mm");
		System.out.println("Stroke: " + stroke + " mm");
		System.out.println("Engine Block Material: " + engineBlockMaterial);
		System.out.println("Oil Capacity: " + oilCapacity + " liters");
		System.out.println("Starter Type: " + starterType);
		System.out.println("Fuel Injection Type: " + fuelInjectionType);
		System.out.println("Engine Cost: Rs." + engineCost);
	}

}

class Tile{
	public static void details(String tileName, String tileMaterial, String tileSize,String tileFinish, int tileCost){
		System.out.println("Running details for Tile");
		System.out.println("Tile Name: " + tileName);
		System.out.println("Tile Material: " + tileMaterial);
		System.out.println("Tile Size: " + tileSize);
		System.out.println("Tile Finish: " + tileFinish);
		System.out.println("Tile Cost: ₹" + tileCost + " per sq. ft.");
}

}

class Gun{
	public static void displayInfo(String gunName, String manufacturer, int caliber, String type, int magazineCapacity, int weight, int costPrice, boolean isAutomatic){
		System.out.println("Running displayInfo for Gun");
		System.out.println("Gun Name: " + gunName);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Caliber (mm): " + caliber);
		System.out.println("Type: " + type);
		System.out.println("Magazine Capacity: " + magazineCapacity + " rounds");
		System.out.println("Weight (grams): " + weight);
		System.out.println("Cost Price: " + costPrice);
		System.out.println("Is Automatic: " + isAutomatic);
	}

}

class Latch{
	public static void typesWithPrice(String type,int price){
		System.out.println("running types with price in Latch");
		System.out.println(type+" costs Rs."+price);
		
	}
}

class Glass{
	public static void seller(String sellerName,int sellerID, int sellingPrice, String location, int pinCode){
		System.out.println("running seller in Glass");
		System.out.println("Seller Name: "+sellerName);
		System.out.println("Seller ID: "+sellerID);
		System.out.println("Selling Price: "+sellingPrice);
		System.out.println("Seller location: "+location);
		System.out.println("Seller Pin Code: "+pinCode);
	}
	
	public static void buyer(String buyerName,int buyerPhone, int costPrice, String location, int pinCode){
		System.out.println("running buyer in Glass");
		System.out.println("Buyer Name: "+buyerName);
		System.out.println("Buyer Phone Number: "+buyerPhone);
		System.out.println("Cost Price: "+costPrice);
		System.out.println("Buyer Address: "+location);
		System.out.println("Buyer Pin Code: "+pinCode);
	}
}