package de.aittr.homework08052023.controllers;

import de.aittr.homework08052023.dataaccessobject.UsersDAO;
import de.aittr.homework08052023.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    private UsersDAO usersDAO = new UsersDAO();
    private List<User> users = usersDAO.getUsers();

    @GetMapping(value = "/users")
    public String usersList(Model model){
        model.addAttribute("users", users);

        return "users";
    }
}
