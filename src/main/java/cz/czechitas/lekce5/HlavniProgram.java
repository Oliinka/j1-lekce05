package cz.czechitas.lekce5;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {


        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        //dopsany kod v prubehu lekce
        Osoba cerna = new Osoba();
        cerna.setCeleJmeno("Dana Cerna");
        cerna.setVek(23);

        Osoba novak = new Osoba();
        novak.setCeleJmeno("Jan Novak");
        novak.setVek(39);

        System.out.println(cerna.getCeleJmeno());
        System.out.println(cerna.getVek());
        System.out.println(Osoba.getPocet());
        Osoba.getPocet();



    }
}
