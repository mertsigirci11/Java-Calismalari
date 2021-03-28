public class CustomerManager
{
    BaseDatabaseManager baseDatabaseManager;//BASE CLASS NESNESİ

    public void getCustomers()
    {
        /*
            OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
            oracleDatabaseManager.getData();

            => Eğer böyle yaptıysan geçmiş olsun. Artık bağımlısın demektir. Kodun değişebilir DEĞİL!!!
         */
        baseDatabaseManager.getData();
        /*
            Bu base class bizim stratejimiz görevini görür.
            Yani hangi veritabanı sistemini verirseniz onun "getData" metodu çalışacaktır.
         */

    }
}
