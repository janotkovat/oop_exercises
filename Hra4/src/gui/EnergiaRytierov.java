package gui;

import javafx.scene.control.*;
import stret.SledovatelStretu;
import stret.Stret;

public class EnergiaRytierov extends TextField implements SledovatelStretu{
    private Stret stret;
    private int energiaRytier;

    public EnergiaRytierov(Stret stret) {
        super();
        this.stret = stret;
    }

    public void upovedom() {
        energiaRytier = 0;

        for (int i = 0; i < stret.zistiPocetBojovnikov(); ++i)
            energiaRytier += stret.zistiRytiera(i).zistiEnergiu();

        setText(Integer.toString(energiaRytier));
    }
}
