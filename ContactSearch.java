class ContactSearch{
	public static long getMobileByEmail(String email){
		long number = 6360860539l;
		if(email == "nagesh@gmail.com"){
			return number;
		}
		else if(email == "john.doe@gmail.com"){
			number = 9876543210L;
			return number;
		}
		else if(email == "emily.smith@yahoo.com"){
			number = 8765432109L;
			return number;
		}
		else if(email == "robert.johnson@outlook.com"){
			number = 7654321098L;
			return number;
		}
		else if(email == "sophia.williams@icloud.com"){
			number = 9543210786L;
			return number;
		}
		else if(email == "michael.brown@aol.com"){
			number = 8432109876L;
			return number;
		}
		else if(email == "olivia.jones@protonmail.com"){
			number = 7321098765L;
			return number;
		}
		else if(email == "david.miller@hotmail.com"){
			number = 6210987654L;
			return number;
		}
		else if(email == "ava.davis@gmail.com"){
			number = 5109876543L;
			return number;
		}
		else if(email == "james.wilson@yahoo.com"){
			number = 4098765432L;
			return number;
		}
		else if(email == "charlotte.anderson@rediffmail.com"){
			number = 3987654321L;
			return number;
		}
		else if(email == "benjamin.taylor@live.com"){
			number = 2876543210L;
			return number;
		}
		else if(email == "william.thomas@mail.com"){
			number = 1765432109L;
			return number;
		}
		else if(email == "mia.jackson@customdomain.com"){
			number = 9654321078L;
			return number;
		}
		else if(email == "ethan.white@company.com"){
			number = 8543210987L;
			return number;
		}
		else{	
			System.out.println("Match not found");
			return 0;
		}
	}
	
	public static String getEmailByName(String name){
		String email = "nagesh@gmail.com";
		if(name == "nagesh"){
			return email;
		}
		else if(name == "john"){
			email = "john.doe@gmail.com";
			return email;
		}
		else if(name == "emily"){
			email = "emily.smith@yahoo.com";
			return email;
		}
		else if(name == "robert"){
			email = "robert.johnson@outlook.com";
			return email;
		}
		else if(name == "sophia"){
			email = "sophia.williams@icloud.com";
			return email;
		}
		else if(name == "michael"){
			email = "michael.brown@aol.com";
			return email;
		}
		else if(name == "olivia"){
			email = "olivia.jones@protonmail.com";
			return email;
		}
		else if(name == "david"){
			email = "david.miller@hotmail.com";
			return email;
		}
		else if(name == "ava"){
			email = "ava.davis@gmail.com";
			return email;
		}
		else if(name == "james"){
			email = "james.wilson@yahoo.com";
			return email;
		}
		else if(name == "charlotte"){
			email = "charlotte.anderson@rediffmail.com";
			return email;
		}
		else if(name == "benjamin"){
			email = "benjamin.taylor@live.com";
			return email;
		}
		else if(name == "william"){
			email = "william.thomas@mail.com";
			return email;
		}
		else if(name == "mia"){
			email = "mia.jackson@customdomain.com";
			return email;
		}
		else if(name == "ethan"){
			email = "ethan.white@company.com";
			return email;
		}
		else{
			System.out.println("Match not found");
			return null;
		}
	} 
	
	public static String[] searchByLastName(String name){
		String[] names1 = {"kareena kapoor", "aishwarya kapoor","salman kapoor","soniya kapoor","agarwal kapoor","Ranveer khan"};
		String[] names2 = {"kareena shetty", "aishwarya shetty","salman khan","soniya shetty","agarwal shetty","Ranveer shetty"};
		String[] names3 = {"kareena sharma", "aishwarya sharma","salman sharma","soniya shetty","agarwal sharma","Ranveer sharma"};
		
		if(name == "kapoor"){
			return names1;
		}
		else if(name == "shetty"){
			return names2;
		}
		else if(name == "sharma"){
			return names3;
		}
		else{
			System.out.println("Match not found");
			return null;
		}
	}
}




















