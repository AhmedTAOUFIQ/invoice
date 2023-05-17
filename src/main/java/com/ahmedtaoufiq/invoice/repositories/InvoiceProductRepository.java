package com.ahmedtaoufiq.invoice.repositories;

import com.ahmedtaoufiq.invoice.entities.InvoiceProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceProductRepository extends JpaRepository<InvoiceProduct, Long> {
    List<InvoiceProduct> findAllByInvoiceId (Long invoiceId);
    InvoiceProduct findInvoiceProductByInvoiceIdAndProductId (Long InvoiceId, Long ProductId);
    void deleteInvoiceProductByInvoiceIdAndProductId(Long InvoiceId, Long ProductId);

}
