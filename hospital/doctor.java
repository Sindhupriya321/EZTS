package hospital;

public class doctor extends Person {
	private String Speciality;

	public doctor(String name, int age, String gender, String speciality) {
		super(name, age, gender);
		Speciality = speciality;
	}

	@Override
	public String toString() {
		return "doctor [Speciality=" + Speciality + ", toString()=" + super.toString() + "]";
	}
	
	void doctorout() {
		super.Personout();
		System.out.println("Speciality = Dermatology");
	
	}
}
	

	
