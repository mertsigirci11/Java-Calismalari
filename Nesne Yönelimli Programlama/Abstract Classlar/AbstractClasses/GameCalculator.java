public abstract class GameCalculator //BASE CLASS
{
    public abstract void hesapla();

    public final void gameOver()
    {
        System.out.println("Oyun bitti");
    }
    /*
        Bu durumda GameCalculator sınıfını kim kullanıyorsa:
        - "gameOver" metodunu değiştiremeden yani override edemeden kullanmak zorundadır.

        -Fakat "hesapla" metoduna gelince; kim "GameCalculator" metodunu kim implement ediyorsa yani kim
        inherit ediyorsa "hesapla" metodunu içermek zorundadır. Fakat "hesapla" 'yı override etmek
        zorundadır. Yani kendi "hesapla" 'sını yazmak zorundadır.
     */

    /*
        BİR SINIFIN ABSTRACT OLABİLMESİ İÇİN:
        -Class'ın erişim belirgeci ve isminin arasına "abstract class" imzası yazılması gerekir.

        BİR METODUN ABSTRACT OLABİLMESİ İÇİN:
        -Metodun erişim belirgeci ve tipiinin arasına "abstract" imzası yazılması gerekir.

        Abstract bir class'ta illa abstract bir metot olacak diye bir zorunluluk yoktur.

     */
}
