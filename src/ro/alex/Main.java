package ro.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        PrintOptions.printOption();

        String option = read.nextLine();

        OptionSwitcher.choseOption(option);


    }

}