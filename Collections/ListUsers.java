package Collections;

import Collections.Entities.User;

import java.util.ArrayList;
import java.util.List;

public class ListUsers {

    private List<User> userList;

    public ListUsers(List<User> userList) {
        this.userList = new ArrayList<>();
    }
    public void addUser(User user){
        userList.add(user);
    }

}
