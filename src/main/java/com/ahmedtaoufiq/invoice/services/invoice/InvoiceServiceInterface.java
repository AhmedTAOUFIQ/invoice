package com.ahmedtaoufiq.invoice.services.invoice;

import com.ahmedtaoufiq.invoice.entities.Invoice;

import java.time.LocalDate;
import java.util.List;

public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    List<Invoice> getAllByClientId (Long Id);
    List<Invoice> getAllDueDateBefore(LocalDate date);
    void deleteInvoiceById(Long id);
    Invoice findInvoiceById(Long id);
}
