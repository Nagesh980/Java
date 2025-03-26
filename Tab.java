class Tab {
    String modelName;
    String brand;
    double displaySize;
    String displayTechnology;
    int ram;
    int internalStorage;
    boolean expandableStorage;
    String operatingSystem;
    String chipset;
    int batteryBackup;
    double deviceWeight;
    int mainCameraMP;
    int frontCameraMP;
    boolean hasHDRSupport;
    boolean hasWirelessCharging;
    boolean waterResistant;
    boolean stylusIncluded;
    String connectivityType;
    int launchYear;
    String bodyColor;
    int warrantyInMonths;
    double marketPrice;
    int usbPortType;
    String speakerType;
    boolean hasHeadphoneJack;
    String frameMaterial; 
    String manufacturingCountry;
    long serviceCenterContact;
    String serviceCenterEmail;

    public Tab(String modelName, String brand, double displaySize, String displayTechnology, int ram, 
               int internalStorage, boolean expandableStorage, String operatingSystem, String chipset, 
               int batteryBackup, double deviceWeight, int mainCameraMP, int frontCameraMP, boolean hasHDRSupport, 
               boolean hasWirelessCharging, boolean waterResistant, boolean stylusIncluded, 
               String connectivityType, int launchYear, String bodyColor, int warrantyInMonths, 
               double marketPrice, int usbPortType, String speakerType, boolean hasHeadphoneJack, 
               String frameMaterial, String manufacturingCountry, long serviceCenterContact, 
               String serviceCenterEmail) {
        
        this.modelName = modelName;
        this.brand = brand;
        this.displaySize = displaySize;
        this.displayTechnology = displayTechnology;
        this.ram = ram;
        this.internalStorage = internalStorage;
        this.expandableStorage = expandableStorage;
        this.operatingSystem = operatingSystem;
        this.chipset = chipset;
        this.batteryBackup = batteryBackup;
        this.deviceWeight = deviceWeight;
        this.mainCameraMP = mainCameraMP;
        this.frontCameraMP = frontCameraMP;
        this.hasHDRSupport = hasHDRSupport;
        this.hasWirelessCharging = hasWirelessCharging;
        this.waterResistant = waterResistant;
        this.stylusIncluded = stylusIncluded;
        this.connectivityType = connectivityType;
        this.launchYear = launchYear;
        this.bodyColor = bodyColor;
        this.warrantyInMonths = warrantyInMonths;
        this.marketPrice = marketPrice;
        this.usbPortType = usbPortType;
        this.speakerType = speakerType;
        this.hasHeadphoneJack = hasHeadphoneJack;
        this.frameMaterial = frameMaterial;
        this.manufacturingCountry = manufacturingCountry;
        this.serviceCenterContact = serviceCenterContact;
        this.serviceCenterEmail = serviceCenterEmail;

        System.out.println("Model Name: " + modelName);
        System.out.println("Brand: " + brand);
        System.out.println("Display Size: " + displaySize + " inches");
        System.out.println("Display Technology: " + displayTechnology);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Internal Storage: " + internalStorage + " GB");
        System.out.println("Expandable Storage: " + expandableStorage);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Chipset: " + chipset);
        System.out.println("Battery Backup: " + batteryBackup + " hours");
        System.out.println("Weight: " + deviceWeight + " kg");
        System.out.println("Main Camera: " + mainCameraMP + " MP");
        System.out.println("Front Camera: " + frontCameraMP + " MP");
        System.out.println("HDR Support: " + hasHDRSupport);
        System.out.println("Wireless Charging: " + hasWirelessCharging);
        System.out.println("Water Resistant: " + waterResistant);
        System.out.println("Stylus Included: " + stylusIncluded);
        System.out.println("Connectivity Type: " + connectivityType);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Body Color: " + bodyColor);
        System.out.println("Warranty: " + warrantyInMonths + " months");
        System.out.println("Market Price: ₹" + marketPrice);
        System.out.println("USB Port Type: " + usbPortType);
        System.out.println("Speaker Type: " + speakerType);
        System.out.println("Has Headphone Jack: " + hasHeadphoneJack);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Manufacturing Country: " + manufacturingCountry);
        System.out.println("Service Center Contact: " + serviceCenterContact);
        System.out.println("Service Center Email: " + serviceCenterEmail);
    }
}
