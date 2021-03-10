package stret;
//import postavy.Energia;
//import postavy.Obor;
//import postavy.Rytier;
//import postavy.StatocnyRytier;
//import postavy.ZlyObor;
import postavy.*;

public class Stret {
	static void stret(Obor obor, Rytier rytier) {
		rytier.utoc(obor);
	}

	static int zistiRozdielEnergii(Energia bytost1, Energia bytost2) {
		return bytost1.zistiEnergiu() - bytost2.zistiEnergiu();
	}
	
	public static void main(String[] args) {
		Obor[] o = new Obor[100];
		Rytier[] r = new Rytier[100];

		//Uloha 1
		Energia premenna = new ZlyObor();
		Rytier zjedeny = new Rytier(100);

		System.out.println("Energia pred zjedenim " + zjedeny.zistiEnergiu());
		((ZlyObor)premenna).zjedz(zjedeny);   //cast needed
		System.out.println("Energia po zjedeni: " + zjedeny.zistiEnergiu());

		for (int i = 0; i < 20; i++) {
			r[i] = new StatocnyRytier(140, new SvetelnyMec(i));
			o[i] = new ZlyObor();
			o[i].nastav(50, true);
		}

		for (int i = 20; i < 40; i++) {
			r[i] = new Rytier(140, new OcelovyMec(i));
			o[i] = new ZlyObor();
			o[i].nastavEnergiu(50);
		}
	/*
	* Uloha 2, pridala som novy mec, ale v rytieroch nebolo treba nic menit;
	* po pridani noveho rytiera bolo treba doplnit k mecoch  metodu pre daneho rytiera
	* */

		for (int i = 40; i < 60; i++) {
			r[i] = new Rytier(140, new ZlatyMec(i));
			o[i] = new Obor();
			o[i].nastavEnergiu(50);
		}

		for (int i = 60; i < 80; i++){
			r[i] = new SmutnyRytier(100, new SvetelnyMec(i));
			o[i] = new ZlyObor();
			o[i].nastavEnergiu(45);
		}

		for (int i = 80; i < 100; i++){
			r[i] = new SmutnyRytier(90, new ZlatyMec(i));
			o[i] = new Obor();
			o[i].nastavEnergiu(60);
		}
		
		for (int i = 0; i < 100; i++) {
			stret(o[i], r[i]);
			System.out.println(i + ":" + "rytier " + r[i].zistiEnergiu() +
					" / " + "obor " + o[i].zistiEnergiu() + " mec: " + r[i].ukazMec());
		}

		//o[57].zjedz(r[57]); // metoda zjedz() nie je v rozhrani triedy Obor!		

		// metodu zistiRozdielEnergii() mozeme uplatnit na akekolvek dve bytosti, ktore implementuju rozhranie Energia
		//System.out.println(zistiRozdielEnergii(o[11], r[11]));
		//System.out.println(zistiRozdielEnergii(r[10], o[0]));
		//System.out.println(zistiRozdielEnergii(r[2], r[1]));
	}
}
