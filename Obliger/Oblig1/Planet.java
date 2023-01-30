public class Planet {
	private String name;
	private double radius;
	private double mass;
	
	public Planet(String name, double radiusInKm, double massInKm) {
		this.name = name;
		this.radius = radiusInKm;
		this.mass = massInKm;
	}
	public void printFacts() {
		System.out.println("Planeten " + name + " har en radius på " + radius + " km og en masse på " + mass + " kg");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public String getName() {
		return name;
	}
	public double getRadius() {
		return radius;
	}
	public double getMass() {
		return mass;
	}
}
