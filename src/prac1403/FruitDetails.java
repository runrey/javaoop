package prac1403;

public class FruitDetails{
	private String name = "";
	private double price = 0.0;
	private String color = "";
	
	public FruitDetails(String n, double p, String c) {
		name = n;
		price = p;
		color = c;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public void setName(String n) {
		name = n;
	}
	public void setPrice(double e) {
		price = e;
	}
	public void setColor(String e) {
		color = e;
	}	
}