package ObjectOrientedProgramming.SuperMarketSystem.Interfaces;

import ObjectOrientedProgramming.SuperMarketSystem.Entities.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeInterface {

    Employee addEmployee();
    Boolean deleteEmployee(UUID id);
    Employee updateEmployee(UUID id);
    Employee getEmployee(UUID id);
    List<Employee> getAllEmployees();
}

