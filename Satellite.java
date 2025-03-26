class Satellite {
    String satelliteName;
    String countryOrigin;
    String satelliteType;
    double satelliteMass;
    double orbitAltitude;
    double orbitalSpeed;
    int launchYear;
    String launchVehicle;
    String primaryMission;
    boolean operationalStatus;
    long projectCost;
    String managingAgency;
    double powerCapacity;
    int lifespan;
    boolean isManned;
    String launchSite;
    String operatingAgency;
    double antennaDiameter;
    int transmissionBands;
    String propulsionType;

    public Satellite(String satelliteName, String countryOrigin, String satelliteType, double satelliteMass, 
                     double orbitAltitude, double orbitalSpeed, int launchYear, String launchVehicle, 
                     String primaryMission, boolean operationalStatus, long projectCost, String managingAgency, 
                     double powerCapacity, int lifespan, boolean isManned, String launchSite, 
                     String operatingAgency, double antennaDiameter, int transmissionBands, String propulsionType) {
        this.satelliteName = satelliteName;
        this.countryOrigin = countryOrigin;
        this.satelliteType = satelliteType;
        this.satelliteMass = satelliteMass;
        this.orbitAltitude = orbitAltitude;
        this.orbitalSpeed = orbitalSpeed;
        this.launchYear = launchYear;
        this.launchVehicle = launchVehicle;
        this.primaryMission = primaryMission;
        this.operationalStatus = operationalStatus;
        this.projectCost = projectCost;
        this.managingAgency = managingAgency;
        this.powerCapacity = powerCapacity;
        this.lifespan = lifespan;
        this.isManned = isManned;
        this.launchSite = launchSite;
        this.operatingAgency = operatingAgency;
        this.antennaDiameter = antennaDiameter;
        this.transmissionBands = transmissionBands;
        this.propulsionType = propulsionType;

        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Country of Origin: " + countryOrigin);
        System.out.println("Satellite Type: " + satelliteType);
        System.out.println("Mass: " + satelliteMass + " kg");
        System.out.println("Orbit Altitude: " + orbitAltitude + " km");
        System.out.println("Orbital Speed: " + orbitalSpeed + " km/s");
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Primary Mission: " + primaryMission);
        System.out.println("Operational Status: " + operationalStatus);
        System.out.println("Project Cost: $" + projectCost);
        System.out.println("Managing Agency: " + managingAgency);
        System.out.println("Power Capacity: " + powerCapacity + " kW");
        System.out.println("Lifespan: " + lifespan + " years");
        System.out.println("Manned: " + isManned);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Operating Agency: " + operatingAgency);
        System.out.println("Antenna Diameter: " + antennaDiameter + " meters");
        System.out.println("Transmission Bands: " + transmissionBands);
        System.out.println("Propulsion Type: " + propulsionType);
    }
}


