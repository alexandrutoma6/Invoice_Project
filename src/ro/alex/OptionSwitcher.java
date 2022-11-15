package ro.alex;

import java.sql.SQLOutput;
import java.util.Date;

import static ro.alex.ManageInvioces.invoices;

public class OptionSwitcher {

    public static void choseOption(int option) throws Exception {
        switch (option){
            case 1:
                System.out.println("CREARE FACTURA");
                System.out.println();
                CreateInvoice.create();
                break;

            case 2:
                if(invoices.isEmpty())
                    System.out.println("NU EXISTA FACTURI");
                else {
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
                }
                break;

            case 3:
                if(invoices.isEmpty())
                    System.out.println("NU EXISTA FACTURI");
                else {
                    System.out.println("STERGERE FACTURA");
                    System.out.println();
                    System.out.println();
                    ManageInvioces.printInvoices();
                    System.out.print("Aleteti index-ul facrurii pe care doriti sa o stregeti: ");
                    int index = OptionReader.readInt();
                    RemoveInvoice.invoiceRemove(index);
                    System.out.println();
                    System.out.println("FACUTRA STEARSA!");
                }
                break;

            case 4:
                if(invoices.isEmpty())
                    System.out.println("NU EXISTA FACTURI");
                else {
                    System.out.println("ADMINISTRARE FACTURI");
                    ManageInvioces.printInvoices();
                    System.out.println();
                }
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

            case 3:
                System.out.print("New Address : ");
                Address adr = Address.createAddress();
                ModifyInvoice.invoiceModify(index,adr);
                System.out.println();
                System.out.println("FACTURA MODIFICATA!");
                System.out.println();
                break;

            case 4:
                System.out.println("New DATE : ");
                System.out.print("Day : ");
                int d = OptionReader.readInt();
                System.out.print("Month : ");
                int m = OptionReader.readInt();
                System.out.print("Year : ");
                int y = OptionReader.readInt();
                Date date = new Date(y,m,d);
                ModifyInvoice.invoiceModify(index,date);
                System.out.println();
                System.out.println("FACTURA MODIFICATA!");
                System.out.println();
                break;

            case 5:
                System.out.print("New CIF : ");
                int z = OptionReader.readInt();
                ModifyInvoice.invoiceModify(index,z,0);
                System.out.println();
                System.out.println("FACTURA MODIFICATA!");
                System.out.println();
                break;

            case 6:
                System.out.print("New Invoice Total : ");
                double doub = OptionReader.readDouble();
                ModifyInvoice.invoiceModify(index,doub);
                System.out.println();
                System.out.println("FACTURA MODIFICATA!");
                System.out.println();
                break;

            default:
                System.out.println("Error");
        }
    }

    public static void printArguments(){
        System.out.println();
        System.out.println("1.Serial Number ");
        System.out.println("2.Company Name ");
        System.out.println("3.Address ");
        System.out.println("4.Date ");
        System.out.println("5.Cif ");
        System.out.println("6.Invoice Total ");
    }
}
