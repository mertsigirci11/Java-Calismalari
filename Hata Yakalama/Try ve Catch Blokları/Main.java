import java.io.IOException;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        /*
            try
            {
                //Exception oluşturabilecek kodlar
            }
            catch(Exception_Türü e)
            {
                //Excepytion durumunda yapılacak şey
            }

        */


        //ÖZEL CLASS'I YAZARAK HATAYI YAKALADIK
        try
        {
            int a = 30/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Bir sayı sıfıra bölünemez.");
        }


        //SUPER CLASS'I YAZARAK DA HATA YAKALANABİLİR
        try
        {
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
        }
        catch (Exception e)
        {
            System.out.println("Diziye yanlış parametre verdiniz.");
        }


        //TOPLU HATA
        try
        {
            int[] b = {1,2,3,4};
            System.out.println(b[6]);
            int k = 30/0;
            System.out.println(k);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Sayı sıfıra bölünemez");

        }
        catch (ArithmeticException e)
        {
            //Burayı yazdırmaz ilk catch bloğunu yazdırır.
            System.out.println("İndex dışı parametre verdiniz");
        }


    }
}
