import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nedan följer ett program som räknar ut hur många dagar du har levt hittills fram till dagens datum.");
        System.out.println("Ange svar på följande frågor i siffror. " + "\n");

        Scanner Homer = new Scanner(System.in);
        System.out.print("Vilket månad föddes du? (Jan =1, Feb =2, Mars=3 osv: "); int bornMonth = Homer.nextInt();
        System.out.print("Vilken dag föddes du? (i siffra) "); int bornDay = Homer.nextInt();

        int astrologi = (bornMonth * 100 + bornDay);


        //Månader/dagar ej korrekt sorterade än. Men koden korrekt, och fungerar.
        if (astrologi >= 1222) {
            System.out.println("Väduren");
        } else if (astrologi >= 1122) {
            System.out.println("Oxen");
        } else if (astrologi >= 1022) {
            System.out.println("Tvillingarna");
        } else if (astrologi >= 922) {
            System.out.println("Kräftan");
        } else if (astrologi >= 821) {
            System.out.println("Lejonet");
        } else if (astrologi >= 721) {
            System.out.println("Jungfrun");
        } else if (astrologi >= 621) {
            System.out.println("Vågen");
        } else if (astrologi >= 521) {
            System.out.println("Skorpionen");
        } else if (astrologi >= 420) {
            System.out.println("Skytten");
        } else if (astrologi >= 120) {
            System.out.println("Stenbocken");
        } else if (astrologi >= 220) {
            System.out.println("Vattumannen");
        } else if (astrologi >= 320) {
            System.out.println("Fiskarna");
        }

    }
}
