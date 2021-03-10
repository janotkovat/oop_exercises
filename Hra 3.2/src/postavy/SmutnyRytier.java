package postavy;

public class SmutnyRytier extends Rytier{
    public SmutnyRytier(int energia, Mec mec) {
        super(energia, mec);
    }

    @Override
    public void utoc(Obor obor) {
        mec.udri(obor, this);
        obor.odveta(this);
    }
}
