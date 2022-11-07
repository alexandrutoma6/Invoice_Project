package ro.alex;

public class OptionSwitcher {

    public static void choseOption(String option){
        switch (option){
            case "1": CreateInvoice.create();
            case "2":
                ManageInvioces.printInvoices();
                int index = OptionReader.readInt();
                printArguments();
                int argument = OptionReader.readInt();
            case "3":
            case "4": //ManageInvioces;
            case "0":
                System.out.println("EXIT!");
        }
    }

    public static void argumentOption(int index, int argument){
        switch (argument){
            case 1:
                System.out.print("New Serial Number : ");
                ModifyInvoice.invoiceModify(index,OptionReader.readInt());

            case 2:
                System.out.print("New Company Name : ");
                ModifyInvoice.invoiceModify(index,OptionReader.readString());
        }
    }

    public static void printArguments(){
        System.out.println();
        System.out.print("1.Serial Number ");
        System.out.print("2.Company Name ");
        System.out.print("3.Address ");
        System.out.print("4.Date ");
        System.out.print("5.Cif ");
        System.out.print("6.Invoice Total ");
    }
}
