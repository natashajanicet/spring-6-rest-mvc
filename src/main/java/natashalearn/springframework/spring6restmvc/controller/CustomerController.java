package natashalearn.springframework.spring6restmvc.controller;

import lombok.RequiredArgsConstructor;
import natashalearn.springframework.spring6restmvc.model.Customer;
import natashalearn.springframework.spring6restmvc.services.CustomerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> listCustomers() {
        return customerService.listCustomers();
    }

    @RequestMapping(value="/{customerId}")
    public Customer getCustomerById(@PathVariable UUID customerId) {
        return customerService.getCustomerById(customerId);
    }
}
