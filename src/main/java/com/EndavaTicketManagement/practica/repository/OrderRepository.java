package com.EndavaTicketManagement.practica.repository;
import com.EndavaTicketManagement.practica.repository.modelDBO.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class OrderRepository  {
    private List<Order> orders;

    public OrderRepository() {
        System.out.println("Creating OrderRepository");
        orders = new ArrayList<>();

    }

    public List<Order> getOrders(){
        return orders;
    }

    public Order getOrder(String id){
        Optional<Order> order = orders.stream().filter(a-> id.equals(a.getOrderId())).findFirst();
        if(order.isPresent()){
            return order.get();
        }
        return null;
    }


}
