package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe();      // Vypíše chybu, protože počítač v tuto chvíli nemá všechny povinné součásti.

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(3_490_000_000L);
        mujProcesor.setVyrobce("Apple");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacitaPameti(24_000_000_000L);

        Disk mujDisk = new Disk();
        mujDisk.setKapacitaDisku(994_662_584_320L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();      // Vypíše chybu, protože počítač už běží
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();

        mujPocitac.vypniSe();      // Nevypíše chybu, ale nic neprovede, protože počítač už je vypnutý


        mujPocitac.zapniSe();
        mujPocitac.vytvorSouborOVelikosti(4_000_000_000L);
        mujPocitac.vytvorSouborOVelikosti(16_000_000_000L);
        mujPocitac.vytvorSouborOVelikosti(8_000_000_000L);

        mujPocitac.vymazSouboryOVelikosti(16_000_000_000L);
        mujPocitac.vymazSouboryOVelikosti(4_000_000_000L);
        mujPocitac.vymazSouboryOVelikosti(8_000_000_000L);
        mujPocitac.vypniSe();
    }

}
