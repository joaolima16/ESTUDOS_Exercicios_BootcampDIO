package Collections.MethodsOfList.App;

import java.util.Scanner;

import Collections.Entities.User;
import Collections.MethodsOfList.ListUsers;

public class Ex01 {
    public static void main(String[] args) {
        ListUsers lsUsers = new ListUsers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write want the quantity of users");
        int quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            lsUsers.addUser(new User("teste", "teste2"));
        }
        lsUsers.listUsers();
    }
}
