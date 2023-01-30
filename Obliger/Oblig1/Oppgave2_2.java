class Oppgave2_2 {
	public static void main(String[] args) {
		final byte WEIGHT_IN_KG = 63;
		final float GRAVITY_ON_MOON = 0.17f;
		float weightOnMoon = WEIGHT_IN_KG * GRAVITY_ON_MOON;
		System.out.println("Din vekt på månen er " + weightOnMoon + " kg.");
	}
}