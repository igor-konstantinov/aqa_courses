package engines;

import enums.GasolineType;
import interfaces.IEngine;

public class GasolineEngine implements IEngine {
    private GasolineType gasolineType;

    public GasolineType getGasolineType() {
        return gasolineType;
    }

    public void setGasolineType(GasolineType gasolineType) {
        this.gasolineType = gasolineType;
    }

    @Override
    public void Move() {
        System.out.println("The car is moving");
    }

    public String toString(){
        return("Gasoline Engine");
    }
}