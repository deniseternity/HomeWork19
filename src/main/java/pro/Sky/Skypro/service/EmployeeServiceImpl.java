package pro.Sky.Skypro.service;

import org.springframework.stereotype.Service;
import pro.Sky.Skypro.exception.EmployeeAlreadyAddedException;
import pro.Sky.Skypro.exception.EmployeeAlreadyException;
import pro.Sky.Skypro.exception.EmployeeNotFoundException;
import pro.Sky.Skypro.model.Employee;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employees.containsKey(employee.getFullName())) {
                throw new EmployeeAlreadyAddedException();
            }

        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (!employees.containsKey(employee.getFullName())) {
                throw new EmployeeNotFoundException();
            }
        employees.remove(employee.getFullName());
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (!employees.containsKey(employee.getFullName())) {
                throw new EmployeeNotFoundException();
        }

        return employee;
    }

    @Override //ss
    public Collection<Employee> findAll() {
        return employees.values();
    }
}