class Cab {
    String vehicleName;
    String fleetProvider;
    String carModel;
    String licensePlate;
    String driverFullName;
    String driverID;
    String fuelCategory;
    String vehicleType;
    int passengerCapacity;
    double costPerKm;
    double earningsToDate;
    double kilometersDriven;
    int operationalYears;
    boolean isOperational;
    boolean airConditioning;
    double feedbackRating;
    String supportContactEmail;
    long supportContactNumber;
    String operatingRegion;
    String bodyColor;

    public Cab(String vehicleName, String fleetProvider, String carModel, String licensePlate, 
               String driverFullName, String driverID, String fuelCategory, String vehicleType, 
               int passengerCapacity, double costPerKm, double earningsToDate, double kilometersDriven, 
               int operationalYears, boolean isOperational, boolean airConditioning, double feedbackRating, 
               String supportContactEmail, long supportContactNumber, String operatingRegion, String bodyColor) {
        this.vehicleName = vehicleName;
        this.fleetProvider = fleetProvider;
        this.carModel = carModel;
        this.licensePlate = licensePlate;
        this.driverFullName = driverFullName;
        this.driverID = driverID;
        this.fuelCategory = fuelCategory;
        this.vehicleType = vehicleType;
        this.passengerCapacity = passengerCapacity;
        this.costPerKm = costPerKm;
        this.earningsToDate = earningsToDate;
        this.kilometersDriven = kilometersDriven;
        this.operationalYears = operationalYears;
        this.isOperational = isOperational;
        this.airConditioning = airConditioning;
        this.feedbackRating = feedbackRating;
        this.supportContactEmail = supportContactEmail;
        this.supportContactNumber = supportContactNumber;
        this.operatingRegion = operatingRegion;
        this.bodyColor = bodyColor;

        System.out.println("Cab Details:");
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Fleet Provider: " + fleetProvider);
        System.out.println("Car Model: " + carModel);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Driver Name: " + driverFullName);
        System.out.println("Driver ID: " + driverID);
        System.out.println("Fuel Category: " + fuelCategory);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Cost Per Km: ₹" + costPerKm);
        System.out.println("Earnings To Date: ₹" + earningsToDate);
        System.out.println("Kilometers Driven: " + kilometersDriven + " km");
        System.out.println("Operational Years: " + operationalYears);
        System.out.println("Is Operational: " + isOperational);
        System.out.println("Air Conditioning: " + airConditioning);
        System.out.println("Feedback Rating: " + feedbackRating);
        System.out.println("Support Contact Email: " + supportContactEmail);
        System.out.println("Support Contact Number: " + supportContactNumber);
        System.out.println("Operating Region: " + operatingRegion);
        System.out.println("Body Color: " + bodyColor);
    }
}


