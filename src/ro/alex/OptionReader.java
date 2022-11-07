package ro.alex;

import java.util.Scanner;

public class OptionReader {
    static Scanner read = new Scanner(System.in);
    public static int readInt() {

        System.out.println("-->:");
        return read.nextInt();
    }
    public static String readString(){
        System.out.print("-->:");
        return read.nextLine();
    }
}
