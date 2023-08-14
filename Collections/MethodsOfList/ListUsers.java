package Collections.MethodsOfList;

import Collections.Entities.User;

import java.util.ArrayList;
import java.util.List;

public class ListUsers {

    private List<User> userList;

    public ListUsers() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void listUsers() {
     for(User users: userList ){
        System.out.println("Username: " + users.getName());
        System.out.println("Password: " + users.getPassword());
     }
    }
}
