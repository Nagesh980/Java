class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip(
            "ProFast", "YKK", 15.0, "Black", "Metal", 50, 5.0, "Coil Zip", true, true,
            50, 30.0, 2.5, 500000, 1200000, "Japan", 1934, 
            "Tadao Yoshida", 9876543210L, "support@ykk.com"
        );

		System.out.println("---Updated values---");
        Zip zip2 = new Zip(
            "SwiftLock", "Talon", 12.5, "Silver", "Plastic", 40, 3.8, "Invisible Zip", false, true,
            40, 25.0, 2.0, 400000, 900000, "USA", 1893, 
            "Gideon Sundback", 1234567890L, "support@talonzip.com"
        );

		System.out.println("---Updated values---");
        Zip zip3 = new Zip(
            "QuickSeal", "Coats", 14.2, "Blue", "Nylon", 60, 4.2, "Open-End Zip", true, false,
            45, 28.5, 2.2, 600000, 1500000, "UK", 1802, 
            "James Coats", 9871234567L, "support@coatszip.com"
        );
    }
}