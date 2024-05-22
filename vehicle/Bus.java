package vehicle;

public class Bus{
	private int Model;
	private int Engine;
	private String Color;
	
	public Bus(int model, int engine, String color) {
		Model = model;
		Engine = engine;
		Color = color;
	}

	@Override
	public String toString() {
		return "Bus [Model=" + Model + ", Engine=" + Engine + ", Color=" + Color + "]";
	}
	
	void Busout()
	{
		System.out.println("Model = " + Model);
		System.out.println("Engine = " + Engine);
		System.out.println("Color = " + Color);
	}
}



