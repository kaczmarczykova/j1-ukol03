package cz.czechitas.ukol3;

public class Pocitac {
    boolean jeZapnuty;       //toto bude pouze field, bez getteru a setteru

    private Procesor mujProcesor;
    private Disk mujDisk;
    private Pamet mojePamet;

    public String toString() {
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
        if (jeZapnuty == true) {
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
            if (jeZapnuty == false) {
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
        if (jeZapnuty == true) {
            jeZapnuty = false;
        }
        return jeZapnuty;
    }
}
