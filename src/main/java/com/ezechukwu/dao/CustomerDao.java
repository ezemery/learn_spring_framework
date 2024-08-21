package com.ezechukwu.dao;

import com.ezechukwu.model.Customer;

public interface CustomerDao {
    void createCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
