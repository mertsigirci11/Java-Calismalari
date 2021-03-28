import java.util.Scanner;

public class Main
{
    public static void mekanKontrol(int yas)
    {
        if (yas<18)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println("Mekana hoşgeldiniz.");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı girin: ");
        int yas = scanner.nextInt();

        try {
            mekanKontrol(yas);
        }catch (Exception e) {
            System.out.println("Yaşınız mekana girmeye müsait değil.");
        }
    }
}
