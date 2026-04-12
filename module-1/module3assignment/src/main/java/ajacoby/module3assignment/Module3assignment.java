

package ajacoby.module3assignment;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * Aidan Jacoby Module 3 Assignment
 */
public class Module3assignment {
    //Remove Dupe Method
    public static <Integer> ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        
        for (var i = 0; i < list.size(); i++) {
            int counter = 0;
            if (uniqueList.isEmpty()) {
            uniqueList.add(list.get((int) i));
            }
            for (var q = 0;  q < uniqueList.size(); q++) {
                if (list.get((int) i) == uniqueList.get((int) q) ) {
                    counter++;
                }
            }
            if (counter == 0) {
                uniqueList.add(list.get((int) i));
            }
        }
        return uniqueList;
    }    
    public static void main(String[] args) {
        Random rand = new Random();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            list.add(rand.nextInt(20));
        }
        System.out.println(removeDuplicates(list));
    }
}
