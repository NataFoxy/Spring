package de.aittr.homework08052023.dataaccessobject;

import de.aittr.homework08052023.entity.Order;
import de.aittr.homework08052023.entity.User;


import java.util.ArrayList;
import java.util.List;

public class OrdersDAO {

    public List<Order> getOrders (){
        List<Order> ordersList = new ArrayList<>(
                List.of(
                        new Order(1, new User(11,"Ivan", "London"), "Tea"),
                        new Order(2, new User(22,"Mark", "Tallinn"), "Coffee"),
                        new Order(1, new User(11,"Ivan", "London"), "Cookies")
                )
        );
        return ordersList;
    }
}
