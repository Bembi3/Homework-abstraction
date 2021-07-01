public class Main {
    public static void main(String[] args) {
        SupplierReader supplierReader = new SupplierReader("Иван");
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("Вася");

        supplierReader.bringBook(librarianAdmin);
        supplierReader.returnBook(librarianAdmin);

        librarianAdmin.orderBook(supplierReader);
        librarianAdmin.overdueNotification(supplierReader);
    }
}
