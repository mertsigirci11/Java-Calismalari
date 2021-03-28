public class Main
{

    public static void main(String[] args)
    {
        /*
            Encapsulation, "kapsülleme" dediğimiz bir yöntemdir.
            Kullanıcı, herhangi bir alanı kullanırken kısıtlamasını sağlar.

        */

        Product urun1 = new Product();

        /*
            urun1.name="Laptop";
            urun1.id=1;
            urun1.stockAmount=5;
            urun1.price=9900;
            urun1.description="Gaming Laptop";

            Böyle yazarsak, " 'x' has private access in 'Product' " hatasını alırız. Yani diyor ki:
            x alanı/fieldı/attiributeı Product sınıfının içinde private erişime sahiptir.

        */


        ProductManager yonetici1 = new ProductManager();

        /*
            Diyelim ki bu işlemi 500 defa yaptık ve yeni bir özellik olan marka özelliğini ekledik.
            Bunu 500 işlemde yeniden yazmak zorunda kalacağız. Bu da yazılımcının işine oldukça uzatır,
            zaman kaybettirir. Bu hatalı bir yazımdır.
        */
        yonetici1.Add2(2, "", "", 2, 5000);
        yonetici1.Add2(3, "", "", 2, 5000);
        yonetici1.Add2(4, "", "", 2, 5000);
        yonetici1.Add2(5, "", "", 2, 5000);
        yonetici1.Add2(6, "", "", 2, 5000);
        yonetici1.Add2(7, "", "", 2, 5000);

        //FAKAT
        /*
            Bu alttaki işlemi ise binlerce onbinlerce kez yazsak bile yazılımcının herhangi bir şeyi düzeltmesine
            gerek kalmaz. Bu doğru bir yaklaşımdır.
        */
        yonetici1.Add(urun1);



    }
}
