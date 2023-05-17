package com.ahmedtaoufiq.invoice.services.invoice;

import com.ahmedtaoufiq.invoice.entities.Invoice;
import com.ahmedtaoufiq.invoice.repositories.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@AllArgsConstructor
public class InvoiceService implements InvoiceServiceInterface{
    private InvoiceRepository invoiceRepository;
    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> getAllByClientId(Long id) {
        return invoiceRepository.findAllByClientId(id);
    }

    @Override
    public List<Invoice> getAllDueDateBefore(LocalDate date) {
        return invoiceRepository.findAllByDueDateBefore(date);
    }

    @Override
    public void deleteInvoiceById(Long id) {
        invoiceRepository.deleteById(id);
    }

    @Override
    public Invoice findInvoiceById(Long id) {
        return invoiceRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find invoice with Id :" + id))
                ;
    }
}
