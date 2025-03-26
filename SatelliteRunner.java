class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite1 = new Satellite(
            "Hubble", "USA", "Telescope", 11110, 569, 7.5, 1990, "Space Shuttle Discovery",
            "Space Observation", true, 2500000000L, "NASA", 2.8, 30, false, 
            "Kennedy Space Center", "NASA", 2.45, 24, "Hydrazine"
        );

		System.out.println("---Updated values---");
        Satellite satellite2 = new Satellite(
            "GSAT-10", "India", "Communication", 3400, 36000, 3.1, 2012, "Ariane 5",
            "Telecommunications", true, 5000000000L, "ISRO", 3.5, 15, false, 
            "French Guiana", "ISRO", 4.8, 36, "Liquid Propellant"
        );

		System.out.println("---Updated values---");
        Satellite satellite3 = new Satellite(
            "Galileo", "European Union", "Navigation", 715, 23222, 3.9, 2011, "Soyuz",
            "Global Navigation", true, 500000000L, "ESA", 1.5, 12, false, 
            "Kourou", "ESA", 1.6, 20, "Xenon"
        );
    }
}