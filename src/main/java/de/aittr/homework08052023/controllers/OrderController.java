package de.aittr.homework08052023.controllers;

import de.aittr.homework08052023.dataaccessobject.OrdersDAO;
import de.aittr.homework08052023.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OrderController {
    private OrdersDAO ordersDAO = new OrdersDAO();
    private List<Order> orders = ordersDAO.getOrders();

    @GetMapping (value = "/orders")
    public String orders(Model model){
        model.addAttribute("orders", orders);
        return "orders";
    }
}
