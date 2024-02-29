package cz.czechitas.lekce5;

public class Osoba {
//toto je konstruktor ma stejne jmeno jako trida automaticky ho vypise IDEA Alt+Insert
//   public Osoba() {}
    //vytvoreni fieldu je nazev nejake promenne, tak jako v pythonu, ale v Jave se to uplne tak nedela

    private static int pocet = 0;
    private String jmeno;
    private String prijmeni;
    private int vek;

    public Osoba() {
        pocet += 1;
        System.out.println(pocet + "osob");
    }

    //getters cteni
    public String getCeleJmeno() {
        return jmeno + " " + prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    //setters nastavit to jmeno -zapisovat, a metody jsou pristupne zvenku
    public void setCeleJmeno(String celeJmeno) {
        String[] strings = celeJmeno.split(" ", 2);
        this.jmeno = strings[0];
        this.prijmeni= strings[1];
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        if (vek<0){
          System.err.println("Vek musi byt 0, nebo vice.");
          return;
        }
        this.vek = vek;
    }

    public static int getPocet(){
        return pocet;
    }
}
