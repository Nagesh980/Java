class PaintBrushRunner {
    public static void main(String[] args) {
        PaintBrush brush1 = new PaintBrush(
            "Camlin", "Round", 12.5, "Synthetic", "Wood", "Black", 150, 
            true, true, "Watercolor", 25.0, "Art", 12, true, 
            "India", "Camlin Ltd", 9876543210L, "support@camlin.com", "Yes", true
        );

		System.out.println("---Updated values---");
        PaintBrush brush2 = new PaintBrush(
            "Faber-Castell", "Flat", 14.0, "Natural", "Plastic", "Red", 200, 
            true, false, "Acrylic", 30.0, "Professional", 18, false, 
            "Germany", "Faber-Castell AG", 9988776655L, "info@fabercastell.com", "Yes", false
        );

		System.out.println("---Updated values---");
        PaintBrush brush3 = new PaintBrush(
            "Brustro", "Fan", 10.0, "Synthetic", "Metal", "Blue", 250, 
            false, true, "Oil Painting", 20.0, "Studio", 24, true, 
            "Italy", "Brustro Art Supplies", 1122334455L, "help@brustro.com", "No", true
        );
    }
}