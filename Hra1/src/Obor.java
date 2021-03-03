public class Obor {
	boolean hladny;
	int energia;
	double random_number;

	void odveta(Rytier rytier) {
		if (energia > rytier.energia) {
			random_number = Math.random();	//generuje nahodne cislo
			System.out.println("random number: " + random_number);
			rytier.energia = (int) (random_number * rytier.energia);
		}
	}
}
