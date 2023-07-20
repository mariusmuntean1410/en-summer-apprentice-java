package com.EndavaTicketManagement.practica.repository;

import com.EndavaTicketManagement.practica.repository.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository implements CrudRepository <Customer, Long> {
    private List<Customer> customers;

    public CustomerRepository() {
        System.out.println("Creating Account Repository");
        customers = new ArrayList<>();


    }

    public List<Customer> getCustomers(){
        return customers;
    }

    public Customer getCustomer(String id){
        Optional<Customer> customer = customers.stream().filter(a-> id.equals(a.getCustomerId())).findFirst();
        if(customer.isPresent()){
            return customer.get();
        }
        return null;
    }

    @Override
    public <S extends Customer> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Customer> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Customer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Customer> findAll() {
        return null;
    }

    @Override
    public Iterable<Customer> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Customer> entities) {

    }

    @Override
    public void deleteAll() {

    }
}