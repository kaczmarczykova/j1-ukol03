package cz.czechitas.ukol3;

public class Disk {

    private long kapacitaDisku;
    private long vyuziteMisto = 0;

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

    public void vytvorSoubor(long velikostSouboru) {
        if (vyuziteMisto + velikostSouboru <= kapacitaDisku)
            vyuziteMisto += velikostSouboru;
        else
            System.err.println("Počítač nemá dostatek volného místa na disku.");
    }

    public void vymazSoubor(long velikostSouboru) {
        if (vyuziteMisto - velikostSouboru >= 0)
            vyuziteMisto -= velikostSouboru;
        else
            System.err.println("Na disku není tak velký soubor");
    }
}