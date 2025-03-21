class ContactSearchRunner{
	public static void main(String... values){
		System.out.println(ContactSearch.getMobileByEmail("nagesh@gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("john.doe@gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("emily.smith@yahoo.com"));
		System.out.println(ContactSearch.getMobileByEmail("robert.johnson@outlook.com"));
		System.out.println(ContactSearch.getMobileByEmail("sophia.williams@icloud.com"));
		System.out.println(ContactSearch.getMobileByEmail("michael.brown@aol.com"));
		System.out.println(ContactSearch.getMobileByEmail("olivia.jones@protonmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("david.miller@hotmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("ava.davis@gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("james.wilson@yahoo.com"));
		System.out.println(ContactSearch.getMobileByEmail("charlotte.anderson@rediffmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("benjamin.taylor@live.com"));
		System.out.println(ContactSearch.getMobileByEmail("william.thomas@mail.com"));
		System.out.println(ContactSearch.getMobileByEmail("mia.jackson@customdomain.com"));
		System.out.println(ContactSearch.getMobileByEmail("ethan.white@company.com"));
		
		
		System.out.println(ContactSearch.getEmailByName("nagesh"));
		System.out.println(ContactSearch.getEmailByName("john"));
		System.out.println(ContactSearch.getEmailByName("emily"));
		System.out.println(ContactSearch.getEmailByName("robert"));
		System.out.println(ContactSearch.getEmailByName("sophia"));
		System.out.println(ContactSearch.getEmailByName("michael"));
		System.out.println(ContactSearch.getEmailByName("olivia"));
		System.out.println(ContactSearch.getEmailByName("david"));
		System.out.println(ContactSearch.getEmailByName("ava"));
		System.out.println(ContactSearch.getEmailByName("james"));
		System.out.println(ContactSearch.getEmailByName("charlotte"));
		System.out.println(ContactSearch.getEmailByName("benjamin"));
		System.out.println(ContactSearch.getEmailByName("william"));
		System.out.println(ContactSearch.getEmailByName("mia"));
		System.out.println(ContactSearch.getEmailByName("ethan"));
		
		
		
		String[] array = ContactSearch.searchByLastName("kapoor");
		for(String arr: array){
			System.out.println(arr);
		}
		array = ContactSearch.searchByLastName("shetty");
		for(String arr: array){
			System.out.println(arr);
		}
		array = ContactSearch.searchByLastName("sharma");
		for(String arr: array){
			System.out.println(arr);
		}
	}
}	