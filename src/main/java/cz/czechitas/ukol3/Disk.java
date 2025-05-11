package cz.czechitas.ukol3;

public class Disk {

    private long kapacitaDisku;
    private long vyuziteMisto;

    public String toString() {
        return "Kapacita disku:" + kapacitaDisku  + "B" + "\nVyužité místo: " + vyuziteMisto + "B";
    }

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacitaDisku) {
        this.kapacitaDisku = kapacitaDisku;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }
}