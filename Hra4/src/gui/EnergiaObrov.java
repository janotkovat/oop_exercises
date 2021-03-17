package gui;

import javafx.scene.control.*;
import stret.SledovatelStretu;
import stret.Stret;

public class EnergiaObrov extends TextField implements SledovatelStretu {
    private Stret stret;
    private int energiaObor;

    public EnergiaObrov(Stret stret) {
        super();
        this.stret = stret;
    }
    @Override
    public void upovedom() {
        energiaObor = 0;

        for (int i = 0; i < stret.zistiPocetBojovnikov(); i++)
            energiaObor += stret.zistiObra(i).zistiEnergiu();

        setText(Integer.toString(energiaObor));
    }
}
