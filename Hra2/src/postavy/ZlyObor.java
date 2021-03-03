package postavy;

public class ZlyObor extends Obor {
    boolean hladny; // pozor na skryvanie atributov!

    public ZlyObor(int energia, boolean hladny){
        //kedze som chcela, aby sa vykonavala metoda zjedz v strete,
        //do konstruktora som pridala aj atribut hladny
        super(energia);
        this.nastavEnergiu(energia);
        this.hladny = hladny;
    }
    void odveta(Rytier rytier) {
        if (hladny)
            zjedz(rytier);
    }
    void zjedz(Rytier rytier) {
        rytier.nastavEnergiu(0);
    }
}
