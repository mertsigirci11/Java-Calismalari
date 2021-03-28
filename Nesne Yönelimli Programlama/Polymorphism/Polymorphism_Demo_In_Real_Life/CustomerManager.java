public class CustomerManager
{
    private BaseLogger baseLogger; //TEMEL NESNE- BASE NESNE
    /*
        CustomerManager sınıfından oluşturulacak nesne yukarıda tanımladığımız "BaseLogger" sınıfının
        nesnesini parametre alarak "DatabaseLogger, FileLogger, EmailLogger" classlarını rahatça, kod
        tekrarı olmadan temiz bir şekilde kullanmamızı sağlar. Çünkü referanslarını tutuyor.
     */
    public CustomerManager(BaseLogger baseLogger)
    {
        this.baseLogger = baseLogger;
    }
    /*
        Private olarak tanımlanan temel nesne, constructor metodun içine tanımlanan nesneyi tutar.
     */

    public void add()
    {

        System.out.println("Müşteri Eklendi.");
        this.baseLogger.log();
        /*
            DatabaseLogger logger = new DatabaseLogger();
            logger.Log("Log mesajı");

            Temel nesneyi oluşturmayıp her class için ayrı ayrı böyle yapılsaydı kodun kalitesi
            azalırdı, değişime elverişli olmazdı, yazılan kodun satır sayısı artardı, okunabilirlik
            zorlaşırdı.
        */
    }
}
