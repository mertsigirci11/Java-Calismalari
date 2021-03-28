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
    private String productCode;

    /*
        get: almak / getirmek anlamına gelir.
        set: kurmak / ayarlamak anlamına gelir. Değer atamaya yarar.

        get yazıp set yazmayınca o değişken "readonly" manasına gelir.
        set yazıp get yazmayınca o değişken "writeonly" manasına gelir.
    */



    public int getId()
    {
        return id;
    } //GETTER
    public void setId(int id)
    {
        this.id=id;
    } //SETTER

    public String getName()
    {
        return name;
    } //GETTER
    public void setName(String name)
    {
        this.name = name;
    } //SETTER

    public String getDescription()
    {
        return description;
    } //GETTER
    public void setDescription(String description)
    {
        this.description = description;
    } //SETTER

    public double getPrice()
    {
        return price;
    } //GETTER
    public void setPrice(double price)
    {
        this.price = price;
    } //SETTER

    public int getStockAmount()
    {
        return stockAmount;
    } //GETTER
    public void setStockAmount(int stockAmount)
    {
        this.stockAmount = stockAmount;
    } //SETTER

    public String getProductCode()
    {
        return name.substring(0,2) + id;
    } //READ-ONLY
}
