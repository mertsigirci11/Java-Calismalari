public class Main
{

    public static void main(String[] args)
    {
	    /*
	        Metotlarda aşırı yükleme nasıl yapılır?

	        Bir metot oluşturulduktan sonra aynı isimle bir tane daha veya birden fazla aynı isimde metot
	        oluşturulmasına "AŞIRI YÜKLEME" denir.

	        Yani metotları aşırı yüklediğimizde metotları birden fazla şekilde farklı çağırabiliriz.
	    */

        System.out.println("5 + 8 = " + toplama(5,8));
        System.out.println("5 + 8 + 13 = " + toplama(5,8,13));
        System.out.println("5 + 8 + 13 + 20 = " + toplama(5,8,13,20));
        System.out.println("5.4 + 8.9 = " + toplama(5.4,8.9));
        System.out.println("5.5 + 8.7 + 20.99 = " + toplama(5.5,8.7,20.99));

    }

    public static int toplama(int sayi1, int sayi2)
    {
        return sayi1 + sayi2;
    }

    public static int toplama(int sayi1, int sayi2, int sayi3)
    {
        return sayi1 + sayi2 + sayi3;
    }

    public static double toplama(double sayi1, double sayi2)
    {
        return sayi1 + sayi2;
    }

    public static int toplama(int... sayilar)
    {
        int toplam = 0;
        for (int sayi : sayilar)
        {
            toplam += sayi;
        }
        return toplam;
    }

    public static double toplama(double... sayilar)
    {
        double toplam = 0;
        for (double sayi : sayilar)
        {
            toplam += sayi;
        }
        return toplam;
    }

}
