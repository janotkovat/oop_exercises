package postavy;

public class OcelovyMec extends Mec {
	public OcelovyMec(int vyrobneCislo) {
		super(vyrobneCislo);
	}

//	public void udriRytier(postavy.Obor obor, postavy.Rytier rytier) {
	public void udri(Obor obor, Rytier rytier) {
		if (rytier.zistiEnergiu() >= obor.zistiEnergiu())
			obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("r-om");
	}
//	public void udriStatocnyRytier(postavy.Obor obor, postavy.StatocnyRytier rytier) {
	public void udri(Obor obor, StatocnyRytier rytier) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-om");
	}

	@Override
	public void udri(Obor obor, SmutnyRytier rytier) {
		obor.nastavEnergiu(obor.zistiEnergiu() - 10);
		System.out.println(":( rytier-om");
	}
}
