public class InvoiceRepository {

    public void save(Invoice invoice) {
        System.out.println("Guardando factura de " + invoice.getCustomer());
    }
}
