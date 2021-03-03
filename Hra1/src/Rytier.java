public class Rytier {
	int energia;
	double nahodne = Math.random();

	void utok(Obor obor) {
		System.out.println("nahodne cislo: " + nahodne);
		obor.energia = (int) (nahodne * obor.energia); // (int) len pretypuje float vysledok na int
		obor.odveta(this);
		System.out.println("Referencia aktualneho objektu: " + this);
		// this je referencia na aktualny objekt, vytvaram kazdy raz novy objekt
	}
}
