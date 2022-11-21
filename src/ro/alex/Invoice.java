package ro.alex;

import java.util.Date;

public class Invoice {
    private int index;
    private final int serialNumber;
    String companyName;
    Address address;
    Date date;
    int cif;
    double invoiceTotal;

    public Invoice(String companyName, int serialNumber, Address address, Date date, int cif, double invoiceTotal) {
        this.companyName = companyName;
        this.serialNumber = serialNumber;
        this.address = address;
        this.date = date;
        this.cif = cif;
        this.invoiceTotal = invoiceTotal;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Invoice withSerialNumber(int newSerial) {
        return new Invoice(companyName, newSerial, address, date, cif, invoiceTotal);
    }

    public static void main(String[] args) {
        var invoice = new Invoice("Tora", 7776, null, new Date(), 1231, 1213);
        Invoice modifiedInvoice = invoice.withSerialNumber(9999);
        System.out.println(invoice);
        System.out.println(modifiedInvoice);

    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDate() {
        return date;
    }

    public int getCif() {
        return cif;
    }

    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "index=" + index +
                ", serialNumber=" + serialNumber +
                ", companyName='" + companyName + '\'' +
                ", address=" + address +
                ", date=" + date +
                ", cif=" + cif +
                ", invoiceTotal=" + invoiceTotal +
                '}';
    }
}
