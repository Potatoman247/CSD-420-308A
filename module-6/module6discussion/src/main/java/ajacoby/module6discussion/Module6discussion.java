package ajacoby.module6discussion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Random;
/**
 *
 * Aidan Jacoby
 */
public class Module6discussion {

    public static void main(String[] args) {
        Random rand = new Random();
        
        ArrayList<Integer> someNumbers = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            someNumbers.add(rand.nextInt(20));
        }
        Collections.sort(someNumbers, (obj1, obj2) -> {
            Integer a = (Integer) obj1;
            Integer b = (Integer) obj2;
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;
        });
        for (Integer n : someNumbers){
        System.out.println(n);
        }
    }
}
