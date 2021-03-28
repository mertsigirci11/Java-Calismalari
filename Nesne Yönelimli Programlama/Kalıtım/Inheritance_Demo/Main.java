public class Main
{

    public static void main(String[] args)
    {
        /*
            Yazılımda en önemli olgu değişimdir.
            Yazdığımız programlar değişime direnmemelidir.
            Bizim işimiz müşterinin zamanla değişen taleplerine karşılık program yazmaktır.

            Bir class yalnızca bir klası miras alabilir.


        */

        OgretmenKrediYonetici o1=new OgretmenKrediYonetici();

        o1.Hesapla();

        KrediKullaniciArayuzu k1 = new KrediKullaniciArayuzu();
        k1.KrediHesapla(new TarimKrediYonetici());
        k1.KrediHesapla(new OgretmenKrediYonetici());

        /*
            Eğer KrediKullaniciArayuzu classındaki "KrediHesapla" metoduna "TemelKrediYonetici" türünden
            bir parametre atamasaydık. Yani onun yerine; tarım için ayrı, öğretmen için, x için
            ayrı metotlar yazmak zorunda kalacaktık. Ve bu da yukarıda belirttiğimiz değişim ifadesiyle
            çelişecekti.

            Ama biz biliyoruz ki classlar referans tiptir. Ve biz "KrediKullaniciArayuzu" classının
            "KrediHesapla" metoduna "TemelKrediYönetici" türünü parametre verdiğimiz için o türü
            miras alan sınıflar onun referansıyla çağrılır ve metotta kullanılabilir.

        */
    }
}
