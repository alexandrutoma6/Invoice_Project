package ro.alex;

public class OptionSwitcher {

    public static void choseOption(String option){
        switch (option){
            case "1": CreateInvoice.create();
            case "2":
            case "3":
            case "0":
                System.out.println("EXIT!");
        }
    }
}
