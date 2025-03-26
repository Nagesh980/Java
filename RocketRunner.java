class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket(
            "Falcon 9", "SpaceX", 70.0, 549, 22.8, 2, 7607, 155, 27000, 98,
            50, 4000, "Cape Canaveral", 2010, "Commercial", "USA", 250, "Liquid Fuel", true, false
        );

		System.out.println("---Updated values---");
        Rocket rocket2 = new Rocket(
            "Saturn V", "NASA", 110.6, 2970, 140, 3, 34000, 2540, 39800, 88,
            185, 6500, "Kennedy Space Center", 1967, "Lunar", "USA", 13, "Liquid Fuel", false, true
        );

		System.out.println("---Updated values---");
        Rocket rocket3 = new Rocket(
            "GSLV Mk III", "ISRO", 43.4, 640, 10, 3, 2000, 210, 9800, 92,
            90, 1200, "Sriharikota", 2014, "Satellite Launch", "India", 20, "Solid & Liquid Fuel", false, false
        );
    }
}