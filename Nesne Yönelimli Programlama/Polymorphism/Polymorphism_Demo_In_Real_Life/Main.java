public class Main
{

    public static void main(String[] args)
    {
        /*
            Polymorphism çok biçimlilik demektir. Yani aslına bakarsanız daha önce konuştuğumuz referans
            tiplerin birbirinin referansını tutması itibariyle olan durumdur. Tabi birbirinin derken
            aralarında bir kalıtım durumu varsa bribirlerinin referansını tutabilirler.
         */

        /*
         BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
         Yukarıdaki diziyi oluştururken hata almayız çünkü referansları aynıdır.

         int[] sayilar = new int[] {2,3,4,5,"sdfgnsdlgfns"};
         Yukarıdaki diziyi oluştururken hata alırız çünkü tipleri/referansları farklıdır(string != int).

            for (BaseLogger logger:loggers)
            {
                logger.Log("Log mesajı");
            }

            Çıktı olarak sırasıyla:
                Looged to file
                Logged to email
                Logged to database   çıktılarını alırız.
         */



        FileLogger f1 = new FileLogger();
        CustomerManager c1 = new CustomerManager(f1);
        c1.add();
        //VEYA
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}
