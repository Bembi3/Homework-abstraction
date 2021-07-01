public class SupplierReader extends User implements Supplier, Reader {
    public SupplierReader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Читатель " + getName() + " взял почитать книгу у админа " + administrator);
}

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Читатель " + getName() + " вернул книгу админу " + administrator);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Поставщик " + getName() + " привез книги " + librarian);
    }
}