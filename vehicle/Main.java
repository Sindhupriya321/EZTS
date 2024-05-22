package vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Master vehicle = new Master(2010,999,"red");
		
		System.out.println(vehicle.toString());
		
		vehicle.Masterout();
		
		
		Bike b = new Bike(2010,99,"blue","sports");
		
		System.out.println(b.toString());
		
		b.Bikeout();
		
		Car c = new Car(2011,89,"white");
		
		System.out.println(c.toString());
		
		c.Carout();
		
		Bus B = new Bus(2005,567,"yellow");
		
		System.out.println(B.toString());
		
		B.Busout();
}
}
