package com.ezechukwu;

import com.ezechukwu.service.CustomerService;
import com.ezechukwu.model.Customer;
import com.framework.ApplicationContext;

public class SimpleSpringFramework {
    public static void main(String[] args){
        final String packageName = SimpleSpringFramework.class.getPackage().getName();
        System.out.println(SimpleSpringFramework.class +"-"+ packageName);
        final ApplicationContext applicationContext = new ApplicationContext(SimpleSpringFramework.class);
        final CustomerService customerService = applicationContext.getBean(CustomerService.class);
        customerService.createCustomer(new Customer());
    }

    //    private static CustomerService getProxyInstance() {
//        final CustomerDao customerDao = new CustomerDaoImpl();
//        return (CustomerService) Proxy.newProxyInstance(
//                SimpleSpring.class.getClassLoader(),
//                new Class[]{CustomerService.class},
//                new ProxyHandler(new CustomerServiceImpl(customerDao))
//        );
//    }
}
