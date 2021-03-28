public class Main
{

    public static void main(String[] args)
    {
        /*
            Encapsulation, "kapsülleme" dediğimiz bir yöntemdir.
            Kullanıcı, herhangi bir alanı kullanırken kısıtlamasını sağlar.

        */
        Product urun1 = new Product();

            urun1.setName("Monster");
            urun1.setId(1);
            urun1.setStockAmount(6);
            urun1.setPrice(1290);
            urun1.setDescription("Gaming Laptop");

            System.out.println("Ürün kodu: " + urun1.getProductCode());

        ProductManager yonetici1 = new ProductManager();
        /*
            yonetici1.Add2(2, "", "", 2, 5000);
            yonetici1.Add2(3, "", "", 2, 5000);
            yonetici1.Add2(4, "", "", 2, 5000);
            yonetici1.Add2(5, "", "", 2, 5000);
            yonetici1.Add2(6, "", "", 2, 5000);
            yonetici1.Add2(7, "", "", 2, 5000);

            Diyelim ki bu işlemi 500 defa yaptık ve yeni bir özellik olan marka özelliğini ekledik.
            Bunu 500 işlemde yeniden yazmak zorunda kalacağız. Bu da yazılımcının işine oldukça uzatır,
            zaman kaybettirir. Bu hatalı bir yazımdır.
        */
        /*
            yonetici1.Add(urun1);

            Bu işlemi ise binlerce onbinlerce kez yazsak bile yazılımcının herhangi bir şeyi düzeltmesine
            gerek kalmaz. Bu doğru bir yaklaşımdır.
        */



    }
}
