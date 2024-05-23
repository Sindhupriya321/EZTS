package hospital;

public class Person {
	private String Name;
	private int Age;
	private String Gender;
	
	public Person(String name, int age, String gender) {
		Name = name;
		Age = age;
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + "]";
	}
	
	void Personout()
	{
		System.out.println("Name = " + Name);
		System.out.println("Age = " + Age);
		System.out.println("Gender = " + Gender);
	}
		
}

