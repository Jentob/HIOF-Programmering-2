import java.util.Scanner;
import java.util.HashMap;

class Bonusoppgave_3_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		double radius;
		double mass;
		
		HashMap<String, Planet> planets = new HashMap<String, Planet>();
		
		boolean b = true;
		int q;
		
		while(b) {
			while(true) {
				try {
					System.out.print("Skriv inn navn på planeten: ");
					name = input.nextLine();
					break;
				}
				catch(Exception e) {
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
					continue;
				}
			}
			
			planets.put(name, new Planet(name, radius, mass));
			
			System.out.println();
			System.out.println(planets.get(name).getName() + " med en radius på "+ planets.get(name).getRadius()
				+ " km og en masse på " + planets.get(name).getMass() + " kg har blitt lagt til.");
			System.out.println();			
			outer:
			while(true) {
				try {
					System.out.println("Hva vil du gjøre nå?"
						+ "\n1 - Legge til en ny planet"
						+ "\n2 - Endre info på en planet"
						+ "\n3 - Slette en planet"
						+ "\n4 - Liste ut planetene"
						+ "\n5 - Avslutte programmet");
					q = input.nextInt();
					input.nextLine();
					System.out.println();
					switch(q) {
						case 1:
							break outer;
						case 2:
							while(true) {
								try {
									System.out.print("Skriv inn navnet på planet du ønsker å endre: ");
									name = input.nextLine();
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
									System.out.println();
									System.out.println(name + "har nå en radius på " + radius + "km og en masse på " + mass + "km.");
									planets.get(name).setRadius(radius);
									planets.get(name).setMass(mass);
									System.out.println();
									break;
								}
								catch(Exception e) {
									continue;
								}
							}	
							break;
						case 3:
							while(true) {
								try {
									System.out.print("Skriv inn navnet på planet du ønsker å slette: ");
									name = input.nextLine();
									planets.remove(name);
									System.out.println();
									break;
								}
								catch(Exception e) {
									continue;
								}
							}
							break;
						case 4:
							for (String key: planets.keySet()){
								System.out.println(key + " har en radius på " + planets.get(key).getRadius()
									+ "km og en masse på " + planets.get(key).getMass() + " kg.");
							}
							System.out.println();
							break;
						case 5:
							b = false;
							break outer;
						default:
							continue;
					}
				}
				catch(Exception e) {
					continue;
				}
			}
		}
	}
}