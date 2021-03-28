import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        /*

            İlkel veri tipi                Wrapper Class

            boolean ---------------------> Boolean
            char ------------------------> Char
            byte ------------------------> Byte
            short -----------------------> Short
            int -------------------------> Integer
            long ------------------------> Long
            float -----------------------> Float
            double ----------------------> Double
         */
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        //Autoboxing
        for (int i=0;i<10;i++)
        {
            integerArrayList.add(Integer.valueOf(i*4));
            /*
                Primitiv/ilkel veri tipi olan i'yi wrapper class cinsinde
                arraylist'e atıyoruz.
             */
        }

        //Unboxing
        for (int i=0;i<integerArrayList.size();i++)
        {
            System.out.println(integerArrayList.get(i).intValue());
            /*
                İlkel veri tipi olan i'yi
             */
        }


    }
}
