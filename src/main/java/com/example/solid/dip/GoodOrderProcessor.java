public class GoodOrderProcessor {
    private Database database;

    public GoodOrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder() {
        System.out.println("Procesando pedido...");
        database.saveOrder();
    }
}
