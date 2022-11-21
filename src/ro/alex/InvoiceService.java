package ro.alex;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
    private List<Invoice> invoices = new ArrayList<>();

    public void addInvoice(Invoice invoice) {

    }

    public void modify(int serial, Invoice newAddress) {
        Invoice oldInvoice = getBySerial(serial);
        removeBySerial(serial);
        if (newAddress.getAddress() != null) {
            oldInvoice = oldInvoice.setAddress(newAddress.getAddress());
        }

        if (newAddress.getDate() != null) {
            oldInvoice = oldInvoice.setDate(newAddress.getDate());
        }

        if (newAddress.getSerialNumber() != 0) {
            Invoice existingInvoice = getBySerial(newAddress.getSerialNumber());
            if (existingInvoice != null) {
                throw new IllegalArgumentException("Cannot have duplicate serials!");
            } else {
                oldInvoice = oldInvoice.setSerialNumber(newAddress.getSerialNumber());
            }
        }
    }

    private Invoice getBySerial(int serial) {
    }
}
