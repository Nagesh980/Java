class Rocket {
    String rocketName;
    String manufacturer;
    double height;
    double weight;
    double payloadCapacity;
    int stages;
    double thrust;
    double fuelCapacity;
    double maxSpeed;
    int launchSuccessRate;
    long launchCost;
    long developmentCost;
    String launchSite;
    int firstLaunchYear;
    String missionType;
    String countryOfOrigin;
    long missionCount;
    String propulsionType;
    boolean reusable;
    boolean crewed;

    public Rocket(String rocketName, String manufacturer, double height, double weight, double payloadCapacity,
                  int stages, double thrust, double fuelCapacity, double maxSpeed, int launchSuccessRate,
                  long launchCost, long developmentCost, String launchSite, int firstLaunchYear, String missionType,
                  String countryOfOrigin, long missionCount, String propulsionType, boolean reusable, boolean crewed) {
        this.rocketName = rocketName;
        this.manufacturer = manufacturer;
        this.height = height;
        this.weight = weight;
        this.payloadCapacity = payloadCapacity;
        this.stages = stages;
        this.thrust = thrust;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.launchSuccessRate = launchSuccessRate;
        this.launchCost = launchCost;
        this.developmentCost = developmentCost;
        this.launchSite = launchSite;
        this.firstLaunchYear = firstLaunchYear;
        this.missionType = missionType;
        this.countryOfOrigin = countryOfOrigin;
        this.missionCount = missionCount;
        this.propulsionType = propulsionType;
        this.reusable = reusable;
        this.crewed = crewed;

        System.out.println("Rocket Name: " + rocketName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " tons");
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        System.out.println("Stages: " + stages);
        System.out.println("Thrust: " + thrust + " kN");
        System.out.println("Fuel Capacity: " + fuelCapacity + " tons");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Launch Success Rate: " + launchSuccessRate + "%");
        System.out.println("Launch Cost: $" + launchCost + " million");
        System.out.println("Development Cost: $" + developmentCost + " million");
        System.out.println("Launch Site: " + launchSite);
        System.out.println("First Launch Year: " + firstLaunchYear);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Total Missions: " + missionCount);
        System.out.println("Propulsion Type: " + propulsionType);
        System.out.println("Reusable: " + reusable);
        System.out.println("Crewed: " + crewed);
    }
}
