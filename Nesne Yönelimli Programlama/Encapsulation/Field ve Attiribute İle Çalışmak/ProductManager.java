public class ProductManager
{
    public void Add(Product urun)
    {
        //JDBC kodları yazarak veritabanına kaydedicez.
        System.out.println("Ürün eklendi: " + urun.name);
    }
}
