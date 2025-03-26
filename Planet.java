class Planet {
    String celestialName;
    double massRelativeToEarth; 
    double equatorialRadius; 
    double surfaceGravity; 
    double orbitDuration; 
    double sunDistance; 
    int moonCount;
    boolean ringPresence;
    boolean lifeSustaining;
    String atmosphericGases;
    double avgSurfaceTemp; 
    double axialInclination; 
    int yearOfDiscovery;
    String discoverer;
    boolean dwarfClassification;
    double spinDuration; 
    double materialDensity; 
    double reflectivity; 
    String celestialCategory;
    String predominantElement;
    long estimatedInhabitants; 

    public Planet(
        String celestialName, double massRelativeToEarth, double equatorialRadius, double surfaceGravity, double orbitDuration, 
        double sunDistance, int moonCount, boolean ringPresence, boolean lifeSustaining, 
        String atmosphericGases, double avgSurfaceTemp, double axialInclination, int yearOfDiscovery, 
        String discoverer, boolean dwarfClassification, double spinDuration, double materialDensity, 
        double reflectivity, String celestialCategory, String predominantElement, long estimatedInhabitants
    ) {
        this.celestialName = celestialName;
        this.massRelativeToEarth = massRelativeToEarth;
        this.equatorialRadius = equatorialRadius;
        this.surfaceGravity = surfaceGravity;
        this.orbitDuration = orbitDuration;
        this.sunDistance = sunDistance;
        this.moonCount = moonCount;
        this.ringPresence = ringPresence;
        this.lifeSustaining = lifeSustaining;
        this.atmosphericGases = atmosphericGases;
        this.avgSurfaceTemp = avgSurfaceTemp;
        this.axialInclination = axialInclination;
        this.yearOfDiscovery = yearOfDiscovery;
        this.discoverer = discoverer;
        this.dwarfClassification = dwarfClassification;
        this.spinDuration = spinDuration;
        this.materialDensity = materialDensity;
        this.reflectivity = reflectivity;
        this.celestialCategory = celestialCategory;
        this.predominantElement = predominantElement;
        this.estimatedInhabitants = estimatedInhabitants;

        System.out.println("Celestial Name: " + celestialName);
        System.out.println("Mass Relative to Earth: " + massRelativeToEarth + " Earth masses");
        System.out.println("Equatorial Radius: " + equatorialRadius + " km");
        System.out.println("Surface Gravity: " + surfaceGravity + " m/s²");
        System.out.println("Orbit Duration: " + orbitDuration + " days");
        System.out.println("Distance from Sun: " + sunDistance + " million km");
        System.out.println("Number of Moons: " + moonCount);
        System.out.println("Has Rings? " + ringPresence);
        System.out.println("Sustains Life? " + lifeSustaining);
        System.out.println("Atmospheric Gases: " + atmosphericGases);
        System.out.println("Average Surface Temperature: " + avgSurfaceTemp + "°C");
        System.out.println("Axial Inclination: " + axialInclination + " degrees");
        System.out.println("Year of Discovery: " + yearOfDiscovery);
        System.out.println("Discovered By: " + discoverer);
        System.out.println("Dwarf Classification? " + dwarfClassification);
        System.out.println("Spin Duration: " + spinDuration + " hours");
        System.out.println("Material Density: " + materialDensity + " g/cm³");
        System.out.println("Reflectivity (Albedo): " + reflectivity);
        System.out.println("Celestial Category: " + celestialCategory);
        System.out.println("Predominant Element: " + predominantElement);
        System.out.println("Estimated Inhabitants: " + estimatedInhabitants);
    }
}


