class PlanetRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet(
            "Earth", 1.0, 6371, 9.8, 365.25, 149.6, 1, false, true, 
            "Nitrogen, Oxygen", 15, 23.5, 0, "Unknown", false, 
            24.0, 5.51, 0.3, "Terrestrial", "Oxygen", 8000000000L
        );

		System.out.println("---Updated values---");
        Planet planet2 = new Planet(
            "Jupiter", 317.8, 69911, 24.8, 4332.59, 778.5, 79, true, false, 
            "Hydrogen, Helium", -145, 3.13, 1610, "Galileo Galilei", false, 
            9.9, 1.33, 0.52, "Gas Giant", "Hydrogen", 0
        );
		
		System.out.println("---Updated values---");
        Planet planet3 = new Planet(
            "Mars", 0.107, 3389.5, 3.7, 687, 227.9, 2, false, false, 
            "Carbon Dioxide", -63, 25.2, 1659, "Christian Huygens", false, 
            24.6, 3.93, 0.15, "Terrestrial", "Iron Oxide", 0
        );
    }
}