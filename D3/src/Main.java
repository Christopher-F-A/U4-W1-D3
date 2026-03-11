import java.util.Scanner;

public class Main {

    //stampare un rettangolo
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("\n--- Risultati Rettangolo ---");
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    // stampare due rettangoli
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("\n--- Confronto e Somma ---");
        System.out.println("Rettangolo 1 -> Area: " + r1.calcolaArea() + ", Perimetro: " + r1.calcolaPerimetro());
        System.out.println("Rettangolo 2 -> Area: " + r2.calcolaArea() + ", Perimetro: " + r2.calcolaPerimetro());

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma totale Aree: " + sommaAree);
        System.out.println("Somma totale Perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input per il Primo Rettangolo
        System.out.println("Inserimento dati RETTANGOLO 1");
        System.out.print("Inserisci l'altezza: ");
        double h1 = input.nextDouble();
        System.out.print("Inserisci la larghezza: ");
        double l1 = input.nextDouble();
        Rettangolo rett1 = new Rettangolo(h1, l1);

        // Input per il Secondo Rettangolo
        System.out.println("\nInserimento dati RETTANGOLO 2");
        System.out.print("Inserisci l'altezza: ");
        double h2 = input.nextDouble();
        System.out.print("Inserisci la larghezza: ");
        double l2 = input.nextDouble();
        Rettangolo rett2 = new Rettangolo(h2, l2);


        System.out.println("\n--- ESECUZIONE TEST ---");
        stampaRettangolo(rett1);
        stampaDueRettangoli(rett1, rett2);

        input.close();
    }
}