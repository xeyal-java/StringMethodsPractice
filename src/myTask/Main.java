package myTask;
import myTask.Customer;
import myTask.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<User> users = new ArrayList<>();

        users.add(new Admin(1,"Xeyal","Qasimov","Admin"));
        users.add(new Customer(2, "Veli", "veli@mail.com", "Baku"));
        users.add(new Customer(3, "Aysha", "aysha@mail.com", "Sumqayit"));

        // Polymorphism ilə məlumatı göstərmək
        for (User u : users) {
            u.showInfo();
        }
    }
}
