package hospital;

public class patient extends doctor {
	private String Disease;
	private int Bedno;
	
	public patient(String name, int age, String gender, String speciality, String disease, int bedno) {
		super(name, age, gender, speciality);
		Disease = disease;
		Bedno = bedno;
	}

	@Override
	public String toString() {
		return "patient [Disease=" + Disease + ", Bedno=" + Bedno + ", toString()=" + super.toString() + "]";
	}

	void patientout() {
		super.doctorout();
		System.out.println("Disease = Cholera");
		System.out.println("Bedno = 25");
	}
	
}
	