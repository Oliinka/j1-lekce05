package cz.czechitas.lekce5.model;

public class Address {
    private String ulice;
    private int cisloDomu;
    private String castObce;
    private String obec;
    private int psc;


    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public int getCisloDomu() {
        return cisloDomu;
    }

    public void setCisloDomu(int cisloDomu) {
        this.cisloDomu = cisloDomu;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        if (obec == null){
            System.err.println("Vek musi byt 0 nebo vic.");
        }

    }

    public int getPsc() {
        return psc;
    }

    public void setPsc(int psc) {
        this.psc = psc;
    }
}
