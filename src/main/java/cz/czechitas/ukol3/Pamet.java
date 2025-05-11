package cz.czechitas.ukol3;

public class Pamet {

    private long  kapacitaPameti;

    public String toString() {
        return "Kapacita paměti:" + kapacitaPameti + "B";
    }

    public long getKapacitaPameti() {
        return kapacitaPameti;
    }

    public void setKapacitaPameti(long kapacitaPameti) {
        this.kapacitaPameti = kapacitaPameti;
    }
}
