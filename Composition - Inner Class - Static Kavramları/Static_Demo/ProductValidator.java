public class ProductValidator
{
    public static boolean isValid(Product product)
    {
        if (product.price>0 && !product.name.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public ProductValidator()
    {
        System.out.println("Yapıcı blok çalıştı");
    }
    /*
        "isValid()" statik metodunu "ProductManager" class'ında kullanmamıza rağmen
        constructor metot çalışmaz. Çünkü "ProductValidator" sınıfından bir nesne oluşturmadık.

        Ama biz static metot kullanıldığı andan itibaren çalışan bir metot yapmak istiyorsak;
                static
                {
                    //Gerekli kodlar
                }

                şeklinde statik kurucu metotlar hazırlayabiliriz. Birden fazla statik kurucu
                metot oluşturabiliriz/çalıştırabiliriz.
     */

    static { System.out.println("1. Statik Yapıcı Blok Çalıştı."); }
    static { System.out.println("2. Statik Yapıcı Blok Çalıştı."); }

    /*
    Bir class'ın içinde başka bir class oluşturursak, oluşturduğumuz o class'a "inner class" denir.
     */
    public static class BaskaBirClass
    {
        public static void sil()
        {

        }
    }
}
