package postavy;

public class SvetelnyMec extends Mec {
	public SvetelnyMec(int vyrobneCislo) {
		super(vyrobneCislo);
	}

//	public void udriRytier(postavy.Obor obor, postavy.Rytier rytier) {
	public void udri(Obor obor, Rytier rytier) {
		if (rytier.zistiEnergiu() >= obor.zistiEnergiu())
			obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("r-sm");
	}
//	public void udriStatocnyRytier(postavy.Obor obor, postavy.StatocnyRytier rytier) {
	public void udri(Obor obor, StatocnyRytier rytier) {
		obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		System.out.println("sr-sm");
	}
	@Override
	public void udri(Obor obor, SmutnyRytier rytier) {
		obor.nastavEnergiu(obor.zistiEnergiu() - 15);
		System.out.println(":( rytier- svetelny mec");
	}
}
