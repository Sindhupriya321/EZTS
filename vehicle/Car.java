package vehicle;

public class Car {
	private int Model;
	private int Engine;
	private String Color;
	
	public Car(int model, int engine, String color) {
		Model = model;
		Engine = engine;
		Color = color;
	}

	@Override
	public String toString() {
		return "Car [Model=" + Model + ", Engine=" + Engine + ", Color=" + Color + "]";
	}
	
	void Carout()
	{
		System.out.println("Model = " + Model);
		System.out.println("Engine = " + Engine);
		System.out.println("Color = " + Color);
	}
	
}
	

