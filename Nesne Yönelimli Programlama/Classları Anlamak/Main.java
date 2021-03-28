public class Main
{

    public static void main(String[] args)
    {
    	/*
    		Classlar referans tiptir. Bellekte bir değişken tanımladığımızda bellekte onu oluşturmuş oluyoruz.
    		Bellekte 2 tane alan var. Stack ve heap.

    		musteri1 i oluşturduğumuz zaman stackte tanımlanır/yaratılır.
    		"new CustomerManager()" dediğimizde musteri1 in karşılığını/değerini
    		heap bölgesine referans olarak atar.

    		Aslında nesne/obje heapte çalışır. Örnekteki gibi ekle-sil-güncelle metotlarını çalıştırdığımızda
    		nesnenin o metotları nesnenin tutulduğu heap bölgesinden çalışır.

    		Bir class ı kullanabilmek için onun "new" lenmiş olması gerekir.

    	*/

		CustomerManager musteri1 = new CustomerManager();
		CustomerManager musteri2 = new CustomerManager();

	    musteri1 = musteri2;

        /*
	    	-> musteri1'in "new CustomerManager()" kısmı soluklaştı. Çünkü musteri1'in değerine musteri2'nin
	    	referans değerini verdik.

	    	-> Hal böyle olunca musteri1'in stackteki yeri musteri2 ile aynı yer olmuş oldu ve musteri1'in
	    	stackteki önceki adresi otomatik silindi.

	    	-> Fakat musteri1'in heapteki referansı silinmedi "çöp/artık" olarak kaldı. Bu çöp,
	    	garbage collector denilen yapı ile bellekten silinir. Garbage collector'ü kullanmak
	    	dinamik bellek yönetimi açısından çok önemlidir.

			-> Bu arada stackte aynı adreste tutulan 2 yapı(musteri1 ve musteri2), heapte musteri2'nin
			adresinde referans olarak tutuldu.(Yani aynı değeri/referansı tutmuş oldular.)
	    */
    }
}
