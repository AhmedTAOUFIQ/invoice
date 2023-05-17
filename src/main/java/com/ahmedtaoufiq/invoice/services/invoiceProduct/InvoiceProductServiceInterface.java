package com.ahmedtaoufiq.invoice.services.invoiceProduct;

import com.ahmedtaoufiq.invoice.entities.InvoiceProduct;

import java.util.List;

public interface InvoiceProductServiceInterface {
    InvoiceProduct create(InvoiceProduct invoiceProduct);
    InvoiceProduct getInvoiceProductByInvoiceIdAndProductId (Long invoiceId, Long productId);
    List<InvoiceProduct> getAllInvoiceProductsByInvoiceId(Long invoiceId);
    void deleteInvoiceProductByInvoiceIdAndProductId(Long invoiceId, Long productId);
}
