class CabRunner {
    public static void main(String[] args) {
        Cab cab1 = new Cab(
            "CityRide X", "GoCab", "Hyundai Verna", "KA-09-8765", "Rajesh Kumar", "DL-567890",
            "Petrol", "Sedan", 4, 13.5, 700000, 95000, 6, true, true, 
            4.6, "help@gocab.com", 9812345678L, "Delhi", "Red"
        );

		System.out.println("---Updated values---");
        Cab cab2 = new Cab(
            "FastTrack", "MetroCabs", "Ford Aspire", "MH-04-4321", "Sanjay Mehta", "DL-890123",
            "Diesel", "SUV", 6, 15.0, 850000, 120000, 7, false, true, 
            4.7, "support@metrocabs.com", 9123456789L, "Pune", "Black"
        );

		System.out.println("---Updated values---");
        Cab cab3 = new Cab(
            "EcoCommute", "GreenRide", "Tata Nexon EV", "TN-07-6789", "Arun Prasad", "DL-234567",
            "Electric", "Hatchback", 4, 9.5, 550000, 85000, 5, true, false, 
            4.4, "care@greenride.com", 9345678901L, "Chennai", "Blue"
        );
    }
}