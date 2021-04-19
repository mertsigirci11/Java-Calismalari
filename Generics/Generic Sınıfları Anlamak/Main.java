import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        //Generic: Farklı tiplerle çalışmamızı sağlar.
        //Genericlere tip güvenli çalışma için ihtiyaç duyarız.
        //Biz generic'ler ile birbirine benzeyen operasyonları aynı tip güvenli bir şekilde aynı formatta yazmış oluruz.

        ArrayList sehirler = new ArrayList();  //Her türden veri tutar.
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add(1);
        sehirler.add(true);

        ArrayList<String> sehirler1 = new ArrayList<String>(); //Sadece string türden veri tutar.
        sehirler1.add("Sakarya");
        sehirler.add("Kocaeli");

        MyList<Double> fiyat = new MyList<Double>();
        fiyat.add(15.0000);
        fiyat.add(48.0000);

        MyList<Customer>  list = new MyList<Customer>();
        list.add(new Customer());
        list.add(new Customer());
    }
}
