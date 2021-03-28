import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        /*
            Metotlara giriş ve Parametreli-Parametresiz Metotlar, projelerinde void anahtar kelimesini
            kullandık. Bu void anahtar kelimesi fonksiyonun boş olduğunu bir değer içermediğini anlatır.
            Lakin şimdi değer döndüren foksiyonları öğreneceğiz.
        */

        /*
            Biz programcılar fonksiyonlara hangi değeri döndürmesini istiyorsak onun değişken tipine
            göre adlandırırız. Örneğin tam sayı bir değere sahip olmasını istiyorsak "void" yerine "int"
            yazarız, doğru veya yanlış bir değere sahip olmasını istiyorsak "void" yerine "boolean"
            yazarız.

            Şimdi boş, değer içermeyen fonksiyonlardan farklı olarak, bir değere sahip olan fonksiyonların
            sonunda "return" anahtar kelimesini kullanırız. "return" anahtar kelimesi fonksiyonun değerini
            içerir/döndürür.

            Değer içeren fonksiyonlar "return" anahtar kelimesinden sonra çalışmaz.

            Kısaca; "return", bize fonksiyondan çıktı almamızı sağlayan bir anahtar kelimedir.
        */

        Scanner scan = new Scanner(System.in);
        int deger1, deger2;
        System.out.print("Toplanacak 1. sayı: ");
        deger1 = scan.nextInt();
        System.out.print("Toplanacak 2. sayı: ");
        deger2 = scan.nextInt();

        System.out.println("Toplama işleminin değeri " + toplamaYap(deger1, deger2));
        //System.out.println("Toplama işleminin değeri " + toplamaYapDeneme(deger1, deger2)); HATA VERDİ

    }

    public static int toplamaYap(int sayi1, int sayi2)
    {
        return sayi1 + sayi2;
    }

    public static void toplamaYapDeneme(int sayi1, int sayi2)
    {
        System.out.println(sayi1 + sayi2);
    }
}
