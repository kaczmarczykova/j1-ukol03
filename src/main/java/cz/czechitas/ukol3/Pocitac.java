package cz.czechitas.ukol3;

public class Pocitac {
    boolean jeZapnuty;       //toto bude pouze field, bez getteru a setteru

    private Procesor mujProcesor;
    private Disk mujDisk;
    private Pamet mojePamet;

   public String toString() {
       if (mujProcesor == null || mujDisk == null || mojePamet == null)
            return "Pocitac neni kompletni";
       return mujProcesor.toString() + "\n" + mujDisk.toString() + "\n" + mojePamet.toString();
    }

    /*public long getCpu() {
        return cpu;
    }*/

    public void setCpu(Procesor cpu) {
        this.mujProcesor = cpu;
    }

    public void setRam(Pamet ram) {
        this.mojePamet = ram;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.mujDisk = pevnyDisk;
    }

    public boolean jeZapnuty(){
        if (jeZapnuty) {
            System.out.println("Počítač je zapnutý.");
        } else {
            System.out.println("Počítač je vypnutý.");
        }
        return jeZapnuty;
    }

    public boolean zapniSe() {
        if (mujProcesor == null || mojePamet == null || mujDisk == null) {
            System.err.println("Počítač nelze zapnout.");
            jeZapnuty = false;
        } else {
            if (!jeZapnuty) {
                System.out.println("Počítač se zapnul.");
                jeZapnuty = true;
            } else {
                System.err.println("Počítač už je zapnutý.");
                jeZapnuty = true;
            }
        }
        return jeZapnuty;
    }

    public boolean vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
        }
        return jeZapnuty;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.err.println("Počítač je vypnutý, akci nelze provést.");
            return;
        }
        mujDisk.vytvorSoubor(velikost);
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.err.println("Počítač je vypnutý, akci nelze provést.");
            return;
        }
        mujDisk.vymazSoubor(velikost);
    }
}
