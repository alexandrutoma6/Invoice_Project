package ro.alex;

import java.util.Date;
import java.util.Scanner;


import static ro.alex.ManageInvioces.invoices;

public class CreateInvoice {

    static int listIndex = 0;
    public static void create(){
        Scanner read = new Scanner(System.in);
        System.out.print("Company name = ");
        String companyName = read.nextLine();
        System.out.print("Serial number = ");
        int serialNumber = read.nextInt();
        System.out.println("ADDRESS:");
        Address address = Address.createAddress();
        System.out.println("DATE: ");
        System.out.print("Day = ");
        int day = read.nextInt();
        System.out.print("Month = ");
        int month = read.nextInt();
        System.out.print("Year = ");
        int year = read.nextInt();
        Date date = new Date(year,month,day);
        System.out.print("Cif = ");
        int cif = read.nextInt();
        System.out.print("Invoice total = ");
        double invoiceTotal = read.nextDouble();
        Invoice invoice1 = new Invoice(companyName,serialNumber,address,date,cif,invoiceTotal);
        invoice1.setIndex(listIndex);
        invoices.add(invoice1);
        listIndex++;
        System.out.println("INVOICE CREATED!");
    }
}
