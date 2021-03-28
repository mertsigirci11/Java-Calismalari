public class OgrenciKrediManager extends BaseKrediManager
{
    public double hesapla(double tutar)
    {
        return tutar*1.10;
    }
    /*
        Görüldüğü üzere hesapla metodunu "OgrenciKrediManager" sınıfında override ettik.
        Eğer bir classın override edilmesini istemiyorsak "final" keywordunu kullanırız.

        public final double hesapla(double tutar)
        {
            return tutar*1.18;
        }
     */
}
