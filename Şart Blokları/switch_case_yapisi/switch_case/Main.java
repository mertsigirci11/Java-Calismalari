public class Main {

    public static void main(String[] args) {
        char not = 'K';

        switch (not) {
            case 'A':
                System.out.println("PEKİYİ");
                break;
            case 'B':
                System.out.println("İYİ");
                break;
            case 'C':
                System.out.println("ORTA");
                break;
            case 'D':
                System.out.println("KÖTÜ");
                break;
            case 'F':
                System.out.println("Çok KÖTÜ");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");
        }
    }
}