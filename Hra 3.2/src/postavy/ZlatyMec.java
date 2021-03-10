package postavy;

public class ZlatyMec extends Mec{
    public ZlatyMec(int vyrobneCislo) {
        super(vyrobneCislo);
    }

    @Override
    public void udri(Obor obor, Rytier rytier) {
        if (rytier.zistiEnergiu() >= obor.zistiEnergiu())
            obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
        System.out.println("r-zlatym_mecom");
    }

    @Override
    public void udri(Obor obor, StatocnyRytier rytier) {
        obor.nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
        System.out.println("sr-zlatym_mecom");
    }

    @Override
    public void udri(Obor obor, SmutnyRytier rytier) {
        obor.nastavEnergiu(obor.zistiEnergiu() - 20);
        System.out.println(":( rytier- zlaty mec");
    }
}
