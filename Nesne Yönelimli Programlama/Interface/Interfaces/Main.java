public class Main
{

    public static void main(String[] args)
    {
	    /*
	                                            GİRİŞ
	        Interface'ler o kadar önemli bir yere sahiptir ki özellikle uygulamalarda bağımlılığı
	        yönettiğimiz yapılardan bir tanesidir.

	        Daha önce biz temel class'lar ve abstract class'lar öğrendik. Bu ailenin bir diğer
	        üyesi de interface'lerdir. Yani en temel anlamda nesne yönelimli programlamanın
	        3 temel üyesi bunlardır. =>(Classlar, Abstract Classlar, Interfaceler)

                                                 TANIM
	        Class'lar ile abstract class'ları birbirine benzetmiş ve kullanım yerlerini söylemiştik.
	        Interface'lerde ise biraz daha farklı durum söz konusu. Interface'ler bir class kabul
	        edilmiyor. Ama interfaceler de aynı normal class'lar gibi veya abstract classlar gibi
	        referans tutabiliyorlar.

	        Class'larda tüm operasyonların tanımlanmış olması gerekiyordu. Yani bİz class'ların
	        içerisine örneğin metotları koyduğumuz zaman hepsinin içerisinde bir şeylerin
	        olması gerekiyordu. Abstract class'larda kimisi dolu kimisi boş olabilirdi, onu
	        inherit eden içini doldurmak zorundaydı. Interface'lerde ise tamamlanmamış operasyonlar
	        içeririz.

	        Class'lar; interface'leri, abstract class'lar gibi inherit etmez, "implemente" eder.
	        Bir class birden fazla interface'i implemente edebilir.

	        Interface'ler de abstract class'lar gibi new'lenemezler yani nesne oluşmaz

	                                         NEREDE KULLANILIR
	        Operasyonu implemente edilmesi istenen durumlarda yani operasyonu kim implemente edecekse
	        biz; o, onu ayrıca implemente etsin diyorsak o zaman interface'lerden yaralanıyoruz.

	        Katmanlar arası geçişlerde de kullanılır.

	     */
        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.add();

        CustomerManager customerManager = new CustomerManager();
        /*
                customerManager.add(); böyle yazarsak

                Exception in thread "main" java.lang.NullPointerException:
                Cannot invoke "ICustomerDal.add()" because "this.customerDal" is null.

                Hatası alırız çünkü "CustomerManager" class'ında oluşturduğumuz temel interface
                nesnesine referans vermeden çalıştırdık.
         */
        customerManager.customerDal = new OracleCustomerDal();
        /*
            Yukarıdaki kodda, temel interface nesnesine referans verdik.

         */
        customerManager.add();
    }
}
