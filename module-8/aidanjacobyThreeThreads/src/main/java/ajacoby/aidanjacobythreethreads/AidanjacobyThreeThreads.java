package ajacoby.aidanjacobythreethreads;
import java.io.*;
import java.util.*;
/**
 *
 * @author Aidan
 */
class MyThread extends Thread{
    private int task;
    
    MyThread(int task) {
        this.task = task;
    }
    public void run(){
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        
        if(task == 0) {
            for (int i = 0; i < 10000; i++) {
            System.out.print(chars.charAt(random.nextInt(chars.length())));
            }
        }
        if(task == 1) {
            for (int i = 0; i < 10000; i++) {
            System.out.print(specialChars.charAt(random.nextInt(specialChars.length())));
            }
        }
        if(task == 2) {
            for (int i = 0; i < 10000; i++) {
            System.out.print(random.nextInt(10));
            }
        }
    }
}


public class AidanjacobyThreeThreads {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(0));
        Thread t2 = new Thread(new MyThread(1));
        Thread t3 = new Thread(new MyThread(2));
        
        t1.start();
        t2.start();
        t3.start();
    }
}
