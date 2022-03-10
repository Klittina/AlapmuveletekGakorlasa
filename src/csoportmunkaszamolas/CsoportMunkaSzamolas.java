package csoportmunkaszamolas;

import java.util.Random;
import java.util.Scanner;

public class CsoportMunkaSzamolas {
    static Scanner jel = new Scanner(System.in);
    static Scanner bekertszam = new Scanner(System.in);
    static Random rnd = new Random();

    public static void osztas() {
        
    }
    public static int  kivonas(){
        int a;
        int b;
        int c = 2;
        int valasz=0;
        int eredmeny = 0;
        while(c<1 && c>100){
            a = rnd.nextInt(100)+1;
            b = rnd.nextInt(100)+1;
            c = a-b;
            if(c >=1 && c<=100){
                System.out.printf("Írd le a(z) %d - %d eredményét!", a, b);
                valasz = bekertszam.nextInt();
            }
            if(c == valasz){
                eredmeny = 1;
            }
            
        }
        return eredmeny;
    }

    public static void main(String[] args) {
        kivonas();
    }
    
}
