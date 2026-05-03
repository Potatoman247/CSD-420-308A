package ajacoby.module8discussion;

import java.io.*;
import java.util.*;
/**
 *
 * @author Aidan
 */
class DiscThread extends Thread{
    @Override
    public void run(){
        String str = "Thread Running!";
        System.out.println(str);
    }
}

public class Module8discussion {

    public static void main(String[] args) {
        DiscThread t1 = new DiscThread();
        t1.start();
    }
}
