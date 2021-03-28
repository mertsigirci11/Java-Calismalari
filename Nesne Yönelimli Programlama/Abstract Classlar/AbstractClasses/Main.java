public class Main
{// GameCalculator.java classında da notlar bulunnmakta. Oraya da muhakkak bak.

    public static void main(String[] args)
    {
        /*
            -Abstract sınıflar programalada çok önemli bir yere sahiptir.
            -Daha önceden öğrendiğimiz sınıflarla yapısal anlamda bir farkı yoktur.
            -Sadece kullanım farkı vardır.
            -Abstract sınıfları normal sınıflar gibi belli kurallardan geçirerek kullanabiliyoruz.
            -Örneğin bir class başka bir class ı kalıtım aldığında başka bir classı kalıtım alamıyordu.
                Dolayısıyla bir abstract class ı saddece bir class kalıtım alabilir veya bir abstract
                class yalnızca bir sınıfı kalıtım alabilir. Yani bir sınıf, bir başka sınıf ve
                abstract classı aynı anda kalıtım alamaz.
            -Fakat abstract sınıflarla ilgili diğer sınıflardan bir farkı, söz dizimidir(syntaxı).
                Bu da kullanım ihtiyaçlarından kaynaklanır.
         */

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        /*
            -Abstractlar biz base class'ı gizlemek istediğimiz zaman da kullanılabilir.

            GameCalculator gameCalculator = new GameCalculator();
            -Yukarıdaki gibi abstract sınıflar new'lenemez. Yani abstract sınıflardan nesne oluşturulamaz.
                Daha  doğrusu abstract sınıflardan nesne oluşturmak için her new dediğimizde içini
                doldurmamız gerekir. Bu işlemde oldukça saçma olur.
            -Abstract sınıflardan nesne oluşturmak makbul değildir.
         */

        GameCalculator gameCalculator = new WomanGameCalculator();
        /*
            Yukarıdaki gibi yapılırsa "GameCalculator" abstract classlı nesne "WomanGameCalculator" classının
            referansını almış olur.
        */
        gameCalculator.hesapla();
    }
}
