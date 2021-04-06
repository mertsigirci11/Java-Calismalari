import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*         ----------FileReader--------
        try (Scanner scanner = new Scanner(new FileReader("ogrenciler.txt")))
        {
            ArrayList<String> isimListesi=new ArrayList<String>();
            ArrayList<String> bolumListesi=new ArrayList<String>();

            while(scanner.hasNextLine())
            {
                String ogrenciBilgisi = scanner.nextLine();
                String[] array = ogrenciBilgisi.split(", ");
                isimListesi.add(array[0]);
                bolumListesi.add(array[1]);

                if (array[1].equals("Bilgisayar Mühendisliği"))
                {
                    System.out.println("Öğrenci Bilgisi: "+ array[0]);
                }
            }
            for (int i=0; i<isimListesi.size();i++)
            {
                System.out.println("Öğrenci Adı: " + isimListesi.get(i));
                System.out.println("Öğrenci Bölümü: " + bolumListesi.get(i));
                System.out.println("\n");
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Dosya bulunamadı.");
        }*/

        /*                ---------BufferedReader--------------
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt"))))
        {
            while(scanner.hasNextLine())
            {
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(", ");

                if (array[1].equals("Bilgisayar Mühendisliği"))
                {
                    System.out.println(array[0]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        }
        */

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt", true)))
        {
            writer.write("Berke Takkaç, Makine Mühendisliği\n");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken hata oluştu.");
        }

    }
}
