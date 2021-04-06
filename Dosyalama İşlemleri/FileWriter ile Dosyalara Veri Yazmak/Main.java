import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        FileWriter writer = null;
        /*
            Eğer try'ın içinde,
            FileWriter writer = new FileWriter("Deneme.txt");

            yapsaydık finally bloğumuzda writer gözükmeyecekti. Dolayısıyla finally bloğunun
            writer'ı görmesi için dışarıda tanımladık.
         */
        try
        {
            writer = new FileWriter("Deneme.txt",true);
            //true parametresini vermezsek her seferinde dosyayı baştan oluşturup sıfırdan işlemleri yapar.
            writer.write("Mert Sığırcı\nSakarya Üniversitesi\n" +
                    "Bilgisayar Mühendisliği 2. sınıf öğrencisi\n");
            writer.write("JAVA DERSLERİ\n");
        }
        catch (IOException e)
        {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
        finally
        {
            if (writer!=null)
            {
               try
               {
                   writer.close();
               }
               catch (IOException e)
               {
                   System.out.println("Dosya kapatılırken bir hata oluştu.");
               }
            }
        }


    }
}