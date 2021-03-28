/*
import matematik.DortIslem;
import matematik.Logaritma;

Böyle tek tek uğraşmak yerine " import matematik.*; " şeklinde de yapılabilir.
 */

import matematik.*;
import java.util.Scanner; //buil-in paket, yani javanın içerisinde olan bir pakettir.


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin.");
        int sayi = scanner.nextInt();
        System.out.println("Girilen sayı: " + sayi);

        DortIslem hesaplayici1 = new DortIslem();
        hesaplayici1.topla(7,4);

        Logaritma hesaplayici2 = new Logaritma();
        hesaplayici2.logaritmaHesapla();


    }
}
