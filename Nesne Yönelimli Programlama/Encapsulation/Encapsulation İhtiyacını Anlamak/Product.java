public class Product
{
    // Attiribute/Field
    /*
        Biz değişkenlerin önüne bir şey yazmadan int string gibi tanımlarsa bu default yani sistemin otomatik
        bir ataması olarak "public" şeklinde atama yapılır.

        public nedir? Bir değişkene her yer yerden erişimini sağlayabilmek demektir.

        Eğer önüne "private" yazarsak: Sadece tanımlandığı blokta geçerli olur anlamına gelir.
        Yani bir üstündeki süslü parantez neredeyse orada değer ataması yapılabilir demektir.
     */

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

}
