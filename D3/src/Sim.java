public class Sim {
    private String numeroTelefono;
    private double credito;
    private Chiamata[] ultimeChiamate; // Array di oggetti Chiamata

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeChiamate = new Chiamata[5]; // Inizializza spazio per 5 chiamate
    }

    public void stampaDati() {
        System.out.println("=== DATI SIM ===");
        System.out.println("Numero: " + this.numeroTelefono);
        System.out.println("Credito disponibile: " + this.credito + "€");
        System.out.println("Ultime 5 chiamate:");

        for (int i = 0; i < ultimeChiamate.length; i++) {
            if (ultimeChiamate[i] != null) {
                System.out.println("- " + ultimeChiamate[i].getNumeroChiamato() +
                        " (Durata: " + ultimeChiamate[i].getDurata() + " min)");
            } else {
                System.out.println("- Nessuna chiamata registrata");
            }
        }
    }
}