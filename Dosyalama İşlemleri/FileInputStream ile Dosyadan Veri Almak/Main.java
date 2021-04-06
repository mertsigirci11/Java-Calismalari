import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{

    public static void main(String[] args)
    {
        FileInputStream inputStream = null;
        try
        {
            inputStream = new FileInputStream("deneme.txt");
            /*
                //İmleç, dosyanın en başına bulunur. Teker teker okur.
                System.out.println("Birinci karakter: " + (char)(inputStream.read()));
                System.out.println("İkinci karakter: " + (char)(inputStream.read()));
                System.out.println("Üçüncü karakter: " + (char)(inputStream.read()));
                System.out.println("Dördüncü karakter: " + (char)(inputStream.read()));
             */

            /*
                //Dosyanın belli bir yerini okumak için:
                inputStream.skip(5);//İmlecin bulunduğu yerden 5 birim sonrasını okur.
                System.out.println("Birinci karakter: " + (char)(inputStream.read()));
                System.out.println("İknci karakter: " + (char)(inputStream.read()));
                System.out.println("Üçüncü karakter: " + (char)(inputStream.read()));

             */

            int deger;//Döngü ile dosya okunurken karakterlerin ASCII'lerini tutmak için değişken atadık.
            String s="";//Okuduğumuz değerleri atamak için değişken oluşturduk.
            while ((deger = inputStream.read()) != -1)//Dosyanın karakterlerini tek tek veren döngüyü yazdık.
            {
                s+= (char)deger;//Aldığımız karakterleri chara çevirerek tek tek s'ye atadık.
            }
            System.out.println("Dosya içeriği:\n"+s);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu.");
        } finally
        {
            try
            {
                if (inputStream!=null)
                {
                    inputStream.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Dosya kapatılırken bir hata oldu.");
            }
        }
    }
}
