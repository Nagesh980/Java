class TabRunner {
    public static void main(String[] args) {
        Tab tab1 = new Tab(
            "Galaxy Tab S9 Ultra", "Samsung", 14.6, "Super AMOLED", 12, 
            512, true, "Android", "Snapdragon 8 Gen 2", 16, 0.7, 
            13, 12, true, true, true, true, 
            "WiFi + 5G", 2023, "Graphite", 24, 
            120000, 3, "Quad-Speaker", false, "Aluminum", 
            "South Korea", 18001234567L, "support@samsung.com"
        );

		System.out.println("---Updated values---");
        Tab tab2 = new Tab(
            "iPad Air 6", "Apple", 10.9, "Liquid Retina", 8, 
            256, false, "iPadOS", "Apple M2", 12, 0.46, 
            12, 10, true, false, false, false, 
            "WiFi Only", 2024, "Blue", 12, 
            90000, 4, "Stereo", false, "Aluminum", 
            "USA", 18005551234L, "support@apple.com"
        );
		
		System.out.println("---Updated values---");
        Tab tab3 = new Tab(
            "Xiaomi Pad 6 Pro", "Xiaomi", 11.0, "IPS LCD", 8, 
            128, true, "Android", "Snapdragon 8+ Gen 1", 14, 0.51, 
            50, 20, false, false, false, true, 
            "WiFi + 4G", 2023, "Grey", 18, 
            40000, 2, "Stereo", true, "Plastic", 
            "China", 18009998888L, "support@xiaomi.com"
        );
    }
}
