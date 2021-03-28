public class CustomerManager
{
    ICustomerDal customerDal; //Temel nesne
    public CustomerManager(ICustomerDal customerDal)
    {
        this.customerDal=customerDal;
    }
    public CustomerManager() {

    }
    public void add()
    {
        customerDal.add();
    }
}
