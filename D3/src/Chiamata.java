public class Chiamata {
    private double durata;
    private String numeroChiamato;

    public Chiamata(double durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    // Getter per la stampa
    public double getDurata() { return durata; }
    public String getNumeroChiamato() { return numeroChiamato; }
}