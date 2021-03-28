public class Main
{

    public static void main(String[] args)
    {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        /*
            Bir üst satırdaki kod ile CustomerManager class'ındaki abstract class olan
            "BaseDatabaseManager" 'ın "baseDatabaseManager" nesnesinin referansına Oracle'ın
            referansını vermiş olduk.
         */
        customerManager.getCustomers();

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.baseDatabaseManager = new SqlServerDatabaseManager();
        /*
            Bir üst satırdaki kod ile CustomerManager class'ındaki abstract class olan
            "BaseDatabaseManager" 'ın "baseDatabaseManager" nesnesinin referansına SQL Server'ın
            referansını vermiş olduk.
         */
        customerManager1.getCustomers();

    }
}
