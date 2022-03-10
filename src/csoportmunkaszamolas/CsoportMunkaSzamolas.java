package csoportmunkaszamolas;

import java.util.Random;
import java.util.Scanner;

public class CsoportMunkaSzamolas {
    static Scanner jel = new Scanner(System.in);
    static Scanner bekertszam = new Scanner(System.in);
    static Random rnd = new Random();

    public static void osztas() {
        
    }

    public static void main(String[] args) {
        System.out.println("Milyen műveletet szeretne gyakorolni?");
        String gyakorlojel = jel.nextLine();
        if(gyakorlojel.equals("+")){
            osszead();
        }
        else if(gyakorlojel.equals("-")){
            kivonas();
        }
        else if(gyakorlojel.toLowerCase().equals("x")){
            szorzas();
        }
        else if(gyakorlojel.equals("/")){
            osztas();
        }
    }
}
