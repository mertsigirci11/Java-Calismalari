import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void harfNotuHesapla(ArrayList<Double> sayısalNotListesi, ArrayList<String> harfNotuListesi)
    {
        for(Double eleman : sayısalNotListesi)
        {
            if(eleman<40){harfNotuListesi.add("FF");}
            if(40<eleman || eleman<=50){harfNotuListesi.add("DD");}
            if(50<eleman || eleman<=60){harfNotuListesi.add("DC");}
            if(60<eleman || eleman<=70){harfNotuListesi.add("CC");}
            if(70<eleman || eleman<=80){harfNotuListesi.add("CB");}
            if(80<eleman || eleman<=85){harfNotuListesi.add("BB");}
            if(85<eleman || eleman<=90){harfNotuListesi.add("BA");}
            if(eleman>90 || eleman<=100){harfNotuListesi.add("AA");}
        }
    }

    public static void ogrenciNotBilgileri
            (ArrayList<String> isim, ArrayList<Double> ortalama, ArrayList<String> harfNot)
    {
        for(int i=0; i< isim.size();i++)
        {
            System.out.println("Öğrencinin adı ve soyadı: " + isim.get(i));
            System.out.println("Öğrencinin ortalaması: " + ortalama.get(i));
            System.out.println("Öğrencinin harf notu: " + harfNot.get(i));
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> ogrenciIsimleri = new ArrayList<String>();
        ArrayList<String> ogrenciNotlariKumesi_string = new ArrayList<String>();
        ArrayList<Double> ogrenciOrtalama = new ArrayList<Double>();
        ArrayList<String> harfNotu = new ArrayList<String>();

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("dosya.txt"))))
        {
            while(scanner.hasNextLine())
            {
                String ogrenciBilgisi = scanner.nextLine();
                String[] array;
                array = ogrenciBilgisi.split("-->");
                ogrenciIsimleri.add(array[0]);
                ogrenciNotlariKumesi_string.add(array[1]);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Dosya bulunamadı.");
        }

        for (String eleman:ogrenciNotlariKumesi_string)//String not kümesini double'a çevirip ortalamayı hesapladık.
        {
            String[] notlar1;
            notlar1=eleman.split(",");
            double sonuc=0;
            for (String eleman1:notlar1)
            {
                sonuc+=(Double.parseDouble(eleman1)/3);
            }
            ogrenciOrtalama.add(sonuc);
        }

        harfNotuHesapla(ogrenciOrtalama,harfNotu);
        ogrenciNotBilgileri(ogrenciIsimleri,ogrenciOrtalama,harfNotu);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("harfnotları.txt",true)))
        {
            for(int i=0; i<ogrenciIsimleri.size(); i++)
            {
                writer.write("Öğrencinin adı ve soyadı: " + ogrenciIsimleri.get(i)+"\n");
                writer.write("Öğrencinin ortalaması: " + ogrenciOrtalama.get(i)+"\n");
                writer.write("Öğrencinin harf notu: " + harfNotu.get(i)+"\n");
                writer.write("------------------------\n\n");
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Dosya bulunamadı");
        }
        catch(IOException e)
        {
            System.out.println("Dosyaya yazılırken hata oldu.");
        }

    }
}
