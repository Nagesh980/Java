class PatientRunner{
	public static void main(String... args){
		Patient patient = new Patient();
		System.out.println("medical_condition = "+patient.medical_condition);
		System.out.println("age = "+patient.age);
		System.out.println("response_to_treatment = "+patient.response_to_treatment);
		System.out.println("Heart_rate = "+patient.heart_rate);
		
		patient.medical_condition = "Diabetes";
		patient.age = 45;
		patient.response_to_treatment = "Slow";
		patient.heart_rate = 72;
		
		System.out.println("---Updated values---");
		System.out.println("medical_condition = "+patient.medical_condition);
		System.out.println("age = "+patient.age);
		System.out.println("response_to_treatment = "+patient.response_to_treatment);
		System.out.println("Heart_rate = "+patient.heart_rate);

	}
}