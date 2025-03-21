class MethodRunner{
	public static void main(String[] args){
		System.out.println("running main");
		
		//Syringe
		int quantity1=10;
		int quantity2=20;
		int quantity3=30;
		int quantity4=5;
		int quantity5=8;
		String med1="Insulin";
		String med2="Penicillin";
		String med3="Morphine";
		String med4="Adrenaline";
		String med5="Covaxin";
		String nurseName1="Neha";	
		String nurseName2="Sneha";
		String nurseName3="Donna";
		String nurseName4="Pragathi";
		String nurseName5="Swathi";
		boolean prescribed1=true;
		boolean prescribed2=false;
				
		Syringe.details(quantity1,med1,nurseName1);
		Syringe.details(quantity2,med2,nurseName2);
		Syringe.details(quantity3,med3,nurseName3);
		Syringe.details(quantity4,med4,nurseName4);
		Syringe.details(quantity5,med5,nurseName5);	
		
		Syringe.inject(prescribed1);
		Syringe.inject(prescribed2);
		
		//Tablet
		String tab1="Paracetamol";
		String tab2="Ibuprofen";
		String tab3="Omeprazole";
		String tab4="Cetrizine";
		String tab5="Azithromycin";
				
		int time1=30;
		int time2=15;
		int time3=20;
		int time4=120;
		int time5=60;
		
		String disease1="Fever";
		String disease2="Inflammation";
		String disease3="Acidity";
		String disease4="Allergies";
		String disease5="Bacterial infections";
		
		boolean killPain1=true;
		boolean killPain2=false;
		
		Tablet.dissolve(tab1,time3);
		Tablet.dissolve(tab2,time2);
		Tablet.dissolve(tab3,time1);
		Tablet.dissolve(tab4,time3);
		Tablet.dissolve(tab5,time1);
		
		Tablet.cure(tab1,disease1);
		Tablet.cure(tab2,disease2);
		Tablet.cure(tab3,disease3);
		Tablet.cure(tab4,disease4);
		Tablet.cure(tab5,disease5);
		
		Tablet.killThePain(tab1,killPain1);
		Tablet.killThePain(tab2,killPain1);
		Tablet.killThePain(tab3,killPain2);
		Tablet.killThePain(tab4,killPain2);
		Tablet.killThePain(tab5,killPain2);
		
		Tablet.react(tab1,time1);
		Tablet.react(tab2,time3);
		Tablet.react(tab3,time5);
		Tablet.react(tab4,time1);
		Tablet.react(tab5,time1);
		
		//Helmet
		String brand1="Studds";
		String brand2="Vega";
		String brand3="Steelbird";
		String brand4="LS2";
		String brand5="Axor";
		
		String material1="ABS";
		String material2="Ploycarbonate";
		String material3="Fiberglass";
		String material4="Carbon Fiber";
		String material5="Kevlar";
		
		String color1="black";
		String color2="red";
		String color3="blue";
		String color4="white";
		String color5="yellow";
		
		String size1="S";
		String size2="M";
		String size3="L";
		String size4="XL";
		String size5="XXL";
		
		String type1="Full-face";
		String type2="Half-face";
		String type3="Modular";
		String type4="Off-road";
		String type5="Open-face";
		
		Helmet.details(brand1,material1,color1,size1,type1);
		Helmet.details(brand2,material2,color2,size2,type2);
		Helmet.details(brand3,material3,color3,size3,type3);
		Helmet.details(brand4,material4,color4,size4,type4);
		Helmet.details(brand5,material5,color5,size5,type5);
		
		//Wheel
		String brand6="Michelin";
		String brand7="Goodyear";
		String brand8="Bridgestone";
		String brand9="Pirelli";
		String brand10="Continental";
		
		int dia1=14;
		int dia2=16;
		int dia3=18;
		int dia4=20;
		int dia5=22;
		
		float width1=6.5f;
		float width2=7.0f;
		float width3=7.5f;
		float width4=8.0f;
		float width5=8.5f;
		
		String material6="Alloy";
		String material7="Steel";
		String material8="Carbon Fiber";
		String material9="Magnesium";
		String material10="Plastic";
		
		boolean isTubeless1=true;
		boolean isTubeless2=false;
		
		int load1=500;
		int load2=800;
		int load3=1000;
		int load4=1200;
		int load5=1500;
		
		String use1="Car";
		String use2="Bike";
		String use3="Truck";
		String use4="Bicycle";
		String use5="Airplane";
		
		String pattern1="Symmetric";
		String pattern2="Asymmetric";
		String pattern3="Directional";
		String pattern4="Ribbed";
		String pattern5="Block";
		
		float price1=3000.5f;
		float price2=5000.75f;
		float price3=7500.25f;
		float price4=12000.99f;
		float price5=15000.49f;
		
		boolean hasSpokes1=true;
		boolean hasSpokes2=false;
		
		Wheel.info(brand6,dia1,width1,material6,isTubeless1,load1,use1,pattern1,price1,hasSpokes1);
		Wheel.info(brand7,dia2,width2,material7,isTubeless2,load2,use2,pattern2,price2,hasSpokes2);
		Wheel.info(brand8,dia3,width3,material8,isTubeless1,load3,use3,pattern3,price3,hasSpokes1);
		Wheel.info(brand9,dia4,width4,material9,isTubeless2,load4,use4,pattern4,price4,hasSpokes2);
		Wheel.info(brand10,dia5,width5,material10,isTubeless2,load5,use5,pattern5,price5,hasSpokes1);
		
		//Latch
		
		String ltype1="Bolt Latch";
		String ltype2="Cam Latch";
		String ltype3="Hasp Latch";
		String ltype4="Spring Latch";
		String ltype5="Sliding Latch";
				
		int lprice1=200;
		int lprice2=300;
		int lprice3=400;
		int lprice4=500;
		int lprice5=600;
		
		Latch.typesWithPrice(ltype1,lprice1);
		Latch.typesWithPrice(ltype2,lprice2);
		Latch.typesWithPrice(ltype3,lprice3);
		Latch.typesWithPrice(ltype4,lprice4);
		Latch.typesWithPrice(ltype5,lprice5);
		
		//Glass
		String sellerName1="Imagine Glass Designs";
		String sellerName2="Sri Mahalakshmi Glass and Plywood";
		String sellerName3="Trimurthy Glass and Plywood";
		String sellerName4="Bhagyalaxmi Glass and Plywoods";
		String sellerName5="MS Glass Work";
		
		int sellerID1=101;
		int sellerID2=102;
		int sellerID3=103;
		int sellerID4=104;
		int sellerID5=105;
		
		int sellingPrice1=500;
		int sellingPrice2=450;
		int sellingPrice3=470;
		int sellingPrice4=480;
		int sellingPrice5=520;
		
		String loc1="Thindlu Main Road";
		String loc2="Kaggadasapura Main Road";
		String loc3="Avenue Road";
		String loc4="Mysore Road";
		String loc5="Horamavu Agara Main Road";
		
		int pin1=560097;
		int pin2=560093;
		int pin3=560002;
		int pin4=560026;
		int pin5=560043;
		
		Glass.seller(sellerName1,sellerID1,sellingPrice1,loc1,pin1);
		Glass.seller(sellerName2,sellerID2,sellingPrice2,loc2,pin2);
		Glass.seller(sellerName3,sellerID3,sellingPrice3,loc3,pin3);
		Glass.seller(sellerName4,sellerID4,sellingPrice4,loc4,pin4);
		Glass.seller(sellerName5,sellerID5,sellingPrice5,loc5,pin5);
		
		String buyerName1="Vinod";
		String buyerName2="Srikumar";
		String buyerName3="Suresh";
		String buyerName4="Swami";
		String buyerName5="Saahil";
		
		int buyerPhone1=98765432;
		int buyerPhone2=96543219;
		int buyerPhone3=74065088;
		int buyerPhone4=97401269;
		int buyerPhone5=97392577;
		
		int costPrice1=600;
		int costPrice2=550;
		int costPrice3=570;
		int costPrice4=580;
		int costPrice5=620;
		
		Glass.seller(buyerName1,buyerPhone1,costPrice1,loc1,pin1);
		Glass.seller(buyerName2,buyerPhone2,costPrice2,loc2,pin2);
		Glass.seller(buyerName3,buyerPhone3,costPrice3,loc3,pin3);
		Glass.seller(buyerName4,buyerPhone4,costPrice4,loc4,pin4);
		Glass.seller(buyerName5,buyerPhone5,costPrice5,loc5,pin5);
		
		//Gun
		String gunName1 = "AK-47";
		String gunName2 = "Glock 17";
		String gunName3 = "M16";
		String gunName4 = "Desert Eagle";
		String gunName5 = "MP5";
		
		String manufacturer1 = "Kalashnikov Concern";
		String manufacturer2 = "Glock";
		String manufacturer3 = "Colt's Manufacturing";
		String manufacturer4 = "Magnum Research";
		String manufacturer5 = "Heckler & Koch";
		
		int caliber1 = 7;
		int caliber2 = 9;
		int caliber3 = 5;
		int caliber4 = 12;
		int caliber5 = 9;
 		
		String gunType1 = "Assault Rifle";
		String gunType2 = "Pistol";
		String gunType3 = "Assault Rifle";
		String gunType4 = "Pistol";
		String gunType5 = "Submachine Gun";
		
		int magazineCapacity1 = 30;
		int magazineCapacity2 = 17;
		int magazineCapacity3 = 30;
		int magazineCapacity4 = 7;
		int magazineCapacity5 = 30;

		int weight1 = 3900;
		int weight2 = 625;
		int weight3 = 4070;
		int weight4 = 2000;
		int weight5 = 2500;

		int gunPrice1 = 75000;
		int gunPrice2 = 50000;
		int gunPrice3 = 90000;
		int gunPrice4 = 150000;
		int gunPrice5 = 120000;

		boolean isAutomatic1 = true;
		boolean isAutomatic2 = false;
		boolean isAutomatic3 = true;
		boolean isAutomatic4 = false;
		boolean isAutomatic5 = true;
		
		Gun.displayInfo(gunName1, manufacturer1, caliber1, type1, magazineCapacity1, weight1, costPrice1, isAutomatic1);
		Gun.displayInfo(gunName2, manufacturer2, caliber2, type2, magazineCapacity2, weight2, costPrice2, isAutomatic2);
		Gun.displayInfo(gunName3, manufacturer3, caliber3, type3, magazineCapacity3, weight3, costPrice3, isAutomatic3);
		Gun.displayInfo(gunName4, manufacturer4, caliber4, type4, magazineCapacity4, weight4, costPrice4, isAutomatic4);
		Gun.displayInfo(gunName5, manufacturer5, caliber5, type5, magazineCapacity5, weight5, costPrice5, isAutomatic5);

		//Bullet
		String bulletName1 = "7.62×39mm";
		String bulletName2 = "9mm Parabellum";
		String bulletName3 = "5.56×45mm NATO";
		String bulletName4 = ".50 BMG";
		String bulletName5 = ".45 ACP";

		String bulletManufacturer1 = "Kalashnikov Concern";
		String bulletManufacturer2 = "Luger";
		String bulletManufacturer3 = "FN Herstal";
		String bulletManufacturer4 = "Winchester";
		String bulletManufacturer5 = "Colt";

		int bulletCaliber1 = 7;
		int bulletCaliber2 = 9;
		int bulletCaliber3 = 5;
		int bulletCaliber4 = 12;
		int bulletCaliber5 = 11;

		String bulletType1 = "Rifle";
		String bulletType2 = "Pistol";
		String bulletType3 = "Rifle";
		String bulletType4 = "Sniper";
		String bulletType5 = "Pistol";

		int bulletCost1 = 50;
		int bulletCost2 = 30;
		int bulletCost3 = 60;
		int bulletCost4 = 300;
		int bulletCost5 = 40;
		
		Bullet.displayInfo(bulletName1, bulletManufacturer1, bulletCaliber1, bulletType1, bulletCost1);
		Bullet.displayInfo(bulletName2, bulletManufacturer2, bulletCaliber2, bulletType2, bulletCost2);
		Bullet.displayInfo(bulletName3, bulletManufacturer3, bulletCaliber3, bulletType3, bulletCost3);
		Bullet.displayInfo(bulletName4, bulletManufacturer4, bulletCaliber4, bulletType4, bulletCost4);
		Bullet.displayInfo(bulletName5, bulletManufacturer5, bulletCaliber5, bulletType5, bulletCost5);

		//Engine
		Engine.displayInfo("V8 Twin Turbo", "Ferrari", "Petrol",710, 770, 3902, 8,"Petrol", 9.6f, 7.5f,280, 8000, "Liquid-cooled", "Spark Ignition",true, "Automatic", "Euro 6",32, 86.5f, 82.7f, "Aluminum", 8.0f, "Electric", "Direct Injection", 1500000);

		//Tile
		// Tile 1
		String tileName1 = "Classic White";
		String tileMaterial1 = "Ceramic";
		String tileSize1 = "60x60";
		String tileFinish1 = "Glossy";
		int tileCost1 = 50;

		// Tile 2
		String tileName2 = "Granite Black";
		String tileMaterial2 = "Granite";
		String tileSize2 = "80x80";
		String tileFinish2 = "Matte";
		int tileCost2 = 90;

		// Tile 3
		String tileName3 = "Wooden Texture";
		String tileMaterial3 = "Porcelain";
		String tileSize3 = "120x20";
		String tileFinish3 = "Textured";
		int tileCost3 = 75;

		// Tile 4
		String tileName4 = "Italian Marble";
		String tileMaterial4 = "Marble";
		String tileSize4 = "100x100";
		String tileFinish4 = "Glossy";
		int tileCost4 = 200;

		// Tile 5
		String tileName5 = "Rustic Brown";
		String tileMaterial5 = "Terracotta";
		String tileSize5 = "40x40";
		String tileFinish5 = "Matte";
		int tileCost5 = 60;

		Tile.details(tileName1, tileMaterial1, tileSize1, tileFinish1, tileCost1);
		Tile.details(tileName2, tileMaterial2, tileSize2, tileFinish2, tileCost2);
		Tile.details(tileName3, tileMaterial3, tileSize3, tileFinish3, tileCost3);
		Tile.details(tileName4, tileMaterial4, tileSize4, tileFinish4, tileCost4);
		Tile.details(tileName5, tileMaterial5, tileSize5, tileFinish5, tileCost5);
		
		//Bomb
		// Bomb 1
		String bombName1 = "C4";
		String explosiveType1 = "RDX";
		int blastRadius1 = 10;
		String detonationMethod1 = "Remote";
		float bweight1 = 1.2f;
		String fuseType1 = "Electrical";
		int activationTime1 = 5;
		String originCountry1 = "USA";
		int shockwaveSpeed1 = 8000;
		float destructivePower1 = 0.25f;

		// Bomb 2
		String bombName2 = "Atomic Bomb";
		String explosiveType2 = "Uranium-235";
		int blastRadius2 = 15000;
		String detonationMethod2 = "Impact";
		float bweight2 = 4000.0f;
		String fuseType2 = "Nuclear Chain Reaction";
		int activationTime2 = 60;
		String originCountry2 = "USA";
		int shockwaveSpeed2 = 35000;
		float destructivePower2 = 15000.0f;

		// Bomb 3
		String bombName3 = "Thermobaric Bomb";
		String explosiveType3 = "Fuel-Air Mixture";
		int blastRadius3 = 500;
		String detonationMethod3 = "Airburst";
		float bweight3 = 750.0f;
		String fuseType3 = "Barometric";
		int activationTime3 = 10;
		String originCountry3 = "Russia";
		int shockwaveSpeed3 = 11000;
		float destructivePower3 = 44.0f;

		// Bomb 4
		String bombName4 = "ANFO Bomb";
		String explosiveType4 = "Ammonium Nitrate/Fuel Oil";
		int blastRadius4 = 100;
		String detonationMethod4 = "Timer";
		float bweight4 = 50.0f;
		String fuseType4 = "Chemical";
		int activationTime4 = 30;
		String originCountry4 = "Various";
		int shockwaveSpeed4 = 6000;
		float destructivePower4 = 2.5f;

		// Bomb 5
		String bombName5 = "MOAB (Mother of All Bombs)";
		String explosiveType5 = "H-6";
		int blastRadius5 = 1400;
		String detonationMethod5 = "Airburst";
		float bweight5 = 9800.0f;
		String fuseType5 = "GPS Guided";
		int activationTime5 = 0;
		String originCountry5 = "USA";
		int shockwaveSpeed5 = 10000;
		float destructivePower5 = 11.0f;

		Bomb.details(bombName1, explosiveType1, blastRadius1, detonationMethod1, bweight1, fuseType1, activationTime1, originCountry1, shockwaveSpeed1, destructivePower1);
		Bomb.details(bombName2, explosiveType2, blastRadius2, detonationMethod2, bweight2, fuseType2, activationTime2, originCountry2, shockwaveSpeed2, destructivePower2);
		Bomb.details(bombName3, explosiveType3, blastRadius3, detonationMethod3, bweight3, fuseType3, activationTime3, originCountry3, shockwaveSpeed3, destructivePower3);
		Bomb.details(bombName4, explosiveType4, blastRadius4, detonationMethod4, bweight4, fuseType4, activationTime4, originCountry4, shockwaveSpeed4, destructivePower4);
		Bomb.details(bombName5, explosiveType5, blastRadius5, detonationMethod5, bweight5, fuseType5, activationTime5, originCountry5, shockwaveSpeed5, destructivePower5);
 
		//Key
		String[] keyTypes={"House Key","Car Key","Master Key","Room Key","Cabinet Key"};
		String[] keyMaterials={"Brass","Steel","Aluminium","Iron","Nickel"};
		int[] keyLengths={70,65,60,55,50};
		
		for(int key=0;key<5;key++){
			Key.details(keyTypes[key],keyMaterials[key],keyLengths[key]);
			System.out.println("\n");
		}
	}
}