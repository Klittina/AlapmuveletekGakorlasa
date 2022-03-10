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
        szorzas();
    }

    public static int szorzas() {
        int a = rnd.nextInt(10)+1;
        int b = rnd.nextInt(10)+1;
        int c = a*b;
        int helyes;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mi a megoldás ennél a szorzásnál: %d * %d\n", a, b);
        int valasz = bekertszam.nextInt();
        System.out.printf("A szorzás eredménye: %d\n",c);
        if(valasz == c){
            helyes = 1;
        }else{
            helyes = 0;
        }
        return helyes;
    }
    
}
