package ajacoby.module4assignment;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Aidan
 */
public class Module4assignment {

    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<Integer>();
        for (int i = 0; i < 500000; i++)
            ints.add(i);
        Iterator<Integer> it = ints.iterator();
        
        // 50k - 1.5 s
        //500k - 6.258 s
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        // 50k - 2.0 s
        // 500k - 1:50 min
        for (Integer i : ints) {
            System.out.println(ints.get(i));
        }
        /**Conclusion - Iterators are SUBSTANTIALLY faster than looping 
         * through an array manually, and it is even more obvious
         * the more objects that need to be looped through.  At 50k, the 
         * difference was marginal, only being about 30% slower, but at 
         * 500k it was very apparent.  the for loop started stalling out
         * and taking longer and longer to parse, while the iterator
         * kept its blazing pace all the way through.  There really was no
         * competition.  Iterator wins.
         */
    }
}
