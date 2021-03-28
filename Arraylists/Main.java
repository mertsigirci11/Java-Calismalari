import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main
{

    public static void main(String[] args)
    {
        /*
            Biz ilk başlarda öğrendiğimiz arrayleri 2 türde tanımlayabiliyorduk.

            1. Tanımlarken değerlerini yazabiliyorduk. -> int[] array = new int[] {1,2,3};
            2. Tanımlarken kaç tane değer alabileceğini belirtiyorduk. -> int[] array = new int[3];

            İkisinde de sonradan eleman ekleyemeyiz. En fazla eklenmiş olan elemanların değerlerini
            değiştirebiliriz.
         */
        /*
            Arraylist'ler normal array'lerin aksine daha esnektir(flexible).
            Arraylist'lerin istediğimiz indeksine ver ekleyebiliriz.
         */
        /*
            get metodu               : Belirtilen indexteki elemanı getirir.
            set metodu               : Bir indexteki değeri değiştirmek için kullanılır.
            add metodu               : Arraylist'e veri eklemek için kullanılır.
            remove metodu            : Belirtilen indeksteki değeri siler.
            indexOf metodu           : Parametreye yazılan değer Arraylist'te varsa indeksini getirir.
            clear metodu             : Tüm elemanları siler.
            size metodu              : Arraylist'in eleman sayısını bulmak için kullanılır.
            Collections.sort metodu  : Alfabetik olarak veya nümerik olarak veileri sıralar.
         */

        //KARIŞIK TÜRDEN VERİ İÇEREN ARRAYLIST
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(11);
        arrayList1.add(8);
        arrayList1.add("Mert Sigirci");
        arrayList1.add(true);
        arrayList1.add(5.4);
        System.out.println("Eleman sayisi: " + arrayList1.size());
        arrayList1.remove(1);
        System.out.println("Eleman sayisi: " + arrayList1.size());
        //Görüldüğü üzere sınırlama yoktur eleman eklenip çıkarılabilir.

        for (Object a : arrayList1) //Karışık türden veri olabileceğinden türü object olarak tanımlanır.
        {
            System.out.println(a);
        }

        //BELİRLİ BİR TİPE SAHİP OLAN ARRAYLIST (TYPE-SAFE)
        ArrayList<String> arrayList2 = new ArrayList<String>();

        arrayList2.add("Sakarya");
        arrayList2.add("Ankara");
        arrayList2.add("Kocaeli");
        arrayList2.add("Istanbul");
        arrayList2.remove("Istanbul");
        Collections.sort(arrayList2); //Sıralandı

        for (String a: arrayList2) //Türü string olduğu için Object değil String yazdık.
        {
            System.out.println(a);
        }

    }
}
