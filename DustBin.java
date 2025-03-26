class DustBin {
    String brandName;
    String buildMaterial;
    double volumeCapacity;
    String exteriorColor;
    boolean comesWithLid;
    boolean ecoFriendly;
    String designShape;
    double heightInCm;
    double widthInCm;
    int netWeight;
    String intendedUse;
    String lidMechanism;
    boolean footPedalAvailable;
    boolean fireProof;
    boolean odorControl;
    int warrantyDuration;
    String productionCompany;
    long supportContactNumber;
    String supportEmail;
    String originCountry;

    public DustBin(String brandName, String buildMaterial, double volumeCapacity, String exteriorColor, 
                    boolean comesWithLid, boolean ecoFriendly, String designShape, double heightInCm, 
                    double widthInCm, int netWeight, String intendedUse, String lidMechanism, 
                    boolean footPedalAvailable, boolean fireProof, boolean odorControl, 
                    int warrantyDuration, String productionCompany, long supportContactNumber, 
                    String supportEmail, String originCountry) {
        this.brandName = brandName;
        this.buildMaterial = buildMaterial;
        this.volumeCapacity = volumeCapacity;
        this.exteriorColor = exteriorColor;
        this.comesWithLid = comesWithLid;
        this.ecoFriendly = ecoFriendly;
        this.designShape = designShape;
        this.heightInCm = heightInCm;
        this.widthInCm = widthInCm;
        this.netWeight = netWeight;
        this.intendedUse = intendedUse;
        this.lidMechanism = lidMechanism;
        this.footPedalAvailable = footPedalAvailable;
        this.fireProof = fireProof;
        this.odorControl = odorControl;
        this.warrantyDuration = warrantyDuration;
        this.productionCompany = productionCompany;
        this.supportContactNumber = supportContactNumber;
        this.supportEmail = supportEmail;
        this.originCountry = originCountry;

        System.out.println("Trash Can Details:");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Material: " + buildMaterial);
        System.out.println("Capacity: " + volumeCapacity + " liters");
        System.out.println("Color: " + exteriorColor);
        System.out.println("Comes With Lid: " + comesWithLid);
        System.out.println("Eco-Friendly: " + ecoFriendly);
        System.out.println("Shape: " + designShape);
        System.out.println("Height: " + heightInCm + " cm");
        System.out.println("Width: " + widthInCm + " cm");
        System.out.println("Weight: " + netWeight + " kg");
        System.out.println("Intended Use: " + intendedUse);
        System.out.println("Lid Mechanism: " + lidMechanism);
        System.out.println("Foot Pedal Available: " + footPedalAvailable);
        System.out.println("Fireproof: " + fireProof);
        System.out.println("Odor Control: " + odorControl);
        System.out.println("Warranty: " + warrantyDuration + " years");
        System.out.println("Production Company: " + productionCompany);
        System.out.println("Support Contact Number: " + supportContactNumber);
        System.out.println("Support Email: " + supportEmail);
        System.out.println("Country of Origin: " + originCountry);
    }
}
