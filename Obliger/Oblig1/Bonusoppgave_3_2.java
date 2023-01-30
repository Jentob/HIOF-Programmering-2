import java.util.Scanner;
import java.util.ArrayList;

class Bonusoppgave_3_2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		double radius;
		double mass;
		
		ArrayList<Planet> planets = new ArrayList<Planet>();
		
		int i = 0;
		boolean b = true;
		
		while(b) {
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
					break;
				}
				catch(Exception e) {
					input.nextLine();
					continue;
				}
			}
			
			planets.add(new Planet(name, radius, mass));
			
			System.out.println();
			System.out.println(planets.get(i).getName() + " med en radius på "+ planets.get(i).getRadius()
				+ " km og en masse på " + planets.get(i).getMass() + " kg har blitt lagt til på index " + i + ".");
			System.out.println();
			
			i++;			
			
			while(true) {
				try {
					System.out.println("Vil du legge til en til planet? (y/n)");
					String q = input.nextLine().toLowerCase();
					if (q.equals("y")) {
						System.out.println();
						break;
					}
					if (q.equals("n")) {
						b = false;
						break;
					}
				}
				catch(Exception e) {
					input.nextLine();
					continue;
				}
			}
		}
	}
}