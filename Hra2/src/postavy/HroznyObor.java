package postavy;

public class HroznyObor extends ZlyObor{

    public HroznyObor(int energia, boolean hladny) {
        super(energia, hladny);
    }

    @Override
    void zjedz(Rytier rytier) {
        super.zjedz(rytier);
        zarev();
    }

    void zarev(){
        System.out.println("BUBUBU");
    }
}
