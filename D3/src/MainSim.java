import java.util.Scanner;

public class MainSim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci il numero di telefono per la nuova SIM: ");
        String num = sc.nextLine();

        //istanza SIM
        Sim miaSim = new Sim(num);

        miaSim.stampaDati();

        sc.close();
    }
}