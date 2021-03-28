public class Main
{

    public static void main(String[] args)
    {
        Product urun1 = new Product();

        urun1.name = "Laptop";
        urun1.id = 1;
        urun1.description = "Lenovo Laptop";
        urun1.price = 6500;
        urun1.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(urun1);



    }
}
