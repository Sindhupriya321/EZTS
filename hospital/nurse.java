package hospital;

public class nurse extends patient {
	private int Roomno;
	private int Floor;
	
	public nurse(String name, int age, String gender, String speciality, String disease, int bedno, int roomno,
			int floor) {
		super(name, age, gender, speciality, disease, bedno);
		Roomno = roomno;
		Floor = floor;
	}

	@Override
	public String toString() {
		return "nurse [Roomno=" + Roomno + ", Floor=" + Floor + ", toString()=" + super.toString() + "]";
	}
	void nurseout() {
		super.patientout();
		System.out.println("Roomno = 12");
		System.out.println("Floor = 4");
	}

}
