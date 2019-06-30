package helloworld.dataprovider.repository;

import helloworld.dataprovider.db.Database;
import helloworld.models.Invoice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public enum InvoiceRepositoryImpl implements InvoiceRepository {
    instance;

    @Override
    public List<Invoice> findAll() {
        List<Invoice> invoices = new ArrayList<>();

        try (Connection conn = Database.connection();
             PreparedStatement ps = conn.prepareStatement("select * from invoices limit 25")) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Invoice invoice = Invoice.builder()
                        .invoiceId(rs.getInt("invoice_id"))
                        .workOrderId(rs.getInt("work_order_id"))
                        .totalAmount(rs.getDouble("total_amount"))
                        .build();

                invoices.add(invoice);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invoices;
    }
}
