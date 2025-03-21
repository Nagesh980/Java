class Soap{
	public static void main(String[] args){	
		String soapBrand = "Dove";
		double soapWeight = 75.5;
		int soapPrice = 40;
		boolean soapFragrant = true;
		float soapPh = 5.5f;
		char soapGrade = 'A';
		long soapStock = 50000L;
		short soapExpiryYear = 2025;
		byte soapDiscount = 10;
		System.out.println("Soap Details: " + soapBrand + ", " + soapWeight + "g, Rs." + soapPrice + ", Fragrant: " + soapFragrant + ", " +  soapPh + "f, " +  soapGrade + "-grade, " + soapExpiryYear + ", " + soapDiscount + "% discount");

		// Re-initialize
		soapBrand = "Lux";
		soapWeight = 80;
		soapPrice = 35;
		soapFragrant = false;
		soapPh = 6.0f;
		soapGrade = 'B';
		soapStock = 40000L;
		soapExpiryYear = 2024;
		soapDiscount = 5;
		System.out.println("Updated Soap Details: " + soapBrand + ", " + soapWeight + "g, Rs." + soapPrice + ", Fragrant: " + soapFragrant + ", " +  soapPh + "f, " +  soapGrade + "-grade, " + soapExpiryYear + ", " + soapDiscount + "% discount");
	}		
}

class Watch{
	public static void main(String[] args){
		String watchBrand = "Titan";
        double watchDiameter = 42.5;
        int watchPrice = 5000;
        boolean watchDigital = false;
        float watchWeight = 120.5f;
        char watchType = 'M';
        long watchStock = 10000L;
        short watchWarranty = 2;
        byte watchDiscount = 15;
        System.out.println("Watch Details: " + watchBrand + ", " + watchDiameter + "mm, Rs." + watchPrice + ", Digital: " + watchDigital);

        // Re-initialize
        watchBrand = "Casio";
        watchDiameter = 38.0;
        watchPrice = 7000;
        watchDigital = true;
        watchWeight = 110.2f;
        watchType = 'F';
        watchStock = 8000L;
        watchWarranty = 3;
        watchDiscount = 10;
        System.out.println("Updated Watch Details: " + watchBrand + ", " + watchDiameter + "mm, Rs." + watchPrice + ", Digital: " + watchDigital);
	}
}

class Napkin{
	public static void main(String[] args){
		 // NAPKIN
        String napkinBrand = "Softy";
        double napkinLength = 25.5;
        int napkinPrice = 10;
        boolean napkinReusable = false;
        float napkinAbsorption = 85.5f;
        char napkinQuality = 'A';
        long napkinStock = 30000L;
        short napkinExpiryYear = 2026;
        byte napkinDiscount = 5;
        System.out.println("Napkin Details: " + napkinBrand + ", " + napkinLength + "cm, Rs." + napkinPrice + ", Reusable: " + napkinReusable);

        // Re-initialize
        napkinBrand = "TissueSoft";
        napkinLength = 30.0;
        napkinPrice = 15;
        napkinReusable = true;
        napkinAbsorption = 90.0f;
        napkinQuality = 'B';
        napkinStock = 25000L;
        napkinExpiryYear = 2027;
        napkinDiscount = 8;
        System.out.println("Updated Napkin Details: " + napkinBrand + ", " + napkinLength + "cm, Rs." + napkinPrice + ", Reusable: " + napkinReusable);
	}
}

class Pillow{
	public static void main(String[] args){
		 String pillowBrand = "SleepWell";
        double pillowWeight = 1.2;
        int pillowPrice = 800;
        boolean pillowMemoryFoam = true;
        float pillowLength = 60.5f;
        char pillowComfort = 'A';
        long pillowStock = 5000L;
        short pillowWarranty = 3;
        byte pillowDiscount = 20;
        System.out.println("Pillow Details: " + pillowBrand + ", " + pillowWeight + "kg, Rs." + pillowPrice + ", Memory Foam: " + pillowMemoryFoam);

        // Re-initialize
        pillowBrand = "CozyDream";
        pillowWeight = 1.5;
        pillowPrice = 950;
        pillowMemoryFoam = false;
        pillowLength = 65.0f;
        pillowComfort = 'B';
        pillowStock = 4000L;
        pillowWarranty = 4;
        pillowDiscount = 18;
        System.out.println("Updated Pillow Details: " + pillowBrand + ", " + pillowWeight + "kg, Rs." + pillowPrice + ", Memory Foam: " + pillowMemoryFoam);
	}
}

class Bed{
	public static void main(String[] args){
		String bedBrand = "RoyalSleep";
        double bedSize = 6.5;
        int bedPrice = 15000;
        boolean bedWooden = true;
        float bedHeight = 1.2f;
        char bedMaterial = 'B';
        long bedStock = 2000L;
        short bedWarranty = 10;
        byte bedDiscount = 25;
        System.out.println("Bed Details: " + bedBrand + ", " + bedSize + "ft, Rs." + bedPrice + ", Wooden: " + bedWooden);

        // Re-initialize
        bedBrand = "KingRest";
        bedSize = 7.0;
        bedPrice = 18000;
        bedWooden = false;
        bedHeight = 1.5f;
        bedMaterial = 'A';
        bedStock = 1800L;
        bedWarranty = 12;
        bedDiscount = 22;
        System.out.println("Updated Bed Details: " + bedBrand + ", " + bedSize + "ft, Rs." + bedPrice + ", Wooden: " + bedWooden);
	}
}

class Ring{
	public static void main(String[] args){
		String ringMetal = "Gold";
        double ringSize = 7.5;
        int ringPrice = 25000;
        boolean ringDiamond = false;
        float ringWeight = 5.2f;
        char ringPurity = 'A';
        long ringStock = 1000L;
        short ringWarranty = 5;
        byte ringDiscount = 10;

        System.out.println("Ring Details: " + ringMetal + ", " + ringSize + ", Rs." + ringPrice + ", Diamond: " + ringDiamond);

        // Re-initialize
        ringMetal = "Platinum";
        ringSize = 8.0;
        ringPrice = 30000;
        ringDiamond = true;
        ringWeight = 6.0f;
        ringPurity = 'S';
        ringStock = 900L;
        ringWarranty = 6;
        ringDiscount = 12;

        System.out.println("Updated Ring Details: " + ringMetal + ", " + ringSize + ", Rs." + ringPrice + ", Diamond: " + ringDiamond);
	}
}

class Bag{
	public static void main(String[] args){
		String bagBrand = "Wildcraft";
        double bagCapacity = 30.5;
        int bagPrice = 2000;
        boolean bagWaterproof = true;
        float bagWeight = 1.5f;
        char bagQuality = 'A';
        long bagStock = 7000L;
        short bagWarranty = 3;
        byte bagDiscount = 15;
        System.out.println("Bag Details: " + bagBrand + ", " + bagCapacity + "L, Rs." + bagPrice + ", Waterproof: " + bagWaterproof);

        // Re-initialize
        bagBrand = "Skybags";
        bagCapacity = 35.0;
        bagPrice = 2500;
        bagWaterproof = false;
        bagWeight = 1.8f;
        bagQuality = 'B';
        bagStock = 6500L;
        bagWarranty = 4;
        bagDiscount = 18;
        System.out.println("Updated Bag Details: " + bagBrand + ", " + bagCapacity + "L, Rs." + bagPrice + ", Waterproof: " + bagWaterproof);
	}
}

class Hat{
	public static void main(String[] args){
		String hatBrand = "Adidas";
        double hatSize = 58.5;
        int hatPrice = 1200;
        boolean hatWaterproof = false;
        float hatWeight = 0.3f;
        char hatType = 'C'; // C for Cap, B for Beanie, etc.
        long hatStock = 3500L;
        short hatWarranty = 2;
        byte hatDiscount = 15;

        System.out.println("Hat Details: " + hatBrand + ", " + hatSize + "cm, Rs." + hatPrice + ", Waterproof: " + hatWaterproof);

        // Re-initialize
        hatBrand = "Nike";
        hatSize = 60.0;
        hatPrice = 1500;
        hatWaterproof = true;
        hatWeight = 0.35f;
        hatType = 'B';
        hatStock = 3000L;
        hatWarranty = 3;
        hatDiscount = 20;

        System.out.println("Updated Hat Details: " + hatBrand + ", " + hatSize + "cm, Rs." + hatPrice + ", Waterproof: " + hatWaterproof);
	}
}