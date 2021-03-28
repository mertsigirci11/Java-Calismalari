public class CustomerManager
{
    ICustomerDal customerDal; //Temel nesne

    public void add()
    {
         //Buraya dal'ı kullanarak iş kodları yazılır.
         /*
                Eğer buraya,
                    OracleCustomerDal o1 = new OracleCustomerDal();  veya
                    MySqlCustomerDal m1 = new MySqlCustomerDal();
                yazılırsa GEÇMİŞ OLSUN artık BAĞIMLISIN!!
          */

        customerDal.add();
    }
}
