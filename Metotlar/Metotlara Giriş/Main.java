import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        selamGonder();

        int sayi;
        System.out.print("Lütfen dizide aramak istediğiniz değeri giriniz: ");
        sayi = scan.nextInt();
        sayiBul(sayi);
    }

    public static void sayiBul(int bulunacak)
    {
        int[] dizi = new int[] {1,2,3,4,5,6,7,8,9};
        boolean kontrol = false;
        for (int deger : dizi)
        {
            if (bulunacak == deger)
            {
                kontrol = true;
                break;
            }
        }
        if (kontrol)
        {
            System.out.println("Aradığınız değer bulunmakta.");
        }
        else
        {
            System.out.println("Aradığınız değer bulunmamakta.");
        }
    }

    public static void selamGonder()
    {
        System.out.println("Merhaba Dünya");
    }
}
