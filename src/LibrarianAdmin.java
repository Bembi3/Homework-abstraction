public class LibrarianAdmin extends User implements Librarian, Administrator {
    public LibrarianAdmin(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + getName() + " вынес предупреждение " + reader);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказал книги у  " + supplier);
    }

    @Override
    public void receiveBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " получил книги от  " + supplier);
    }
}
