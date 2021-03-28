public class Product
{
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String productCode;


    /*
        Constructor Metot: Yapıcı Metot anlamına gelir.
        Nesne üretilirken çalışan fonksiyondur.
     */

    /*
        Nesneyi oluştururken parametre girilmezse 1 numaralı kurucu metot çalışır.
        Lakin parametre girilirse 2 numaralı kurucu metot çalışır.
    */

    public Product() // numara : 1
    {
        System.out.println("Nesne oluşturuldu.");
    }

    //Metot Overloading oldu.
    public Product(int id, String name, String description, double price, int stockAmount) // numara : 2
    {
        System.out.println("Nesne oluşturuldu, özellikler atandı.");
        setId(id);
        setDescription(description);
        setName(name);
        setPrice(price);
        setStockAmount(stockAmount);

        /*
            VEYA ŞÖYLE DE YAZABİLİRDİK:

            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
            this.stockAmaount = stockAmount;
        */
    }


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
