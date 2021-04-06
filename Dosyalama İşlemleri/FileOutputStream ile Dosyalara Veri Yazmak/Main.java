//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main
{

    public static void main(String[] args)
    {
        FileOutputStream fileOutputStream = null;
        //File file = new File("denemeeee.txt");  FARKLI KULLANIM

        try
        {
            //fileOutputStream = new FileOutputStream(file);  FARKLI KULLANIM
            fileOutputStream = new FileOutputStream("deneme.txt", true);

            //ASCI DEĞERLERİNİ VEREREK YAZDIRMA
            fileOutputStream.write(65);//ASCII ŞEKLİNDE YAZILDI.
            fileOutputStream.write(74);//ASCII ŞEKLİNDE YAZILDI.
            byte[] array = {101,75,66,68};//ARRAY OLUŞTURULDU.
            fileOutputStream.write(array);//ARRAY'DEKİ ELEMANLARA KARŞILIK GELEN ASCII DEĞERLERİ YAZILDI.

            //STRING VEREREK YAZDIRMA
            String s= "Mert Sığırcı";
            byte[] s_array=s.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(s_array);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found exception oluştu.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu");
        } finally
        {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }
    }
}
