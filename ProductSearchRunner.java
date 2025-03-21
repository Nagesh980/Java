class ProductSearchRunner{
	public static void main(String[] args){
		String product = "mobile"; 
        double price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "watch"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "speaker"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "fan"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "laptop"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "tablet"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "headphones"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "printer"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "keyboard"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "mouse"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "monitor"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "fridge"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "television"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "air conditioner"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "oven"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "washing machine"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "toaster"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "router"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "smartwatch"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "projector"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "gaming console"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "camera"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "microwave"; 
        price = ProductSearch.getPriceByProduct(product); 
        
        if (price != -1) {
            System.out.println("The price of " + product + " is: $" + price);
        } else {
            System.out.println("Product not found!");
        }
		product = "mobile";
        String[] brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "car";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "bike";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "watch";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "speaker";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "fan";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "laptop";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "tablet";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "headphones";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "camera";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "printer";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "keyboard";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "mouse";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "monitor";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "fridge";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "television";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "air conditioner";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "microwave";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
	System.out.println(brands[i] );
    }
    product = "oven";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "washing machine";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "toaster";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "router";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "smartwatch";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "projector";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    product = "gaming console";
        brands = ProductSearch.getBrandsByProduct(product);
    System.out.println("brands for "+product+" are");
        for(int i=0;i<brands.length;i++){
      System.out.println(brands[i] );
    }
    ProductSearch.ProductSearchAvailability("mobile");
    ProductSearch.ProductSearchAvailability("car");
    ProductSearch.ProductSearchAvailability("bike");
    ProductSearch.ProductSearchAvailability("watch");
    ProductSearch.ProductSearchAvailability("speaker");
    ProductSearch.ProductSearchAvailability("fan");
    ProductSearch.ProductSearchAvailability("laptop");
    ProductSearch.ProductSearchAvailability("tablet");
    ProductSearch.ProductSearchAvailability("headphones");
    ProductSearch.ProductSearchAvailability("camera");
    ProductSearch.ProductSearchAvailability("printer");
    ProductSearch.ProductSearchAvailability("keyboard");
    ProductSearch.ProductSearchAvailability("mouse");
    ProductSearch.ProductSearchAvailability("monitor");
    ProductSearch.ProductSearchAvailability("fridge");
    ProductSearch.ProductSearchAvailability("television");
    ProductSearch.ProductSearchAvailability("air conditioner");
    ProductSearch.ProductSearchAvailability("microwave");
    ProductSearch.ProductSearchAvailability("oven");
    ProductSearch.ProductSearchAvailability("washing machine");
    ProductSearch.ProductSearchAvailability("toaster");
    ProductSearch.ProductSearchAvailability("router");
    ProductSearch.ProductSearchAvailability("smartwatch");
    ProductSearch.ProductSearchAvailability("projector");
    ProductSearch.ProductSearchAvailability("gaming console");
    ProductSearch.ProductSearchAvailability("abc");

		
	}
}