class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror1 = new Mirror(
            "LED Bathroom Mirror", "Silver", "Aluminum & Glass", "Kohler", 
            80.0, 60.0, 299.99, false, true, true, 
            "Bathroom", "Electric", 9.5, 5, "USA", 
            2023, "Kohler Co.", "support@kohler.com", 18005551234L
        );
		
		System.out.println("---Updated values---");
        Mirror mirror2 = new Mirror(
            "Portable Makeup Mirror", "Pink", "Plastic", "Fancii", 
            20.0, 15.0, 49.99, true, false, false, 
            "Makeup", "Battery", 0.8, 2, "China", 
            2022, "Fancii Ltd.", "help@fancii.com", 1234567890L
        );
		
		System.out.println("---Updated values---");
        Mirror mirror3 = new Mirror(
            "Gym Wall Mirror", "Black", "Tempered Glass", "Nike", 
            200.0, 100.0, 499.99, false, false, true, 
            "Gym", "None", 25.0, 10, "Germany", 
            2021, "Nike Interiors", "care@nike.com", 9998887776L
        );
    }
}
