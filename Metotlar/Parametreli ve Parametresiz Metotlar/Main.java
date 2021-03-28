import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*
            Parametresiz Metotlar:
                Bu metotların içlerine bir değer gönderemeyiz. Kodu yazan kişi neleri yazmışsa o çalışır.

            Parametreli Metotlar:
                Bu metotların içine int, double, string boolean vs. değişkenler veya değerler gönderebiliriz.
                Bu metotlar gönderdiğimiz değerlere göre çalışır.
        */
        Scanner scan = new Scanner(System.in);

        String name, surname;
        int age;

        selamla();

        System.out.print("Adın nedir: ");
        name = scan.nextLine();
        System.out.print("Soyadın nedir: ");
        surname = scan.nextLine();
        System.out.print("Yaşın nedir: ");
        age = scan.nextInt();

        tanitim(name, surname, age);
    }

    //PARAMETRESİZ METOTLAR
    public static void selamla()
    {
        System.out.println("Merhaba, uygulamamıza hoşgeldin.");
        System.out.println("Lütfen bizlere kendini tanıtır mısın?");
    }
    //PARAMETRELİ METOTLAR
    public static void tanitim(String isim, String soyisim, int yas)
    {
        System.out.println("Seninle tanıştığıma memnun oldum " + isim +" " + soyisim);
        System.out.println("Senden aldığım bilgilere göre " + yas + " yaşındasın.");
    }
}
