package postavy;

public class StatocnyRytier extends Rytier {

	public StatocnyRytier(int energia) {
		super(energia);
	}
	public StatocnyRytier(int energia, Mec mec) {
		super(energia, mec);
	}
	public StatocnyRytier() {
	}
/*
 	// udriSvetelnymMecomStatocyRytier() 
	public void udriSvetelnymMecom(postavy.Obor obor) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-sm");
	}
 	// udriOcelovymMecomStatocyRytier() 
	public void udriOcelovymMecom(postavy.Obor obor) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-om");
	}
*/
	public void utoc(Obor obor) {
//		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
/*	
		if (mec instanceof postavy.SvetelnyMec) {
			udriSvetelnymMecom(obor);
		} else if (mec instanceof postavy.OcelovyMec) {
			udriOcelovymMecom(obor);
		} else {
		}
*/
//		mec.udriStatocnyRytier(obor, this);
		mec.udri(obor, this);

		obor.odveta(this);
	}
}
