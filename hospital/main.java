package hospital;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person hospital = new Person("Sindhu",21,"female");
		
		System.out.println(hospital.toString());
		
		hospital.Personout();
		
		doctor d = new doctor("vinni",23,"female","Dermatology");
		
		System.out.println(d.toString());
		
		d.doctorout();
		
		patient p = new patient("Arun",20,"male","Dermatology","Cholera",25);
		
		System.out.println(p.toString());
		
		p.patientout();
		
		nurse n = new nurse("rajesh",22,"male","Dermatology","Cholera",25,12,4);
		
		System.out.println(n.toString());
		
		n.nurseout();
	}

}
