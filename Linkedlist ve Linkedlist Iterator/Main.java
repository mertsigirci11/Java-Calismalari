import java.util.LinkedList;
import java.util.ListIterator;

public class Main
{
    public static void listeyiBastir1(LinkedList<String> linkedList)
    {
        for (String eleman: linkedList)
        {
            System.out.println(eleman);
        }
    }

    public static void listeyiBastir2(LinkedList<String> linkedList)
    {
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public static void siraliEkle(LinkedList<String> linkedList, String yeni_eleman)
    {
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext())
        {
            int karsilastir = iterator.next().compareTo(yeni_eleman);
            //parantez içine yazılan değer iterator'un gösterdiği değerden alfabetik olarak sonra geliyorsa -1 döndürür.
            //parantez içine yazılan değer iterator'un gösterdiği değere eşitse 0 döndürür.
            //parantez içine yazılan değer iterator'un gösterdiği değerden alfabetik olarak önce geliyorsa +1 döndürür.
            if (karsilastir<0)
            {
                //Yeni değer iterator.next() 'ten daha büyük
            }
            else if (karsilastir==0)
            {
                System.out.println("Listede bu eleman zaten var");
                return;
            }
            else if (karsilastir>0)
            {
                iterator.previous();
                iterator.add(yeni_eleman);
                return;
            }

        }
        iterator.add(yeni_eleman);
    }



    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Postane");
        linkedList.add("Market");
        linkedList.add("Okul");
        linkedList.add("Kütüphane");
        linkedList.add("Spor Salonu");
        linkedList.add("Ev");
        listeyiBastir2(linkedList);
        System.out.println("----------");


        //Kütüphaneden sonra "Alışveriş Merkezi" 'ni eklemek için
        linkedList.add(4,"Alışveriş Merkezi");
        listeyiBastir2(linkedList);
        System.out.println("----------");

        //Kütüphaneyi silelelim
        linkedList.remove("Kütüphane");
        listeyiBastir2(linkedList);
        System.out.println("----------");

        //
        LinkedList<String> list = new LinkedList<String>();
        siraliEkle(linkedList, "Kasap");
        siraliEkle(linkedList, "Kuruyemişçi");
        siraliEkle(linkedList, "Şarküteri");
        siraliEkle(linkedList, "Araba");
        listeyiBastir2(linkedList);

    }
}



























