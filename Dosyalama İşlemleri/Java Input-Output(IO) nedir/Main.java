public class Main
{

    public static void main(String[] args)
    {
        /*
            ----------------------------------Giriş------------------------------------------------------
            Java I/O, dosyalardan ve değişik kaynaklardan input almak ve dosyalara ve değişik
            kaynaklara output yazmak için bir API olarak bilinir.

            Input ve Output işlemlerini hızlandırmak için "Java streamleri" kullanılır. Java I/O API'sinin
            içinde input output işlemleri için onlarca sınıf bulunur.

            ---------------------------Stream Nedir?----------------------------------------------
            -Stream verilerin input ve output yoluyla Java projelerine aktığı bir veri dizisidir.
            Ve Java'da streamler verilerin byte(1 ve 0) halinde aktığı yapılardır.

            -Java'daki standart streamlerden bir tanesini aslında daha önce kullandık. Java'da hazır
            kullanmamız için oluşturulmuş 3 tane hazır stream bulunmaktadır.
                1. System.out: Standart output stream
                2. System.err: Standart error stream
                3. System.in: Standart input stream

            ----------------------------OutputStream Nedir?------------------------------------------
            -Java uygulamaları bir dosyaya, bir sockete ve bağlanmış bir aygıta veriyi Stream halinde
            yazmak (byte halinde 1 ve 0'lar ile) için OutputStream abstract class'ından türeyen
            bir alt sınıfı kullanır.

            -write() metodu: Belli bir byte dizisini veya tek bir byte'ı hedefe yazar.

            -flush() metodu: Herhangi bir bufferlanmış veri varsa bu metot sayesinde hemen
                             hedefe yazılmasını söylemiş oluruz.

            -close() metodu: OutputStream'i kapatır.

            -----------------------------InputStream Nedir?--------------------------------------
            -Java uygulamaları bir dosyadan, bir socketten ve bağlanmış bir aygıtan veriyi Stream
            halinde okumak (byte halinde 1 ve 0'lar ile) için InputStream abstract class'ından(soyut sınıf)
            türeyen bir alt sınıfı kullanır.

            -read() metodu: Kaynkatan bir sonraki byte'ı okur. Okuyacak herhangi bir
            byte yoksa -1 değeri döner.

            -available() metodu: Okunabilecek byte sayısını döner.

            -close() metodu: InputStream'i kapatır.
         */
    }
}
