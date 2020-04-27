package enums;

public enum GasolineType {

    A_72 ("A-72"),
    A_76 ("A-76"),
    A_80 ("A-80"),
    AI_91 ("АИ-91"),
    AI_92 ("АИ-92"),
    AI_93 ("АИ-93"),
    AI_95 ("АИ-95"),
    AI_98 ("АИ-98");

    private String gasolineType;

    GasolineType(String gasolineType) {
        this.gasolineType = gasolineType;
    }

    public String getGasolineType() {
        return gasolineType;
    }
}
