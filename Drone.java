class Drone {
    String modelName;
    String brandName;
    double droneWeight;
    double topSpeed;
    int batteryDuration;
    double flightRange;
    String cameraResolution;
    boolean gpsSupport;
    boolean collisionAvoidance;
    int availableFlightModes;
    double rechargeTime;
    int maxFlightAltitude;
    String remoteType;
    boolean liveFeedEnabled;
    int warrantyPeriod;
    String networkType;
    long uniqueSerial;
    String droneManufacturer;
    String bodyColor;
    boolean isFoldable;

    public Drone(String modelName, String brandName, double droneWeight, double topSpeed, int batteryDuration, 
                 double flightRange, String cameraResolution, boolean gpsSupport, boolean collisionAvoidance, 
                 int availableFlightModes, double rechargeTime, int maxFlightAltitude, String remoteType, 
                 boolean liveFeedEnabled, int warrantyPeriod, String networkType, long uniqueSerial, 
                 String droneManufacturer, String bodyColor, boolean isFoldable) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.droneWeight = droneWeight;
        this.topSpeed = topSpeed;
        this.batteryDuration = batteryDuration;
        this.flightRange = flightRange;
        this.cameraResolution = cameraResolution;
        this.gpsSupport = gpsSupport;
        this.collisionAvoidance = collisionAvoidance;
        this.availableFlightModes = availableFlightModes;
        this.rechargeTime = rechargeTime;
        this.maxFlightAltitude = maxFlightAltitude;
        this.remoteType = remoteType;
        this.liveFeedEnabled = liveFeedEnabled;
        this.warrantyPeriod = warrantyPeriod;
        this.networkType = networkType;
        this.uniqueSerial = uniqueSerial;
        this.droneManufacturer = droneManufacturer;
        this.bodyColor = bodyColor;
        this.isFoldable = isFoldable;

        System.out.println("Model Name: " + modelName);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Drone Weight: " + droneWeight + " kg");
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Battery Duration: " + batteryDuration + " min");
        System.out.println("Flight Range: " + flightRange + " km");
        System.out.println("Camera Resolution: " + cameraResolution);
        System.out.println("GPS Support: " + gpsSupport);
        System.out.println("Collision Avoidance: " + collisionAvoidance);
        System.out.println("Available Flight Modes: " + availableFlightModes);
        System.out.println("Recharge Time: " + rechargeTime + " hours");
        System.out.println("Max Flight Altitude: " + maxFlightAltitude + " meters");
        System.out.println("Remote Type: " + remoteType);
        System.out.println("Live Feed Enabled: " + liveFeedEnabled);
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
        System.out.println("Network Type: " + networkType);
        System.out.println("Unique Serial Number: " + uniqueSerial);
        System.out.println("Drone Manufacturer: " + droneManufacturer);
        System.out.println("Body Color: " + bodyColor);
        System.out.println("Foldable: " + isFoldable);
    }
}


