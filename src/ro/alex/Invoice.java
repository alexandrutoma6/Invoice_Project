package ro.alex;

import java.util.Date;

public class Invoice {

    int serialNumber;
    String companyName;
    Address address;
    Date date;
    int cif;
    double invoiceTotal;

    public Invoice(String companyName, int serialNumber, Address address, Date date, int cif, double invoiceTotal ){
        this.companyName = companyName;
        this.serialNumber = serialNumber;
        this.address = address;
        this.date = date;
        this.cif = cif;
        this.invoiceTotal = invoiceTotal;
    }
}
