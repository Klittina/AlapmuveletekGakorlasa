package csoportmunkaszamolas;

import java.util.Random;
import java.util.Scanner;

public class CsoportMunkaSzamolas {

    static Scanner jel = new Scanner(System.in);
    static Scanner bekertszam = new Scanner(System.in);
    static Random rnd = new Random();

        public static int osszead(){
        int a,b,c;
        int helyes;
        
        a = rnd.nextInt(100)+1;
        b = rnd.nextInt(100)+1;
        while(a+b>=100){
              a = rnd.nextInt(100)+1;
              b = rnd.nextInt(100)+1;
        }
        c = a+b;
        System.out.printf("%d+%d=",a,b);
        int valasz=bekertszam.nextInt();
        if (valasz==c) helyes=1;
        else helyes=0;
        return helyes;
}
    public static int osztas() {
        int a, b, c;
        int valasz;
        int helyes;

        a = rnd.nextInt(100) + 1;
        b = rnd.nextInt(a) + 1;
        while (a % b != 0) {
            b = rnd.nextInt(a) + 1;
        }
        c = a / b;
        System.out.printf("\n%d / %d = ", a, b);
        valasz = bekertszam.nextInt();
        if (valasz == c) {
            helyes = 1;
        } else {
            helyes = 0;
        }
        return helyes;
    }

    public static int kivonas() {
        int a;
        int b;
        int c = 2;
        int valasz = 0;
        int eredmeny = 0;
        while (c < 1 && c > 100) {
            a = rnd.nextInt(100) + 1;
            b = rnd.nextInt(100) + 1;
            c = a - b;
            if (c >= 1 && c <= 100) {
                System.out.printf("Írd le a(z) %d - %d eredményét!", a, b);
                valasz = bekertszam.nextInt();
            }
            if (c == valasz) {
                eredmeny = 1;
            }

        }
        return eredmeny;
    }

    public static void main(String[] args) {
        System.out.println("Milyen műveletet szeretne gyakorolni?");
        String gyakorlojel = jel.nextLine();
        int helyes = 0;
        int i = 0;
        while(i < 10){
        while (!(gyakorlojel.equals("+")) || !((gyakorlojel.equals("-"))) || !((gyakorlojel.toLowerCase().equals("x"))) || (gyakorlojel.equals("/"))) {
            System.out.println("A jel nem felel meg + , - , x vagy / jelt adja meg. Milyen műveletet szeretne gyakorolni?");
            gyakorlojel = jel.nextLine();
        }
        if (gyakorlojel.equals("+")) {
            helyes += osszead();
        } else if (gyakorlojel.equals("-")) {
            helyes += kivonas();
        } else if (gyakorlojel.toLowerCase().equals("x")) {
            helyes += szorzas();
        } else if (gyakorlojel.equals("/")) {
            helyes += osztas();
        }
        i++;
        }
    }

    public static int szorzas() {
        int a = rnd.nextInt(10) + 1;
        int b = rnd.nextInt(10) + 1;
        int c = a * b;
        int helyes;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mi a megoldás ennél a szorzásnál: %d * %d\n", a, b);
        int valasz = bekertszam.nextInt();
        System.out.printf("A szorzás eredménye: %d\n", c);
        if (valasz == c) {
            helyes = 1;
        } else {
            helyes = 0;
        }
        return helyes;
    }
}
