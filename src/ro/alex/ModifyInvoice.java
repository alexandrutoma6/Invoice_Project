package ro.alex;

import java.util.Date;

import static ro.alex.ManageInvioces.invoices;

public class ModifyInvoice {



    public static void invoiceModify(int index,String companyName) {
        Invoice returnInvoice = invoices.get(index);
        returnInvoice.companyName = companyName;
        invoices.remove(index);
        invoices.add(index,returnInvoice);
        }
    public static void invoiceModify(int index,int serialNumber) {
        Invoice returnInvoice = invoices.get(index);
        returnInvoice.serialNumber = serialNumber;
        invoices.remove(index);
        invoices.add(index,returnInvoice);
    }
    public static void invoiceModify(int index,Address address) {
        Invoice returnInvoice = invoices.get(index);
        returnInvoice.address = address;
        invoices.remove(index);
        invoices.add(index,returnInvoice);
    }
    public static void invoiceModify(int index, Date date) {
        Invoice returnInvoice = invoices.get(index);
        returnInvoice.date = date;
        invoices.remove(index);
        invoices.add(index,returnInvoice);
    }

//    public static void invoiceModify(int index,int cif) {
//        Invoice returnInvoice = invoices.get(index);
//        returnInvoice.cif = cif;
//        invoices.remove(index);
//        invoices.add(index,returnInvoice);
//    }

    public static void invoiceModify(int index,double invoiceTotal) {
        Invoice returnInvoice = invoices.get(index);
        returnInvoice.invoiceTotal = invoiceTotal;
        invoices.remove(index);
        invoices.add(index,returnInvoice);
    }
}
