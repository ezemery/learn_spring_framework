package com.ezechukwu.service;
import com.ezechukwu.dao.CustomerDao;
import com.ezechukwu.model.Customer;
import com.framework.annotations.Autowired;
import com.framework.annotations.Component;
import com.framework.annotations.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class CustomerServiceImpl implements CustomerService{
    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private final CustomerDao customerDao;
    @Autowired
    public CustomerServiceImpl(final CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    @Transactional
    public void createCustomer(final Customer customer) {
        try {
            logger.info("SERVICE:   START - create customer");
            customerDao.createCustomer(customer);
            logger.info("SERVICE:   END - create customer");

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public void deleteCustomer(final Customer customer) {
        try {
            logger.info("SERVICE: START - update customer");
            customerDao.createCustomer(customer);
            logger.info("SERVICE: END - update customer");
        } catch (Exception e) {
            throw e;
        }
    }
}
