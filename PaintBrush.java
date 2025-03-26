class PaintBrush {
    String company;
    String type;
    double size;
    String bristleType;
    String handleType;
    String shade;
    int cost;
    boolean waterproof;
    boolean washable;
    String application;
    double mass;
    String category;
    int lifespan;
    boolean gripAvailable;
    String originCountry;
    String producer;
    long supportContact;
    String supportEmail;
    String storeAvailability;
    boolean ecoFriendly;

    public PaintBrush(String company, String type, double size, String bristleType, String handleType,
                      String shade, int cost, boolean waterproof, boolean washable, String application, 
                      double mass, String category, int lifespan, boolean gripAvailable, 
                      String originCountry, String producer, long supportContact, 
                      String supportEmail, String storeAvailability, boolean ecoFriendly) {
        this.company = company;
        this.type = type;
        this.size = size;
        this.bristleType = bristleType;
        this.handleType = handleType;
        this.shade = shade;
        this.cost = cost;
        this.waterproof = waterproof;
        this.washable = washable;
        this.application = application;
        this.mass = mass;
        this.category = category;
        this.lifespan = lifespan;
        this.gripAvailable = gripAvailable;
        this.originCountry = originCountry;
        this.producer = producer;
        this.supportContact = supportContact;
        this.supportEmail = supportEmail;
        this.storeAvailability = storeAvailability;
        this.ecoFriendly = ecoFriendly;

        System.out.println("Company: " + company);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size + " mm");
        System.out.println("Bristle Type: " + bristleType);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Shade: " + shade);
        System.out.println("Cost: ₹" + cost);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Washable: " + washable);
        System.out.println("Application: " + application);
        System.out.println("Mass: " + mass + " g");
        System.out.println("Category: " + category);
        System.out.println("Lifespan: " + lifespan + " months");
        System.out.println("Grip Available: " + gripAvailable);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Producer: " + producer);
        System.out.println("Support Contact: " + supportContact);
        System.out.println("Support Email: " + supportEmail);
        System.out.println("Store Availability: " + storeAvailability);
        System.out.println("Eco-Friendly: " + ecoFriendly);
    }
}


