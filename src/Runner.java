import java.util.ArrayList;
import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        /*
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int i = 0; i < catList.size();i++)
        {
            System.out.println(catList.get(i).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat : catList)
        {
            System.out.println(cat.getName());
        }
        // COMPLETE ME: print each Cat’s name (a third
        // time!) using a while loop
        int i = 0;
        while (i < catList.size())
        {
            System.out.println(catList.get(i).getName());
            i++;
        }*/

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0, 1);
        ints.add(0, 2);
        ints.add(0, 3);
        ints.add(0, 4);
        ints.add(0, 5);
        ints.add(0, 6);

        ArrayList<Integer> newInts = new ArrayList<Integer>();

        // traverse the entire ints array backwards
        for (int i = ints.size() - 1; i >= 0; i--)
        {
            newInts.add(ints.get(i));
        }

        System.out.println(ints);
        System.out.println(newInts);


    }
}
