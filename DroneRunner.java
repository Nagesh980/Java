class DroneRunner {
    public static void main(String[] args) {
        Drone drone1 = new Drone(
            "Phantom 4", "DJI", 1.38, 72.0, 30, 7.0, "4K Ultra HD", true, true, 5,
            1.2, 6000, "Remote Control", true, 2, "WiFi, Bluetooth", 9876543210L, 
            "DJI Innovations", "White", true
        );

		System.out.println("---Updated values---");
        Drone drone2 = new Drone(
            "Mavic Air 2", "DJI", 0.57, 68.0, 34, 10.0, "48MP HDR", true, true, 7,
            1.5, 5000, "Smart Controller", true, 3, "5.8 GHz", 1234567890L, 
            "DJI", "Gray", true
        );

		System.out.println("---Updated values---");
        Drone drone3 = new Drone(
            "Autel Evo II", "Autel Robotics", 1.19, 72.0, 40, 9.0, "8K HDR", true, true, 8,
            1.8, 7000, "Touchscreen Controller", true, 2, "Dual-band", 5678901234L, 
            "Autel", "Orange", false
        );
    }
}