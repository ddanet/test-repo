package helloworld.dataprovider.repository;

import helloworld.models.Invoice;

import java.util.List;

public interface InvoiceRepository {

    List<Invoice> findAll();

}
