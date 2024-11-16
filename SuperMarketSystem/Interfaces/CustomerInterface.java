package ObjectOrientedProgramming.SuperMarketSystem.Interfaces;

import ObjectOrientedProgramming.SuperMarketSystem.Entities.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerInterface {

    Customer addCustomer();
    Boolean deleteCustomer(UUID id);
    Customer updateCustomer(UUID id);
    Customer getCustomer(UUID id);
    List<Customer> getAllCustomers();

    Double getCustomerTotalAmount(UUID id);
}

