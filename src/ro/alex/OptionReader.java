package ro.alex;

import java.util.Scanner;

public class OptionReader {
    static Scanner read = new Scanner(System.in);
    public static int readInt() {

        System.out.print("-->: ");
        return read.nextInt();
    }
    public static String readString(){
        System.out.print("-->: ");
        return read.next();
    }
    public static double readDouble(){
        System.out.print("-->: ");
        return read.nextDouble();
    }
}
