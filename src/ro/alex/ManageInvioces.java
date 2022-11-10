package ro.alex;

import java.util.ArrayList;
import java.util.List;

public class ManageInvioces {


    public static List<Invoice> invoices = new ArrayList<>();

    public static void printInvoices(){
        int x = 0;
        for (Invoice invoice : invoices) {
            System.out.println("------------------");
            System.out.println("INDEX : " + x);
            System.out.println();
            System.out.println(invoice.serialNumber);
            System.out.println(invoice.companyName);
            System.out.println(invoice.address);
            System.out.println(invoice.date);
            System.out.println(invoice.cif);
            System.out.println(invoice.invoiceTotal);
            System.out.println();
            System.out.println("------------------");
            System.out.println();
            x++;
        }
    }

}
