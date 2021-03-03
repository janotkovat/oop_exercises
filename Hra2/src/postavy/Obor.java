package postavy;

public class Obor implements Energia {
    private boolean hladny;
    private float energia;

    public Obor(int energia) {
        nastavEnergiu(energia);
    }

    public void nastavEnergiu(int energia) {    //setter, pouzijem ho na pristup ku private atributu
        this.energia = energia;
    }
    public void zvysEnergiu(int energia) {
        this.energia += energia;
    }
    public void znizEnergiu(int energia) {
        this.energia -= energia;
    }
    public int zistiEnergiu() { //getter pre energiu
        return (int) energia;   //pretypujem danu hodnotu v getteri,
        //aby zvysok pracoval s nou ako int, pricom vnutorne je reprezentovana ako float
    }

    void nastav(boolean hladny) {
        this.hladny = hladny;
    }

    void nastav(int energia, boolean hladny) {
        nastavEnergiu(energia);
        this.hladny = hladny;
    }

    void odveta(Rytier rytier) {
        if (zistiEnergiu() > rytier.zistiEnergiu())
//			rytier.energia = (int) (0.9 * rytier.energia);
            // k energii sa uz neda pristupit priamo, lebo je private
            rytier.nastavEnergiu((int) (0.9 * rytier.zistiEnergiu()));
    }
}

