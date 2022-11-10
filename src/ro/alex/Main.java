package ro.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read= new Scanner(System.in);
        int option;


        do{
            System.out.println();
            PrintOptions.printOption();
            System.out.println();
            System.out.print(":-:  ");
            option = read.nextInt();
            OptionSwitcher.choseOption(option);
            System.out.println();
        }while(option != 0);


    }

}