public class Main
{

    public static void main(String[] args)
    {
        try
        {
            String a = null;
            System.out.println(a.hashCode());
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Referans Hatası...");
        }
        finally // finally bloğu hata oluşsa da oluşmasa da çalışır.
        {
            System.out.println("Finally Bloğu Çalışıyor");
        }
    }
}
