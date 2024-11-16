package ObjectOrientedProgramming.SuperMarketSystem;

import ObjectOrientedProgramming.SuperMarketSystem.Entities.Customer;
import ObjectOrientedProgramming.SuperMarketSystem.Entities.Employee;
import ObjectOrientedProgramming.SuperMarketSystem.Entities.Inventory;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketDriver {

    public static List<Customer> mainCustomersList = new ArrayList<>();
    public static List<Employee> employeeList = new ArrayList<>();
    public static Inventory inventory = new Inventory();

    public static void main(String[] args){
        System.out.println("Supermarket system");
    }
}

