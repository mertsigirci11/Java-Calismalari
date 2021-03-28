import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Customer jan = new Customer(4,"Jan","Vesely");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(jan);
        customers.add(new Customer(1,"Mert","Sigirci"));
        customers.add(new Customer(2, "Murat", "Kir"));
        customers.add((new Customer(3,"Berke","Takkac")));

        customers.remove(1);

        for (Customer customer:customers)
        {
            System.out.println(customer.firstName);
        }
    }
}
