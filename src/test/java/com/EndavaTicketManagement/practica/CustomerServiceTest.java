package com.EndavaTicketManagement.practica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.EndavaTicketManagement.practica.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class CustomerServiceTest {
    @Mock
    private CustomerRepository customerRepoMock;

    private CustomerService customerService;

    @BeforeEach
    public void setup(){
        customerService = new CustomerService(customerRepoMock);
    }

    @Test
    public void testGetAccountNotExisting(){
        assertEquals("No information for this customer", customerService.getCustomer("0"));
    }
}
