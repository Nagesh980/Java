class ProductSearch{
  static double getPriceByProduct(String productName) {
    String[] productNames = {
    "car", "bike", "mobile", "watch", "speaker", "fan", "laptop", "tablet", "headphones", "camera",
    "printer", "keyboard", "mouse", "monitor", "fridge", "television", "air conditioner", "microwave",
    "oven", "washing machine", "toaster", "router", "smartwatch", "projector", "gaming console"
    };

    double[] prices = {
    50000.0, 20000.0, 15000.0, 5000.0, 3000.0, 2000.0, 60000.0, 25000.0, 12000.0, 18000.0,  
    10000.0, 4000.0, 2500.0, 8000.0, 45000.0, 55000.0, 35000.0, 15000.0, 9000.0, 27000.0,  
    7000.0, 8500.0, 30000.0, 22000.0, 40000.0
    };

        
        for (int i = 0; i < productNames.length; i++) {
            if (productNames[i] == productName) { 
                return prices[i];
            }
        }
        return -1; 
    }
  public static String[] getBrandsByProduct(String productName) {
        String[] carBrands = {"Toyota", "Honda", "Ford", "BMW", "Audi"};
        String[] bikeBrands = {"Yamaha", "Ducati", "Harley-Davidson", "Kawasaki", "Royal Enfield"};
        String[] mobileBrands = {"Samsung", "Apple", "OnePlus", "Xiaomi", "Realme"};
        String[] watchBrands = {"Rolex", "Fossil", "Casio", "Garmin", "Titan"};
        String[] speakerBrands = {"JBL", "Sony", "Bose", "Marshall", "Harman Kardon"};
        String[] fanBrands = {"Havells", "Usha", "Orient", "Bajaj", "Crompton"};
        String[] laptopBrands = {"Dell", "HP", "Lenovo", "Apple", "Asus"};
        String[] tabletBrands = {"Samsung", "Apple", "Lenovo", "Microsoft", "Huawei"};
        String[] headphonesBrands = {"Sony", "Bose", "JBL", "Sennheiser", "Beats"};
        String[] cameraBrands = {"Canon", "Nikon", "Sony", "Fujifilm", "Panasonic"};
        String[] printerBrands = {"HP", "Epson", "Canon", "Brother", "Lexmark"};
        String[] keyboardBrands = {"Logitech", "Razer", "Corsair", "SteelSeries", "HyperX"};
        String[] mouseBrands = {"Logitech", "Razer", "Corsair", "SteelSeries", "HP"};
        String[] monitorBrands = {"LG", "Dell", "Samsung", "BenQ", "Asus"};
        String[] fridgeBrands = {"LG", "Samsung", "Whirlpool", "Haier", "Bosch"};
        String[] televisionBrands = {"Sony", "Samsung", "LG", "TCL", "Panasonic"};
        String[] acBrands = {"Daikin", "Voltas", "Blue Star", "Samsung", "LG"};
        String[] microwaveBrands = {"IFB", "Samsung", "LG", "Morphy Richards", "Whirlpool"};
        String[] ovenBrands = {"Bajaj", "Philips", "Morphy Richards", "Prestige", "LG"};
        String[] washingMachineBrands = {"LG", "Samsung", "Whirlpool", "Bosch", "IFB"};
        String[] toasterBrands = {"Philips", "Bajaj", "Morphy Richards", "Havells", "Usha"};
        String[] routerBrands = {"TP-Link", "Netgear", "Asus", "D-Link", "Linksys"};
        String[] smartwatchBrands = {"Apple", "Samsung", "Garmin", "Fitbit", "Amazfit"};
        String[] projectorBrands = {"Epson", "BenQ", "ViewSonic", "Sony", "LG"};
        String[] gamingConsoleBrands = {"Sony PlayStation", "Microsoft Xbox", "Nintendo Switch", "Steam Deck", "Asus ROG Ally"};
    if (productName=="car") {
            return carBrands;
        } else if (productName=="bike") {
            return bikeBrands;
        } else if (productName=="mobile") {
            return mobileBrands;
        } else if (productName=="watch") {
            return watchBrands;
        } else if (productName=="speaker") {
            return speakerBrands;
        } else if (productName=="fan") {
            return fanBrands;
        } else if (productName=="laptop"){
            return laptopBrands;
        } else if (productName=="tablet") {
            return tabletBrands;
        } else if (productName=="headphones") {
            return headphonesBrands;
        } else if (productName=="camera"){
            return cameraBrands;
        } else if (productName=="printer"){
            return printerBrands;
        } else if (productName=="keyboard") {
            return keyboardBrands;
        } else if (productName=="mouse"){
            return mouseBrands;
		} else if (productName=="monitor") {
            return monitorBrands;
        } else if (productName=="fridge") {
            return fridgeBrands;
        } else if (productName=="television") {
            return televisionBrands;
        } else if (productName=="air conditioner") {
            return acBrands;
        } else if (productName=="microwave"){
            return microwaveBrands;
        } else if (productName=="oven"){
            return ovenBrands;
        } else if (productName=="washing machine") {
            return washingMachineBrands;
        } else if (productName=="toaster"){
            return toasterBrands;
        } else if (productName=="router") {
            return routerBrands;
        } else if (productName=="smartwatch") {
            return smartwatchBrands;
        } else if (productName=="projector") {
            return projectorBrands;
        } else if (productName=="gaming console") {
            return gamingConsoleBrands;
        } else {
            return new String[]{"No brands available"};
        }
    }
  public static void ProductSearchAvailability(String product){
    boolean available = false;
    if(product == "mobile"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "car"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "bike"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "watch"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "speaker"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "fan"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "laptop"){
      available = true;
      System.out.println("Availability :"+available);  
    }
    else if(product == "tablet"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "headphones"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "camera"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "printer"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "keyboard"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "mouse"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "monitor"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "fridge"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "television"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "air conditioner"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "microwave"){
      available = true;
      System.out.println("Availability :"+available);  
    }
    else if(product == "oven"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "washing machine"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "toaster"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "router"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "smartwatch"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "projector"){
      available = true;
      System.out.println("Availability :"+available);
    }
    else if(product == "gaming console"){
      available = true;
	System.out.println("Availability :"+available);
    }
    else{
      System.out.println("Match not found");
      return;
    }
  }
}