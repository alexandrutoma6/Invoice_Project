package ro.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String option;


        do{
            System.out.println();
            PrintOptions.printOption();
            System.out.println();
            option = read.nextLine();
            OptionSwitcher.choseOption(option);
            System.out.println();
        }while(option == "0");


    }

}