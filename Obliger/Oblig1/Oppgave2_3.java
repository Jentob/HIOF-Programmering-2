 public class Oppgave2_3 {
	public static void main(String[] args) {
		Planet planet1 = new Planet("Mars", 3889, 6.39E23);
		planet1.printFacts();
		System.out.println(planet1.getRadius());
		planet1.setRadius(2340);
		System.out.println(planet1.getRadius());
	}
}