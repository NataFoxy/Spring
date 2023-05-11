package de.aittr.homework08052023.dataaccessobject;

import de.aittr.homework08052023.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {
    public List<User> getUsers(){
        List<User> list = new ArrayList<>(
                List.of(
                        new User(1,"Jack", "Berlin"),
                        new User(2,"Nick", "Paris"),
                        new User(3,"Anna", "Berlin"),
                        new User(4,"Olaf", "Oslo")
                )
        );
        return list;
    }
}
