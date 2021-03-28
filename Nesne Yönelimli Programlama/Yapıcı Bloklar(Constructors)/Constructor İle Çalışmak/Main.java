public class Main
{
    public static void main(String[] args)
    {
        Product urun1 = new Product();//Constructor metot çalışır.
        urun1.setName("Monster");
        urun1.setId(1);
        urun1.setStockAmount(6);
        urun1.setPrice(1290);
        urun1.setDescription("Gaming Laptop");

        System.out.println("*************************************");

        Product urun2 = new Product(2,"Televizyon", "Full HD", 7000, 4);

        System.out.println("urun1 isim: " + urun1.getName());
        System.out.println("urun1 id:" + urun1.getId());
        System.out.println("urun1 stok sayısı: " + urun1.getStockAmount());
        System.out.println("urun1 fiyatı: " + urun1.getPrice());
        System.out.println("urun1 açıklama: " + urun1.getDescription());

        System.out.println("*************************************");

        System.out.println("urun2 isim: " + urun2.getName());
        System.out.println("urun2 id:" + urun2.getId());
        System.out.println("urun2 stok sayısı: " + urun2.getStockAmount());
        System.out.println("urun2 fiyatı: " + urun2.getPrice());
        System.out.println("urun2 açıklama: " + urun2.getDescription());


    }
}
