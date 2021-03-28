import java.io.IOException;
import java.util.Scanner;

public class Main
{

    static void mekanKontrol(int yas) throws IOException
    {
        if (yas<18)
        {
            throw new IOException();
            /*
            IOException çalışma zamanı hatası olmadığı için metodun başına
            "throws IOException" imzası eklememiz gerekir.

            Bu da sisteme "Bu metot 'xxx' hatasını fırlatır." diyerek metodu tanıtır.
             */
        }
        else
        {
            System.out.println("Mekana Hoşgeldiniz.");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int yas;
        System.out.println("Yaşınızı Girin: ");
        yas=scanner.nextInt();

        try{
            mekanKontrol(yas);
        }catch (Exception e){
            System.out.println("Yaşınız mekana girmeye müsait değil.");
        }

        //VEYA
        mekanKontrol(yas);
        /*
            Main metodun imzasına "throws IOException" yazılırsa try-catch kullanmak zorunda kalmayız.
            Böylece bu yazılımı yazan kişi haricinde kullanacak olan kişilere hata yakalama bilgisi
            vermiş oluruz.
         */




    }
}
