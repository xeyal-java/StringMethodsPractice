package myTask;

public class Admin extends User {

    private String role;

    public Admin(int id, String name, String surname, String role) {
        super(id, name, surname);
        this.role = role;
    }
    public void showInfo() {
        System.out.println("ID code: " + getId() + " Admin: " + getName() + ", Surname: " + getSurname() + "| Role: " + role);
    }
}
