package com.ahmedtaoufiq.invoice.services.invoiceProduct;

import com.ahmedtaoufiq.invoice.entities.InvoiceProduct;
import com.ahmedtaoufiq.invoice.repositories.InvoiceProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InvoiceProductService implements InvoiceProductServiceInterface{
    private  InvoiceProductRepository invoiceProductRepository;
    @Override
    public InvoiceProduct create(InvoiceProduct invoiceProduct) {
        return invoiceProductRepository.save(invoiceProduct);
    }

    @Override
    public InvoiceProduct getInvoiceProductByInvoiceIdAndProductId(Long invoiceId, Long productId) {
        return invoiceProductRepository.findInvoiceProductByInvoiceIdAndProductId(invoiceId,productId);
    }

    @Override
    public List<InvoiceProduct> getAllInvoiceProductsByInvoiceId(Long id) {
        return invoiceProductRepository.findAllByInvoiceId(id);
    }

    @Override
    public void deleteInvoiceProductByInvoiceIdAndProductId(Long invoiceId, Long productId) {
        invoiceProductRepository.deleteInvoiceProductByInvoiceIdAndProductId(invoiceId, productId);
    }
}
