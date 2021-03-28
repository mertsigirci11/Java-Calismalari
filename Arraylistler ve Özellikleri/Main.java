import java.util.ArrayList;

public class Main
{

    public static void yazdir(ArrayList<String> arrayList)
    {
        for (Object eleman : arrayList)
        {
            System.out.println(eleman);
        }
    }
    public static void main(String[] args)
    {
	    /*
	        Arraylist'leri array'lerin genişletilebilir hali olarak düşünebiliriz.
	        İndexlenmesi normal array'ler gibidir.
	     */

        //AARRAYLIST OLUŞTURMASI
        ArrayList<String> arrayList1 = new ArrayList<String>();


        //ARRAYLIST'E ELEMAN EKLEME
        arrayList1.add("Çorum");   //0. index
        arrayList1.add("Sakarya"); //1. index
        arrayList1.add("Ankara");  //2. index
        arrayList1.add("Kocaeli"); //3. index
        arrayList1.add("İstanbul"); //4. index


        //ARRAYLIST VERİSİNE ULAŞMAK
        System.out.println(arrayList1.get(0));
        System.out.println(arrayList1.get(3));


        //ARRAYLIST'TEN VERİ SİLMEK
        arrayList1.remove("Çorum");//İçindeki değere göre siler.
        //Çorum silinince Sakarya=0. , Ankara=1. , Kocaeli=2. , İstanbul= 3. index değerine sahip oldu.
        arrayList1.remove(0);   //İçindeki indexe göre siler
        //0. index silinince diğer elemanların indexleri 1 azaldı/geriye geldi.


        //ARRAYLIST BOYUTUNU BULMAK
        System.out.println(arrayList1.size());


        //ARRAYLIST'İ FOR DÖNGÜSÜ İLE BASTIRMAK
        for (int i=0; i< arrayList1.size(); i++)
        {
            System.out.println(arrayList1.get(i));
        }

        //BİR ELEMANIN INDEX'İNİ BULMAK
        System.out.println(arrayList1.indexOf("Kocaeli"));
        //Eğer aynı veriden 1'den fazla varsa ilk gördüğünün index'ini verir.
        //Listede olmayan bir elemanı aratırsak metot bize -1 değerini döndürür.


        //INDEX ARAMAYA SONDAN BAŞLAMAK
        System.out.println(arrayList1.lastIndexOf("İstanbul"));


        //ARRAYLIST GUNCELLEME
        arrayList1.set(2,"Samsun");

        //BİR ARRAYLIST'İ BİR FONKSİYONA GÖNDERME
        yazdir(arrayList1);


        //ARRAYLIST'İ FOREACH DÖNGÜSÜ İLE BASTIRMAK
        for (String eleman: arrayList1)
        {
            System.out.println(eleman.toUpperCase());
        }


    }
}
