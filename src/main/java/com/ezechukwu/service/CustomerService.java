package com.ezechukwu.service;

import com.ezechukwu.model.Customer;
import com.framework.annotations.Component;

@Component
public interface CustomerService {
    void createCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
