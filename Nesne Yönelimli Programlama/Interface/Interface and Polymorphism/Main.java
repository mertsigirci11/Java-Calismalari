public class Main
{

    public static void main(String[] args)
    {
        //2 şekilde yapabiliriz

        //1. Tür
        CustomerManager customerManager = new CustomerManager();
        /*
                customerManager.add(); böyle yazarsak

                Exception in thread "main" java.lang.NullPointerException:
                Cannot invoke "ICustomerDal.add()" because "this.customerDal" is null.

                Hatası alırız çünkü "CustomerManager" class'ında oluşturduğumuz temel interface
                nesnesine referans vermeden çalıştırdık.
         */
        customerManager.customerDal = new OracleCustomerDal();
        //Yukarıdaki kodda, temel interface nesnesine referans verdik.
        customerManager.add();

        //2. Tür
        CustomerManager customerManager1 = new CustomerManager(new MySqlCustomerDal());
        customerManager1.add();
        /*
            Eğer yukarıdaki gibi yapılacaksa CustomerManager class'ındaki temel nesneyi
            private yapmak daha makbuldür.
         */


    }
}
