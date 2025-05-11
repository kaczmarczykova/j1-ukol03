package cz.czechitas.ukol3;

public class Procesor {


    private String vyrobce;
    private long rychlost;  //v Hz


    public String toString() {
        return "Výrobce procesoru:" + vyrobce + "\nRychlost procesoru:" + rychlost + "Hz";
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }
}
