package Examples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//2. Napisati program koji simulira korigovanje jacine zvuka na jutjubu.
//Podrazumevana vrednost za jacinu zvuka, u trenutku kada se ucita video, je 75%. Korisnik
//unosi akcije koje uticu na jacinu zvuka sve dok ne unese PLAY. Dozvoljene akcije su:
//● up - akcija povecava jacinu zvuka za 10%
//● down - akcija smanjuje jacinu zvuka za 10%
//● mute - akcije postavlja jacinu zvuka na 0%
//Jacina zvuka u bilo kom trenutku maksimalno moze biti 100% i minimalno 0%.Na kraju
//programa ispisati jacinu zvuka.
        //Primer izvrsenja 1:
        //Akcija: up
        //Akcija: up
        //Akcija: up
        //Akcija: down
        //Akcija: PLAY
        //Jacina zvuka je 90 %.
        //Primer izvrsenja loseg programa:
        //Akcija: up
        //Akcija: up
        //Akcija: up
        //Akcija: down
        //Akcija: PLAY

        int jacinaZvuka = 75;

        String akcija = "";
        while (!akcija.equals("play")) {
            System.out.print("Akcija (up,down,play): ");
            akcija = s.next();
            if (akcija.equals("up")) {
                jacinaZvuka = jacinaZvuka + 10;
            } else if (akcija.equals("down")) {
                jacinaZvuka = jacinaZvuka - 10;
            } else if (akcija.equals("mute")) {
                jacinaZvuka = 0;
            }
            if (jacinaZvuka <= 0) {
                jacinaZvuka = 0;
            }
            if (jacinaZvuka > 100) {
                jacinaZvuka = 100;
            }
        }
        System.out.println("Jacina zvuka je: " + jacinaZvuka + "%");
    }
}
