class Mirror {
    String type;
    String frameColor;
    String material;
    String brand;
    double height;
    double width;
    double price;
    boolean isFoldable;
    boolean hasBluetoothSpeaker;
    boolean isWaterproof;
    String usageType;
    String energySource;
    double weight;
    int warrantyYears;
    String originCountry;
    int manufactureYear;
    String manufacturer;
    String customerServiceEmail;
    long customerServiceNumber;

    public Mirror(String type, String frameColor, String material, String brand, 
                  double height, double width, double price, boolean isFoldable, 
                  boolean hasBluetoothSpeaker, boolean isWaterproof, String usageType, 
                  String energySource, double weight, int warrantyYears, String originCountry, 
                  int manufactureYear, String manufacturer, String customerServiceEmail, 
                  long customerServiceNumber) {
        this.type = type;
        this.frameColor = frameColor;
        this.material = material;
        this.brand = brand;
        this.height = height;
        this.width = width;
        this.price = price;
        this.isFoldable = isFoldable;
        this.hasBluetoothSpeaker = hasBluetoothSpeaker;
        this.isWaterproof = isWaterproof;
        this.usageType = usageType;
        this.energySource = energySource;
        this.weight = weight;
        this.warrantyYears = warrantyYears;
        this.originCountry = originCountry;
        this.manufactureYear = manufactureYear;
        this.manufacturer = manufacturer;
        this.customerServiceEmail = customerServiceEmail;
        this.customerServiceNumber = customerServiceNumber;

        System.out.println("Mirror Type: " + type);
        System.out.println("Frame Color: " + frameColor);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Height: " + height + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Price: $" + price);
        System.out.println("Foldable: " + isFoldable);
        System.out.println("Has Bluetooth Speaker: " + hasBluetoothSpeaker);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Energy Source: " + energySource);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Customer Service Email: " + customerServiceEmail);
        System.out.println("Customer Service Number: " + customerServiceNumber);
    }
}
