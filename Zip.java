class Zip {
    String modelName;
    String manufacturer;
    double dimension;
    String shade;
    String composition;
    int price;
    double mass;
    String category;
    boolean isWaterproof;
    boolean isRustProof;
    int numberOfTeeth;
    double totalLength;
    double totalWidth;
    long yearlySales;
    long yearlyRevenue;
    String placeOfOrigin;
    int establishedYear;
    String creator;
    long supportContact;
    String supportEmail;

    public Zip(String modelName, String manufacturer, double dimension, String shade, String composition, int price, 
               double mass, String category, boolean isWaterproof, boolean isRustProof, int numberOfTeeth, 
               double totalLength, double totalWidth, long yearlySales, long yearlyRevenue, String placeOfOrigin, 
               int establishedYear, String creator, long supportContact, String supportEmail) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
        this.shade = shade;
        this.composition = composition;
        this.price = price;
        this.mass = mass;
        this.category = category;
        this.isWaterproof = isWaterproof;
        this.isRustProof = isRustProof;
        this.numberOfTeeth = numberOfTeeth;
        this.totalLength = totalLength;
        this.totalWidth = totalWidth;
        this.yearlySales = yearlySales;
        this.yearlyRevenue = yearlyRevenue;
        this.placeOfOrigin = placeOfOrigin;
        this.establishedYear = establishedYear;
        this.creator = creator;
        this.supportContact = supportContact;
        this.supportEmail = supportEmail;

        System.out.println("Model Name: " + modelName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Dimension: " + dimension + " cm");
        System.out.println("Shade: " + shade);
        System.out.println("Composition: " + composition);
        System.out.println("Price: ₹" + price);
        System.out.println("Mass: " + mass + " g");
        System.out.println("Category: " + category);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Rust Proof: " + isRustProof);
        System.out.println("Number of Teeth: " + numberOfTeeth);
        System.out.println("Total Length: " + totalLength + " cm");
        System.out.println("Total Width: " + totalWidth + " cm");
        System.out.println("Yearly Sales: " + yearlySales);
        System.out.println("Yearly Revenue: ₹" + yearlyRevenue);
        System.out.println("Place of Origin: " + placeOfOrigin);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Creator: " + creator);
        System.out.println("Support Contact: " + supportContact);
        System.out.println("Support Email: " + supportEmail);
    }
}


