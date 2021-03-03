package stret;

import postavy.*;

public class Stret {
    static void stret(Obor obor, Rytier rytier) {
        rytier.utok(obor);
    }

    // aj obor, aj rytier su bytosti, ktore disponuju energiou
    // rozhranie umozni jednotny pristup
    // potom mozeme definovat metodu, ktora zisti rozdiel energii akychkolvek dvoch bytosti

    static int zistiRozdielEnergii(Energia bytost1, Energia bytost2) {
        return bytost1.zistiEnergiu() - bytost2.zistiEnergiu();
    }

    static int zratajEnergiu(Energia... e){
        int suma = 0;
        for (int i = 0; i < e.length; i++){
            suma += e[i].zistiEnergiu();
        }
        return suma;
    }

    public static void main(String[] args) {
        Obor[] o = new Obor[120];
        Rytier[] r = new Rytier[120];

        // toto je len inicializacia poli obrov a rytierov tak, aby sa prejavili rozne kombinacie
        for (int i = 0; i < 20; i++) {
            r[i] = new StatocnyRytier(140, new Mec(i));
            o[i] = new ZlyObor(50, true);
        }

        for (int i = 20; i < 40; i++) {
            r[i] = new Rytier(50, new Mec(i));
            o[i] = new ZlyObor(40, false);
        }

        for (int i = 40; i < 100; i++) {
            r[i] = new Rytier(50, new Mec(i));
            o[i] = new Obor(60);
        }

        for (int i = 100; i < 120; i++) {
            r[i] = new Rytier(70, new Mec(i));
            o[i] = new HroznyObor(40, true);
        }

        for (int i = 0; i < 120; i++) {
            stret(o[i], r[i]);
            System.out.println(i + ":" + "rytier " + r[i].zistiEnergiu() +
                    " / " + "obor " + o[i].zistiEnergiu() + " mec: " + r[i].ukazMec());
        }

        System.out.println("postavy.Energia vsetkych rytierov: " + zratajEnergiu(r));
        System.out.println("postavy.Energia vsetkych obrov: " + zratajEnergiu(o));
    }
}
