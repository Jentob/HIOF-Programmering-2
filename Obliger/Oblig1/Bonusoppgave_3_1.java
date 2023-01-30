import java.util.Scanner;

class Bonusoppgave_3_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		double radius;
		double mass;
		
		while(true) {
			try {
				System.out.print("Skriv inn navn på planeten: ");
				name = input.nextLine();
				break;
			}
			catch(Exception e) {
				input.nextLine();
				continue;
			}
		}	
		while(true) {
			try {
				System.out.print("Skriv inn radius til planeten: ");
				radius = Double.parseDouble(input.nextLine());
				break;
			}
			catch(Exception e) {
				input.nextLine();
				continue;
			}
		}
		while(true) {
			try {
				System.out.print("Skriv inn massen til planeten: ");
				mass = Double.parseDouble(input.nextLine());
				input.nextLine();
				break;
			}
			catch(Exception e) {
				input.nextLine();
				continue;
			}
		}
		
		Planet planet1 = new Planet(name, radius, mass);
		
		System.out.println();
		System.out.println(planet1.getName() + " har en radius på " + planet1.getRadius() + " km og en masse på " + planet1.getMass() + " kg.");
	}
}