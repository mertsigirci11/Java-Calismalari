public class ProductManager
{
    public void Add(Product urun)
    {
        System.out.println("Ürün eklendi: " + urun.name);
    }

    //Çok hatalı bir kullanım
    public void Add2(int id, String name, String description, int stockAmount, double price)
    {

    }
}
