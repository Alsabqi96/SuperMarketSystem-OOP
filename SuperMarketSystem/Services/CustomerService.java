package ObjectOrientedProgramming.SuperMarketSystem.Services;

import ObjectOrientedProgramming.SuperMarketSystem.Entities.Customer;
import ObjectOrientedProgramming.SuperMarketSystem.Entities.Inventory;
import ObjectOrientedProgramming.SuperMarketSystem.Interfaces.CustomerInterface;
import ObjectOrientedProgramming.SuperMarketSystem.SuperMarketDriver;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class CustomerService implements CustomerInterface {

    static Scanner scanner = new Scanner(System.in);

    @Override
    public Customer addCustomer() {
        Customer customer = new Customer();
        System.out.println("Enter Customer Name:");
        customer.setName(scanner.nextLine());
        System.out.println("Enter Customer PhoneNumber");
        customer.setPhoneNumber(scanner.nextLine());
        customer.setId(UUID.randomUUID());
        customer.setLoyaltyPoints(0);
        SuperMarketDriver.mainCustomersList.add(customer);
        return customer;
    }

    @Override
    public Boolean deleteCustomer(UUID id) {
        List<Customer> listOfAllCustomers = SuperMarketDriver.mainCustomersList;
        for (Customer customerToDelete : listOfAllCustomers) {
            if (customerToDelete.getId().equals(id)) {
                listOfAllCustomers.remove(customerToDelete);
                SuperMarketDriver.mainCustomersList = listOfAllCustomers;
                System.out.println("Deleted Customer with id: " + id);
                System.out.println(customerToDelete.toString());
                return true;
            }
        }
        return false;
    }

    @Override
    public Customer updateCustomer(UUID id) {
        List<Customer> listOfAllCustomers = SuperMarketDriver.mainCustomersList;
        Customer customer = new Customer();
        for (Customer customerToUpdate : listOfAllCustomers) {
            if (customerToUpdate.getId().equals(id)) {
                customer = customerToUpdate;
                System.out.println("Enter customer's name: ");
                String customerName = scanner.nextLine();
                if(!customerToUpdate.getName().equals(customerName)){
                    customer.setName(customerName);
                }
                System.out.println("Enter customer's phone number: ");
                String phoneNumber = scanner.nextLine();
                if(!customerToUpdate.getPhoneNumber().equals(phoneNumber)){
                    customer.setPhoneNumber(phoneNumber);
                }
                System.out.println("Enter loyalty points: ");
                Integer loyaltyPoints = scanner.nextInt();
                if(!customerToUpdate.getLoyaltyPoints().equals(loyaltyPoints)){
                    customer.setLoyaltyPoints(loyaltyPoints);
                }
                listOfAllCustomers.remove(customerToUpdate);

                listOfAllCustomers.add(customer);
                SuperMarketDriver.mainCustomersList = listOfAllCustomers;
                System.out.println("Updated Customer with id: " + id);
                System.out.println(customer.toString());

            }
        }
        return customer;
    }

    @Override
    public Customer getCustomer(UUID id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Double getCustomerTotalAmount(UUID id) {
        return null;
    }
}

