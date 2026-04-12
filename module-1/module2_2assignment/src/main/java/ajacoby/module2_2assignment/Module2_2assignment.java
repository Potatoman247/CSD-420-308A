package ajacoby.module2_2assignment;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;


/**
 *
 * @author Aidan
 */
public class Module2_2assignment {

    public static void main(String[] args) {
        
        int[] intArray = {};
        double[] dblArray = {};
        
        for (int i =0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 101); }
        
        for (int i =0; i < dblArray.length; i++) {
            dblArray[i] = (Math.random() * 101); }
        
        File myObj = new File("datafile.dat");
        
        try {            
            if (myObj.createNewFile()) {           
                System.out.println("File created: " + myObj.getName());
                
                try {
                    FileWriter myWriter = new FileWriter("datafile.dat");
                    for (int i = 0; i < intArray.length; i++) {
                        myWriter.write(intArray[i] + " ");}
                    myWriter.write("\n");
                    for (int i = 0; i < dblArray.length; i++) {
                        myWriter.write(dblArray[i] + " ");}
                    myWriter.close();  // must close manually
                    System.out.println("Successfully wrote to the file.");
                        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            }
                } 
            else {
                System.out.println("File already exists.");
                try (FileWriter myWriter = new FileWriter("filename.txt", true)) {
                    myWriter.write("\nAppended text!");
                    System.out.println("Successfully appended to the file.");
                    } 
                catch (IOException e) {
                    System.out.println("An error occurred.");
    }
                }
            } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            }
        
        
        
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                }
            } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            }
    }
}
