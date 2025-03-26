class DustBinRunner {
    public static void main(String[] args) {
        DustBin dustbin = new DustBin(
            "NeatBin", "Stainless Steel", 40.0, "Black", true, false, "Cylindrical", 
            55.0, 38.0, 4, "Office", "Touchless Sensor", true, true, true, 
            5, "SmartBins Ltd.", 9988776655L, "support@neatbin.com", "Japan"
        );

		System.out.println("---Updated values---");
        DustBin dustbin2 = new DustBin(
            "EcoTrash", "Biodegradable Plastic", 25.0, "Green", false, true, "Oval", 
            45.0, 32.0, 2, "Garden", "Open Top", false, false, false, 
            3, "EcoSolutions", 8877665544L, "contact@ecotrash.com", "Canada"
        );

		System.out.println("---Updated values---");
        DustBin dustbin3 = new DustBin(
            "Durabin", "Metal", 60.0, "Grey", true, false, "Square", 
            75.0, 50.0, 7, "Industrial", "Sliding Lid", false, true, true, 
            8, "SteelPro Industries", 7766554433L, "help@durabin.com", "Germany"
        );
    }
}
