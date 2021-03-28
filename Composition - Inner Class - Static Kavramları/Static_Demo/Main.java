public class Main
{

    public static void main(String[] args)
    {
        /*
            Static yapı şu anlama gelir:

                Örneğin biz bu main metodunu başka bir yerden çağırmaya çalışırsak
                hiçbir şekilde bunu new'leyerek  buna ulaşamayız. Onun yerine "main.main" diyerek
                ulaşabiliriz.

            SONUÇ: Bir metodu static yaptığımızda direkt class ismiyle çağırılabilir.
                   Mesela "ProductManager" class'ında kullandığımız "isValid()" metodu static olduğu
                   için direkt kendi sınıfının yani "ProductValidator" sınıfının adı ile çağırıldı.
         */

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name="Mouse";
        manager.add(product);

        DatabaseHelper.Connection.createConnection(); //Statik örnek => Connection, inner class'tır
        DatabaseHelper.Crud.update(); //Statik örnek => Crud, inner class'tır => update, statik metottur.



    }
}
