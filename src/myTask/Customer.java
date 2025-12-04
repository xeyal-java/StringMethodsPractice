package myTask;

public class Customer extends User {
    private String address;

    public Customer(int id, String name, String surname, String address) {
        super(id, name, surname);
        this.address = address;
    }
    public void showInfo() {
        System.out.println("Customer: " + getName() + "Surname: " + getSurname() + " | Address: " + address);
    }

}
