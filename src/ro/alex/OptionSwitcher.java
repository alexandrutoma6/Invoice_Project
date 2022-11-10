package ro.alex;

import java.sql.SQLOutput;

public class OptionSwitcher {

    public static void choseOption(int option) throws Exception {
        switch (option){
            case 1:
                System.out.println("CREARE FACTURA");
                System.out.println();
                CreateInvoice.create();
                break;

            case 2:
                System.out.println("MODIFICARE FACTURA");
                System.out.println();
                ManageInvioces.printInvoices();
                System.out.print("Aleteti index-ul facrurii pe care doriti sa o modificati: ");
                int index = OptionReader.readInt();
                printArguments();
                System.out.println();
                System.out.print("Aleteti argumentul pe care vreti sa il modificati: ");
                int argument = OptionReader.readInt();
                argumentOption(index,argument);

                break;

            case 3:
                System.out.println("STERGERE FACTURA");
                System.out.println();
                System.out.println();
                ManageInvioces.printInvoices();
                System.out.print("Aleteti index-ul facrurii pe care doriti sa o stregeti: ");
                index = OptionReader.readInt();
                RemoveInvoice.invoiceRemove(index);
                System.out.println();
                System.out.println("FACUTRA STEARSA!");
                break;

            case 4:
                System.out.println("ADMINISTRARE FACTURI");
                ManageInvioces.printInvoices();
                System.out.println();
                break;

            case 0:
                System.out.println("EXIT!");
                break;
            default:
                System.out.print("ATI INTRODUS O VALOARE GRESITA!");



        }
    }

    public static void argumentOption(int index, int argument){
        switch (argument){
            case 1:
                System.out.print("New Serial Number : ");
                int x = OptionReader.readInt();
                ModifyInvoice.invoiceModify(index,x);
                System.out.println();
                System.out.println("FACTURA MODIFICATA!");
                System.out.println();
                break;

            case 2:
                System.out.print("New Company Name : ");
                String s = OptionReader.readString();
                ModifyInvoice.invoiceModify(index,s);
                System.out.println();
                System.out.println("FACTURA MODIFICATA!");
                System.out.println();
                break;
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
